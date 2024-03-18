package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraUsurioDesconectadoPage extends Base {
	// Localizadores pagina inicio
	By imginicio = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a");
	By btnDDresses = By.linkText("Dresses");

	// Localizadores pagina inicio Sesion
	By registro = By.linkText("Sign in");
	By paginaAuthentication = By.cssSelector("#center_column > h1");
	By emailLoc = By.id("email");
	By password = By.id("passwd");
	By iniciosesionBtnLocator = By.xpath("//*[@id=\"SubmitLogin\"]/span");

	// compra localizadores
	By mycuenta = By.xpath("//*[@id=\"center_column\"]/h1");
	// By btnDDresses = By.linkText("Dresses");
	By btnprinDress = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
	By selecbtnColor = By.id("color_24");
	By btnAnadirCarro = By.cssSelector("#add_to_cart > button > span");
	By btnProced = By.linkText("Proceed to checkout");
	By btnCheckout = By.cssSelector(
			"#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
	By btncheckputDos = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	By checkbox = By.name("cgv");
	By btncheckputTres = By.cssSelector("#form > p > button > span");
	By infoProdouto = By.xpath("//*[@id=\"product_4_43_0_4509\"]/td[2]/p/a");
	By btnPay = By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");
	By btnCofirmarPay = By.cssSelector("#cart_navigation > button > span");

	public CompraUsurioDesconectadoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// COMPRA
	public void CompraUsuarioDes() throws InterruptedException {
		Thread.sleep(2000);
		click(imginicio);

		if (isDisplayed(imginicio)) {
			click(btnprinDress);
			Thread.sleep(200);
			click(selecbtnColor);
			Thread.sleep(2000);
			click(btnAnadirCarro);
			Thread.sleep(2000);
			click(btnProced);
			click(btnCheckout);
		} else {
			System.out.print("No ENCONTRO IMG");
		}

	}
  //inicio sesion
	public void InisioSesionUsuario() throws InterruptedException {
		Thread.sleep(200);
		if (isDisplayed(paginaAuthentication)) {
			type("lenovoinicion22@gmail.com", emailLoc);
			type("Jesus1234", password);
			click(iniciosesionBtnLocator);
			Thread.sleep(2000);
			click(btncheckputDos);
			click(checkbox);
			click(btncheckputTres);
			click(btnPay);
			click(btnCofirmarPay);
		} else {
			System.out.print("No puede ingresar");
		}
	}

}