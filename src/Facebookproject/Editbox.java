package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement UsernameText =driver.findElement(By.name("username"));
		UsernameText.sendKeys("Live");
		UsernameText.clear();
		UsernameText.sendKeys("Tech");
		String uid=UsernameText.getAttribute("value");
		if(uid.equals("Tech")) {
			System.out.println("Expected value dispalyed");
		}
		
		else {
			System.out.println("Actual value is :"+uid);
		}
		
		

	}
}


