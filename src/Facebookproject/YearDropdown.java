package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class YearDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//configure Select class to "Year" dropdown
		Select yearList=new Select(driver.findElement(By.id("year")));
		
		//to collect all the options from dropdown
		List<WebElement> options=yearList.getOptions();
		System.out.println("Number of options are: "+options.size());
		
		//to read each option value
		for(WebElement option: options) {
			System.out.println(option.getText());
		}	

	}

}
