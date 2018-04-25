package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	WebDriver driver;
By Searchfield=By.id("twotabsearchtextbox");
By Searchbut=By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");
public AmazonHomePage(WebDriver driver) {
	this.driver=driver;
}

public WebElement Search()
{
	return driver.findElement(Searchfield);
}
public WebElement SearchButton()
{
	return driver.findElement(Searchbut);
}


}
