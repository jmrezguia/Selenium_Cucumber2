package com.e2eTest.automationENG.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import com.e2eTest.automationENG.page_objects.CustomersPage1;
import com.e2eTest.automationENG.utils.SeleniumUtils1;
import com.e2eTest.automationENG.utils.Setup1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersStepDefinition1 {

	private SeleniumUtils1 seleniumUtils;
	private CustomersPage1 customersPage;

	public CustomersStepDefinition1() {

		seleniumUtils = new SeleniumUtils1();
		customersPage = new CustomersPage1();
	}

	@Given("Je clique sur customers")
	public void jeCliqueSurCustomers() {
		seleniumUtils.click(CustomersPage1.getCustomers());

	}

	@When("Je clique sur le sous menu customers")
	public void jeCliqueSurLeSousMenuCustomers() {
		seleniumUtils.click(CustomersPage1.getCustomers1());
	}

	@When("Je clique sur le bouton add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CustomersPage1.getBtnAddNew());
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(CustomersPage1.getEmail(), email);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(CustomersPage1.getPassword(), password);
	}

	@When("Je saisis le prenom {string}")
	public void jeSaisisLePrenom(String firstname) {
		seleniumUtils.writeText(CustomersPage1.getFirstName(), firstname);
	}

	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String lastname) {
		seleniumUtils.writeText(CustomersPage1.getLastName(), lastname);
	}

	@When("Je coche sur l option feminin")
	public void jeCocheSurLOptionFeminin() {
		seleniumUtils.click(CustomersPage1.getFemale());
	}

	@When("Je saisis la date de naissance {string}")
	public void jeSaisisLaDateDeNaissance(String birth) {
		seleniumUtils.writeText(CustomersPage1.getDateOfBirth(), birth);
	}

	@When("Je selectionne le role {string} dans la liste deroulante")
	public void jeSelectionneLeRoleDansLaListeDeroulante(String optionText) {

		try {
			WebElement autoOptions = CustomersPage1.getCustomersRole();

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("Vendors"));
			for (WebElement option : optionsToSelect) {
				if (option.getText().equals(optionText)) {
					Setup1.getLogger().info("Trying to select: " + optionText);
					option.click();
					break;
				}
			}

		} catch (NoSuchElementException e) {
			Setup1.getLogger().info(e.getStackTrace());
		} catch (Exception e) {
			Setup1.getLogger().info(e.getStackTrace());
		}
	}

	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CustomersPage1.getBtnSave());

	}

	@Then("Je verifie que le nouveau client a ete ajoute {string}")
	public void jeVerifieQueLeNouveauClientAEteAjoute(String message) {
		String messageSucss = CustomersPage1.getMessage().getText();
		Assert.assertTrue(messageSucss.contains(message));

	}

}
