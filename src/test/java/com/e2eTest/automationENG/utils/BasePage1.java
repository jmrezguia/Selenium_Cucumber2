package com.e2eTest.automationENG.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains the declaration of the driver. and contains the
 * declaration of the logger.
 */
public class BasePage1 {

	protected WebDriver driver;

	/**
	 * Instanciation de base page.
	 * 
	 * @param driver
	 */
	public BasePage1(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
