package com.e2eTest.automationENG.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automationENG.utils.BasePage1;
import com.e2eTest.automationENG.utils.Setup1;

public class CustomersPage1 extends BasePage1 {

	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement customers;

	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement customers1;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;

	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.ID, using = "FirstName")
	private static WebElement firstName;

	@FindBy(how = How.ID, using = "LastName")
	private static WebElement lastName;

	@FindBy(how = How.ID, using = "Gender_Female")
	private static WebElement female;

	@FindBy(how = How.ID, using = "DateOfBirth")
	private static WebElement dateOfBirth;

	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	private static WebElement customersRole;

	@FindBy(how = How.XPATH, using = "//button[@name='save']//i[@class='far fa-save']")
	private static WebElement btnSave;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement message;

	public CustomersPage1() {
		super(Setup1.getDriver());
	}

	public static WebElement getCustomers() {
		return customers;
	}

	public static WebElement getCustomers1() {
		return customers1;
	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getFemale() {
		return female;
	}

	public static WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public static WebElement getCustomersRole() {
		return customersRole;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}

	public static WebElement getMessage() {
		return message;
	}
}
