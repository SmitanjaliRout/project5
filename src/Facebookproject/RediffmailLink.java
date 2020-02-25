package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffmailLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		//to collect links from page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are: "+links.size());
		
		//to print links
		for(WebElement link: links) {
			System.out.println(link.getText());
		}

	}
}

