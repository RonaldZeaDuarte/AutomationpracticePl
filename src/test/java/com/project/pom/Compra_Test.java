package com.project.pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compra_Test {
	private WebDriver driver;
	CompraPage compraPage;

	@Before
	public void setUp() throws Exception {
		compraPage = new  CompraPage(driver);
		driver = compraPage.chromeDriverconeccion();
		compraPage.visit("http://www.automationpractice.pl");
		driver.manage().window().maximize();
		
		//para dar scroll
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		WebElement El1 = driver.findElement(By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[2]/a"));
//		WebElement El2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
//
//		js.executeScript("argument[0].scrollIntoView();, El1");
//		
//		El2.click();
//		
//		Thread.sleep(5000);
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		compraPage.InisioSesionUsuario();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		compraPage.CompraUsuario();
		
		
		
	}

	
	
	
	
}
