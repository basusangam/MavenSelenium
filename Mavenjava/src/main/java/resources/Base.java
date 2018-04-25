package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	
public WebDriver driver;
public Properties prop;
public WebDriver intializeDriver() throws IOException
{
	//chromes
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Raj\\Mavenjava\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
	}
	else if(browserName=="firefox") {
		System.setProperty("webdriver.firefox.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	else if(browserName=="IE")
	{
		System.setProperty("webdriver.InternetExplorer.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	
	
}

}
