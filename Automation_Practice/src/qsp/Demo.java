//Browser opening and closing
package qsp;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
    FirefoxDriver driver1 = new FirefoxDriver();	
    System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
    ChromeDriver driver2 = new ChromeDriver();
    driver1.quit();
    driver2.quit();
 }
}
