package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPage extends Base {
	// Localizadores pagina crear cuenta
	By registro = By.linkText("Sign in");
	By paginaAuthentication = By.xpath("//*[@id=\"center_column\"]/h1");
	By emailLoc = By.id("email");
	By password = By.id("passwd");
	By iniciosesionBtnLocator = By.xpath("//*[@id=\"SubmitLogin\"]/span");

	// compra localizadores
	By mycuenta = By.xpath("//*[@id=\"center_column\"]/h1");
	By btnDDresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	By btnprinDress = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
	By selecbtnColor = By.id("color_24");
	By btnAnadirCarro = By.cssSelector("#add_to_cart > button > span");
	By btnProced = By.linkText("Proceed to checkout");
	By btnCheckout = By.cssSelector(
			"#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
	By compañia = By.name("company");
	By direccion = By.name("address1");
	By direccionDos = By.name("address2");
	By ciudad = By.name("city");
	By selectEstado = By.name("id_state");
	By codPosta = By.name("postcode");
	By pais = By.id("id_country");
	By telefono = By.name("phone");
	By celular = By.name("phone_mobile");
	By informacionAdi = By.name("other");
	By direccionReferen = By.name("alias");
	By btnGuardar = By.cssSelector("#submitAddress > span");
	By btncheckputDos = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	By checkbox = By.name("cgv");
	By btncheckputTres = By.cssSelector("#form > p > button > span");
	By infoProdouto = By.xpath("//*[@id=\"product_4_43_0_4509\"]/td[2]/p/a");
	By btnPay = By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");

	By btnCofirmarPay = By.cssSelector("#cart_navigation > button > span");

	public CompraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void InisioSesionUsuario() throws InterruptedException {
		click(registro);
		Thread.sleep(200);
		if (isDisplayed(paginaAuthentication)) {
			type("lenovoinicion20@gmail.com", emailLoc);
			type("Jesus1234", password);
			click(iniciosesionBtnLocator);
		} else {
			System.out.print("No puede ingresar");
		}
	}

	// COMPRA
	public void CompraUsuario() throws InterruptedException {
		Thread.sleep(200);
		if (isDisplayed(mycuenta)) {

			click(btnDDresses);
			click(btnprinDress);
			Thread.sleep(200);
			click(selecbtnColor);
			Thread.sleep(2000);
			click(btnAnadirCarro);
			Thread.sleep(2000);
			click(btnProced);
			click(btnCheckout);
			type("Pruebas Ronald", compañia);
			type("Calle 56", direccion);
			type("Calle 57 a", direccionDos);
			type("Bogota", ciudad);
			type("Arizona", selectEstado);
			type("85001", codPosta);
			type("United States", pais);
			type("6587458", telefono);
			type("325478965", celular);
			type("Automatiozacion pruebas", informacionAdi);
			type("Bogota calle 45", direccionReferen);
			click(btnGuardar);
			Thread.sleep(2000);
			click(btncheckputDos);
			click(checkbox);
			click(btncheckputTres);
			click(btnPay);
			click(btnCofirmarPay);
		} else {
			System.out.print("No sepuede registrar infomacion");
		}

	}

}