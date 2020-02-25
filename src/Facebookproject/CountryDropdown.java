package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropdown {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\LiveTech Selenium Software\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("REGISTER")).click();
        Select countryList=new Select(driver.findElement(By.name("country")));
        countryList.selectByIndex(0);
        Thread.sleep(5000);
        countryList.selectByValue("16");
        Thread.sleep(5000);
        countryList.selectByVisibleText("INDIA");
	}

}
