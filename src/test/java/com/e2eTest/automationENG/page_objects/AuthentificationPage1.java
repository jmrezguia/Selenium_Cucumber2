package com.e2eTest.automationENG.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automationENG.utils.BasePage1;
import com.e2eTest.automationENG.utils.Setup1;

public class AuthentificationPage1 extends BasePage1 {

	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	// @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	// private static WebElement captcha;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	private static WebElement dashboard;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogOut;

	public AuthentificationPage1() {
		super(Setup1.getDriver());

	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	// public static WebElement getCaptcha() {
	// return captcha;
	// }

	public static WebElement Dashboard() {
		return dashboard;
	}

	public static WebElement BtnLogOut() {
		return btnLogOut;
	}

}
