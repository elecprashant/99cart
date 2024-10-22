package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	static WebDriver driver;
	public WebDriver initBrowser()
	{		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
		 
		 return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
