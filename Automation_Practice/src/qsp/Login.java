//Login PPAC
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tip.admin.powerplatform.microsoft.com/");
		Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@name = 'loginfmt']")).sendKeys("vinayakk@hcl.com");
		driver.findElement( By.xpath("//input[@id=\"idSIButton9\"]")).click();
		Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@name = 'passwd']")).sendKeys("Devkidevi@2209");
		driver.findElement( By.xpath("//input[@id=\"idSIButton9\"]")).click();
		Thread.sleep(3000);
		driver.findElement( By.xpath("//input[@id=\"idSIButton9\"]")).click();
		String Title = driver.getTitle();
		System.out.println("Title-"+ Title);
		//driver.close();

	}

}
