	package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleprgrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		//create reference object for parent object for language links
		WebElement myLanguages= driver.findElement(By.id("SIvCob"));
		
		List<WebElement> links=myLanguages.findElements(By.tagName("a"));
		System.out.println("Number of language links are: "+links.size());

	}

}
