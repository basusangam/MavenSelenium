package com.amazon.app;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateMenu  extends Base{
@BeforeTest
	public void intialize() throws IOException
	{
	
	driver=intializeDriver();
	driver.get(prop.getProperty("url"));
		
	}

@Test	
public void validateMenu() throws IOException
{
	LandingPage l=new LandingPage(driver);
	Assert.assertTrue(l.headerMenuTitle().isDisplayed());
}
@AfterTest
public void tearDown()
{
	driver.close();
}

}
