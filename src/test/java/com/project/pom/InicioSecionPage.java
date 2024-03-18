package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioSecionPage extends Base {
	// Localizadores pagina crear cuenta
	By registro = By.linkText("Sign in");
	By paginaAuthentication = By.xpath("//*[@id=\"center_column\"]/h1");
	By emailLoc = By.id("email");
	By password = By.id("passwd");
	By iniciosesionBtnLocator = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	
	public InicioSecionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void InisioSesionUsuario() throws InterruptedException {
		click(registro);
		Thread.sleep(200);
		if (isDisplayed(paginaAuthentication)) {
			type("lenovoinicion22@gmail.com", emailLoc);
			type("Jesus1234", password);
			click(iniciosesionBtnLocator);
		} else {
			System.out.print("No puede ingresar");
		}
	}

	public void InisioSesionFallo() throws InterruptedException {
		click(registro);
		Thread.sleep(200);
		if (isDisplayed(paginaAuthentication)) {
			type("lenovoinicion17@gmail.com", emailLoc);
			type("Jesus12345", password);
			click(iniciosesionBtnLocator);
		} else {
			System.out.print("No puede ingresar");
		}
	}

	
}