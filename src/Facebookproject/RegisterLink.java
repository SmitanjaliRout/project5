package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterLink {

	public static void main(String[] args) {
		//To initialize Browser
				System.setProperty("webdriver.gecko.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("http://newtours.demoaut.com");
				driver.manage().window().maximize();
				
				//to collect all the links info
				List<WebElement>links= driver.findElements(By.tagName("a"));
				boolean myStatus=false;
				for(WebElement link: links) {
					if(link.getText().equalsIgnoreCase("Register")) {
						//to click on Register link
						link.click();
						myStatus= true;
						System.out.println("Expected link exist");
						break;
					}
				}
				
				if(myStatus==false) {
					System.out.println("Expected link doesn't exist");
				}

	}

}
