package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\LiveTech Selenium Software\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// to focus on "from" dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// to select "Goa(GOI)"
		driver.findElement(By.linkText("Goa (GOI)")).click();

	}

}

