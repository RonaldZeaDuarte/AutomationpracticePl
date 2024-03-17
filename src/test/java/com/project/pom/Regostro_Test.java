package com.project.pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Regostro_Test {

	private WebDriver driver;
	RegisterPage registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverconeccion();
		registerPage.visit("http://www.automationpractice.pl");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		 driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.RegistroUsuario();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		registerPage.InformacionUsuario();

	}

}
