package com.amazon.app;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AmazonHomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;



public class HomePage extends Base {
@BeforeTest
public void intialize() throws IOException
{
	
	driver=intializeDriver();
	
	
}
	
@Test(dataProvider="getdata")
public void basePageNavigation(String username,String password) throws IOException
{
	driver.get(prop.getProperty("url"));
	LandingPage l=new LandingPage(driver);
	l.getsignin().click();
	LoginPage lp=new LoginPage(driver);
	lp.username().sendKeys(username);
	lp.ContinueButton().click();
	lp.password().sendKeys(password);
	lp.signInSubmit().click();
	//AmazonHomePage Hp=new AmazonHomePage(driver);
	//Hp.Search().sendKeys("echodot2");
//	Hp.SearchButton().click();
	Actions action = new Actions(driver);
    action.moveToElement(l.getsignin()).build().perform();
    lp.signout().click();

}
@DataProvider
public  Object[][] getdata()
{
	Object [][] data=new Object[2][2];
	data[0][0]="basavaraj.sangam@gmail.com";
	data[0][1]="hhhh";
	data[1][0]="basavaraj.sangam@gmail.com";
	data[1][1]="gggg";	
	return data;
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}
