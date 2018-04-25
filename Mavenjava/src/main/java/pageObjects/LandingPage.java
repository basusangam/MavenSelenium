package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin=By.xpath("//*[@id=\"nav-link-yourAccount\"]");
	By Title=By.xpath("//*[@id=\"navFooter\"]/table/tbody/tr/td[1]/div");
	By Headermenu=By.id("nav-xshop-container");		
		public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getsignin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	
	public WebElement headerMenuTitle()
	{
		return driver.findElement(Headermenu);
	}
	
}
