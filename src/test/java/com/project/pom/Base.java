package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;

	// contructor
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	//Para ejecutar con chrome
//	public WebDriver chromeDriverconeccion() {
//		System.setProperty("webDriver.chome.driver", "\\src\\test\\resources\\chromeDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		return driver;
//	}
	// Para ejecutar con adge
	public WebDriver chromeDriverconeccion() {
		System.setProperty("webdriver.adge.driver", "\\src\\test\\resources\\Webdriver adge\\msedgedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	// Comandos de selenium
	public WebElement findElenment(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}

}
