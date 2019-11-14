package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackwardForward {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://tip.admin.powerplatform.microsoft.com/");
		driver.get("https://www.makemytrip.com");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.close();
	}

}