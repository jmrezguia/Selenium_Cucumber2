package com.e2eTest.automationENG.step_definitions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.e2eTest.automationENG.page_objects.AuthentificationPage1;
import com.e2eTest.automationENG.utils.ConfigFileReader1;
import com.e2eTest.automationENG.utils.SeleniumUtils1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition1 {

	private SeleniumUtils1 seleniumUtils;
	private AuthentificationPage1 authentificationPage;
	private ConfigFileReader1 configFileReader;

	public AuthentificationStepDefinition1() {

		seleniumUtils = new SeleniumUtils1();
		authentificationPage = new AuthentificationPage1();
		configFileReader = new ConfigFileReader1();

	}

	/* TC_01 valid */
	@Given("Je me connecte sur l application nopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce()  {
	
		seleniumUtils.get(configFileReader.getProperties("home.recette"));
		

	}

	@When("Je saisie l email {string}")
	public void jeSaisieLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage1.getEmail(), email);

	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		seleniumUtils.writeText(AuthentificationPage1.getPassword(), password);

	}

	@When("Je clique sur le bouton logIn")
	public void jeCliqueSurLeBoutonLogIn() {
		seleniumUtils.click(AuthentificationPage1.getBtnLogin());

	}

	// @When("Je resous le CAPTCHA")
	// public void jeResousLeCAPTCHA() {
	// WebElement captchaCheckbox = AuthentificationPage1.getCaptcha();
	// captchaCheckbox.click();
	// }

	@Then("Je redirige vers la page home {string}")
	public void jeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage1.Dashboard().getText();
		Assert.assertEquals(message, text);

	}

	/* TC_02 invalid */
	@Then("Je verifie le message d erreur {string}")
	public void jeVerifieLeMessageDErreur(String string) {

	}

	/* TC_02 logout */
	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogOut() {
		seleniumUtils.click(AuthentificationPage1.BtnLogOut());

	}
}
