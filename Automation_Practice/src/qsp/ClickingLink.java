package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ClickingLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Vinayak/Documents/ClickingLink.html");
		//driver.findElement( By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
	    // driver.findElement(By.className("C1")).click();
		//driver.findElement(By.linkText("Google")).click();
		//driver.findElement(By.partialLinkText("Goo")).click();
		//driver.findElement(By.cssSelector("a[ id = \"a1\"]")).click();
		driver.findElement(By.xpath(".//a")).click();
	}

}
