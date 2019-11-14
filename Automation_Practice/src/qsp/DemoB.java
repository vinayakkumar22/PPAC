//Runtime Polymorphism in Selenium
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	public static void TestBrowser(WebDriver driver) {
		driver.manage().deleteAllCookies();
		driver.get("https://tip.admin.powerplatform.microsoft.com/");
			String URL = driver.getCurrentUrl();
		    System.out.println("Current URL:" + URL);
		    String Title = driver.getTitle();
		    System.out.println("Title:="+ Title) ;
		    String Source= driver.getPageSource();
		    System.out.println("Source: "+ Source);
		  //  driver.quit();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		TestBrowser(driver);
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		TestBrowser(driver1);
		
	}

}
