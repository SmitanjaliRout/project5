package Facebookproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openFb {

	public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","D:\\Selenium\\LiveTech Selenium Software\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	

	}

}
