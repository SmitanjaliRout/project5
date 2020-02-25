package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apsrtc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\LiveTech Selenium Software\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		//to enter "NLR" in "From" dropdown
		driver.findElement(By.name("source")).sendKeys("NLR");
		
		//to pause execution
		Thread.sleep(5000);
		
		//to select value "BRAHMADEVI-NLR"
		driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();

	}

}
