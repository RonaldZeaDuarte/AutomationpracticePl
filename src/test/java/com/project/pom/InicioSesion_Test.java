package com.project.pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InicioSesion_Test {
	private WebDriver driver;
	InicioSecionPage inicioSecionPage;

	@Before
	public void setUp() throws Exception {
		inicioSecionPage = new  InicioSecionPage(driver);
		driver = inicioSecionPage.chromeDriverconeccion();
		inicioSecionPage.visit("http://www.automationpractice.pl");
		driver.manage().window().maximize();
		
		
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		inicioSecionPage.InisioSesionUsuario();
		
			
	}
	@Test
	public void testD() throws InterruptedException {
		inicioSecionPage.InisioSesionFallo();
		
			
	
	}
	
	
}
