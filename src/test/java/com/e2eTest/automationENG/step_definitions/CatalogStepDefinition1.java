package com.e2eTest.automationENG.step_definitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.NoAlertPresentException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.e2eTest.automationENG.page_objects.CatalogPage1;
import com.e2eTest.automationENG.utils.SeleniumUtils1;
import com.e2eTest.automationENG.utils.Setup1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition1 {

	private SeleniumUtils1 seleniumUtils;
	private CatalogPage1 catalogPage;

	public CatalogStepDefinition1() {

		seleniumUtils = new SeleniumUtils1();
		catalogPage = new CatalogPage1();

	}

	@When("Je clique sur catalog")
	public void jeCliqueSurCatalog() {
		seleniumUtils.click(CatalogPage1.getCatalog());

	}

	@When("Je clique sur l option products")
	public void jeCliqueSurLOptionProducts() {
		seleniumUtils.click(CatalogPage1.getProducts());

	}

	@When("Je saisis le nom de produit {string}")
	public void jeSaisisLeNomDeProduit(String name) {
		seleniumUtils.writeText(CatalogPage1.getSearchProductName(), name);

	}

	@When("Je choisis dans le categorie  l option d une valeur  {string}")
	public void jeChoisisDansLeCategorieLOptionDUneValeur(String optionText) {
		Select select = new Select(CatalogPage1.getSearchCategoryId());
		select.selectByValue(optionText);

	}

	@When("Je clique sur l option search")
	public void jeCliqueSurLOptionSearch() {
		seleniumUtils.click(CatalogPage1.getSearchIncludeSubCategories());

	}

	@When("Je choisis la marque de produit {string}")
	public void jeChoisisLaMarqueDeProduit(String text1) {
		By dropdownLocator = By.id("SearchManufacturerId");
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(text1);
	}

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(CatalogPage1.getBtnSearchproducts());

	}

	@Then("le produit affiche {string}")
	public void leProduitAffiche(String marque) {
		By elementLocator = By.xpath("//td[normalize-space()='Nike Tailwind Loose Short-Sleeve Running Shirt']");
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		String message = element.getText();
		Assert.assertEquals(message, marque);

	}

	/* TC_02 add_a_new_category */

	@When("Je clique sur le sous menu categories bouton")
	public void jeCliqueSurLeSousMenuCategoriesBouton() {
		seleniumUtils.click(CatalogPage1.getCategories());

	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CatalogPage1.getBtnAddNew());

	}

	@When("Je saisie le nom {string}")
	public void jeSaisieLeNom(String name) {
		seleniumUtils.writeText(CatalogPage1.getName(), name);

	}

	@When("Je passe à l iframe avec id {string} \"")
	public void jePasseÀLIframeAvecId(String idframe) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idframe)));
		Setup1.getDriver().switchTo().frame(iframe);

	}

	@When("Je saisie {string} dans le champ avec id {string}")
	public void jeSaisieDansLeChampAvecId(String text2, String champID) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement champText = wait.until(ExpectedConditions.elementToBeClickable(By.id(champID)));
		champText.clear();
		champText.sendKeys(text2);

	}

	@When("Je reviens au contenu principal1")
	public void jeReviensAuContenuPrincipal1() {
		Setup1.getDriver().switchTo().defaultContent();

	}

	@When("Je choisis un fichier pour Upload {string}")
	public void jeChoisisUnFichierPourUpload(String filePath) {
		CatalogPage1.getBtnUpload().sendKeys(filePath);

	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CatalogPage1.getBtnSave());

	}

	@When("J accepte l alerte")
	public void jAccepteLAlerte() {
		try {
			Alert alert = Setup1.getDriver().switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException();
		}
	}

	@When("Je cherche  le nom de produit {string} dans le champ avec l id {string}")
	public void jeChercheLeNomDeProduitDansLeChampAvecLId(String text3, String champID1) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement champtext1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(champID1)));
		champtext1.sendKeys(text3);
	}

	@Then("Je verifie que la nouvelle categorie a ete ajoute {string}")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoute(String messageverif) {
		String messageSuccessAdd = CatalogPage1.getSuccessfully().getText();
		Assert.assertTrue(messageSuccessAdd.contains(messageverif));

	}

	/* TC_03 Add_a_new_manufacturer */

	@When("Je clique sur le sous menu manufacturers")
	public void jeCliqueSurLeSousMenuManufacturers() {
		seleniumUtils.click(CatalogPage1.getManufacturers());

	}

	@When("Je clique sur le bouton addnew")
	public void jeCliqueSurLeBoutonAddnew() {
		seleniumUtils.click(CatalogPage1.getAddnew1());

	}

	@When("Je saisis le nom de fabricant {string}")
	public void jeSaisisLeNomDeFabricant(String name1) {
		seleniumUtils.writeText(CatalogPage1.getName1(), name1);

	}

	@When("Je passe a l iframe avec id1 {string}")
	public void jePasseALIframeAvecId1(String IDframe1) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement iframe1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(IDframe1)));
		Setup1.getDriver().switchTo().frame(iframe1);
	}

	@When("Je saisie {string} dans le champ avec id1 {string}")
	public void jeSaisieDansLeChampAvecId1(String text4, String champID2) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement champText2 = wait.until(ExpectedConditions.elementToBeClickable(By.id(champID2)));
		champText2.clear();
		champText2.sendKeys(text4);
	}

	@When("Je reviens au contenu principal")
	public void jeReviensAuContenuPrincipal() {
		Setup1.getDriver().switchTo().defaultContent();

	}

	@When("Je clique sur le bouton save1")
	public void jeCliqueSurLeBoutonSave1() {
		seleniumUtils.click(CatalogPage1.getBtnSave1());

	}

	@When("Je saisis dans la barre de recherche {string} dans le champ avec l id {string}")
	public void jeSaisisDansLaBarreDeRechercheDansLeChampAvecLId(String text5, String champID3) {
		WebDriverWait wait = new WebDriverWait(Setup1.getDriver(), Duration.ofSeconds(20));
		WebElement champText3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(champID3)));
		champText3.sendKeys(text5);

	}

	@When("Je selectionne l option d une valeur {string}")
	public void jeSelectionneLOptionDUneValeur(String value) {
		Select select = new Select(CatalogPage1.getPublishedId());
		select.selectByIndex(1);

	}

	@When("Je clique sur le bouton search1")
	public void jeCliqueSurLeBoutonSearch1() {
		seleniumUtils.click(CatalogPage1.getBtnSearch1());

	}

	@Then("Je devrais voir le message {string}")
	public void jeDevraisVoirLeMessage(String messageverif1) {
		String messageSuccessAdd1 = CatalogPage1.getSuccessfully().getText();
		Assert.assertTrue(messageSuccessAdd1.contains(messageverif1));

	}
}
