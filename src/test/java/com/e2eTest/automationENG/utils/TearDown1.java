package com.e2eTest.automationENG.utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown1 {

	/**
	 * This method is used to close browser. This method is called after the
	 * invocation of each test method in given class.
	 * 
	 * @After Methods annotated with @After execute after every scenario.
	 */
	@After
	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenShot = ((TakesScreenshot) Setup1.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "Screenshot: " + scenario.getName());
		}

	    //Setup.getDriver().quit();
		Setup1.getLogger().info("Scenario: " + scenario.getName() + " - finished.Status: " + scenario.getStatus());

	}

}


