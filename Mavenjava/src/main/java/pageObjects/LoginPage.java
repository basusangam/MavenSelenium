package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	public WebDriver driver;
	By username=By.id("ap_email");
	By password=By.id("ap_password");
	By Continuebutton=By.id("continue");
	By signInSubmitButton=By.id("signInSubmit");
	By signoutlink=By.partialLinkText("? Sign Out");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement ContinueButton()
	{
		return driver.findElement(Continuebutton);
	}
	public WebElement signInSubmit()
	{
		return driver.findElement(signInSubmitButton);
	}
	public WebElement signout()
	{
		return driver.findElement(signoutlink);
	}
	}
