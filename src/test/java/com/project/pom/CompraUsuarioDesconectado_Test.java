package com.project.pom;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompraUsuarioDesconectado_Test {
	private WebDriver driver;
	CompraUsurioDesconectadoPage compraUsurioDesconectadoPage;

	@Before
	public void setUp() throws Exception {
		compraUsurioDesconectadoPage = new CompraUsurioDesconectadoPage(driver);
		driver = compraUsurioDesconectadoPage.chromeDriverconeccion();
		compraUsurioDesconectadoPage.visit("http://www.automationpractice.pl");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		 driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		compraUsurioDesconectadoPage.CompraUsuarioDes();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		compraUsurioDesconectadoPage.InisioSesionUsuario();
		// driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Dresses");

	}

}
