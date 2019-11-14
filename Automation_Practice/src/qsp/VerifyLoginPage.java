//Verify Login page is displayed or not.
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tip.admin.powerplatform.microsoft.com/");
		String Expected = "Power Platform admin center";
		String Actual = driver.getTitle();
		System.out.println("Title:"+ Actual);
		if(Actual.equals(Expected)) {
			System.out.println("Passed");
		}
        else{
        	System.out.println("Failed");
        }
		driver.quit();
	}

}
