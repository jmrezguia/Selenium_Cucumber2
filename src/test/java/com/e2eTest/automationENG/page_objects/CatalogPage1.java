package com.e2eTest.automationENG.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automationENG.utils.BasePage1;
import com.e2eTest.automationENG.utils.Setup1;

public class CatalogPage1 extends BasePage1 {

	/* TC_01 searsh_product */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement catalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement products;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement searchProductName;

	@FindBy(how = How.ID, using = "SearchCategoryId")
	private static WebElement searchCategoryId;

	@FindBy(how = How.ID, using = "SearchIncludeSubCategories")
	private static WebElement searchIncludeSubCategories;

	@FindBy(how = How.ID, using = "SearchManufacturerId")
	private static WebElement searchManufacturerId;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement searchproducts;

	@FindBy(how = How.XPATH, using = "//td[normalize-space()='Nike Tailwind Loose Short-Sleeve Running Shirt']")
	private static WebElement nikeTailwind;

	/* TC_02 Add_a_new_category */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categories;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	private static WebElement btnAddNew;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement name;

	@FindBy(how = How.ID, using = "Description_ifr")
	private static WebElement iframe;

	@FindBy(how = How.ID, using = "tinymce")
	private static WebElement description;

	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement btnUpload;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;

	@FindBy(how = How.XPATH, using = "SearchCategoryName")
	private static WebElement searchCategoryName;

	@FindBy(how = How.XPATH, using = "//li[@class='qq-file-id-0 qq-upload-success']")
	private static WebElement uploadSuccess;

	/* TC_03 Add_a_new_manufacturer */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Manufacturers']")
	private static WebElement manufacturers;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	private static WebElement addNew1;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement name1;

	@FindBy(how = How.ID, using = "Description_ifr")
	private static WebElement ifram1;

	@FindBy(how = How.ID, using = "tinymce")
	private static WebElement description1;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave1;

	@FindBy(how = How.ID, using = "SearchManufacturerName")
	private static WebElement searchName1;

	@FindBy(how = How.ID, using = "SearchPublishedId")
	private static WebElement publishedId;

	@FindBy(how = How.ID, using = "search-manufacturers")
	private static WebElement btnSearch1;

	@FindBy(how = How.XPATH, using = "//div[@class = 'alert alert-success alert-dismissable']")
	private static WebElement successfully;

	public CatalogPage1() {
		super(Setup1.getDriver());
	}

	/* TC_01 searsh_product */
	public static WebElement getCatalog() {
		return catalog;
	}

	public static WebElement getProducts() {
		return products;
	}

	public static WebElement getSearchProductName() {
		return searchProductName;
	}

	public static WebElement getSearchCategoryId() {
		return searchCategoryId;
	}

	public static WebElement getSearchManufacturerId() {
		return searchManufacturerId;
	}

	public static WebElement getSearchIncludeSubCategories() {
		return searchIncludeSubCategories;
	}

	public static WebElement getBtnSearchproducts() {
		return searchproducts;
	}

	public static WebElement getNikeTailwind() {
		return nikeTailwind;
	}

	/* TC_02 Add_a_new_category */
	public static WebElement getCategories() {
		return categories;
	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getDescription() {
		return description;
	}

	public static WebElement getBtnUpload() {
		return btnUpload;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}

	public static WebElement getSearchCategoryName() {
		return searchCategoryName;
	}

	public static WebElement getUploadSuccess() {
		return uploadSuccess;
	}

	/* TC_03 Add_a_new_manufacturer */
	public static WebElement getManufacturers() {
		return manufacturers;
	}

	public static WebElement getAddnew1() {
		return addNew1;
	}

	public static WebElement getName1() {
		return name1;
	}

	public static WebElement getIfram1() {
		return ifram1;
	}

	public static WebElement getDescript() {
		return description1;
	}

	public static WebElement getBtnSave1() {
		return btnSave1;
	}

	public static WebElement getsearchName1() {
		return searchName1;
	}

	public static WebElement getPublishedId() {
		return publishedId;
	}

	public static WebElement getBtnSearch1() {
		return btnSearch1;
	}

	public static WebElement getSuccessfully() {
		return successfully;
	}

}
