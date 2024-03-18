package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Base {

	// Localizadores pagina crear cuenta
	By registro = By.linkText("Sign in");
	By paginaAuthentication = By.xpath("//*[@id=\"center_column\"]/h1");
	By emailLocator = By.id("email_create");
	By createBtnLocator = By.name("SubmitCreate");
	// By crearcuantaMessage = By.tagName("class");

	// localizadores Registro
	By crearUnaCuenta = By.xpath("//*[@id=\"authentication\"]");
	By radiBtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input");
	By nombre = By.id("customer_firstname");
	By apellido = By.id("customer_lastname");
	By correo = By.name("email");
	By contraseña = By.id("passwd");
	By selectDia = By.name("days");
	By selectDiaDos = By.name("months");
	By selectDiaTres = By.name("years");
	By crearBtncuenta = By.name("submitAccount");

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void RegistroUsuario() throws InterruptedException {
		click(registro);
		Thread.sleep(200);
		if (isDisplayed(paginaAuthentication)) {
			type("lenovoinicion22@gmail.com", emailLocator);
			click(createBtnLocator);
		} else {
			System.out.print("No sepuede abrir cuenta");
		}

	}

	public void InformacionUsuario() throws InterruptedException {
		Thread.sleep(200);
		if (isDisplayed(crearUnaCuenta)) {
			click(radiBtn);
			type("Jesus", nombre);
			type("Dias", apellido);
			type("", correo);
			type("Jesus1234", contraseña);
			type("15", selectDia);
			type("January", selectDiaDos);
			type("2023", selectDiaTres);
			click(crearBtncuenta);
		} else {
			System.out.print("No sepuede registrar infomacion");
		}

	}

}
