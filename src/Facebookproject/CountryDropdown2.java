package Facebookproject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropdown2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required country name");
		String expCountry=sc.nextLine();
		
		//To initialize Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		//to click on "REGISTER"
		driver.findElement(By.linkText("REGISTER")).click();
		
		//to work on Country dropdown
		Select countryList=new Select(driver.findElement(By.name("country")));
		//to read all the options from Country dropdown
		List<WebElement> options=countryList.getOptions();
		System.out.println("Number of country names are: "+options.size());	
		
		boolean myStatus= false;
		//to read each value
		for(WebElement option: options) {
			String actValue=option.getText().trim();
			if(actValue.equalsIgnoreCase(expCountry)) {
				countryList.selectByVisibleText(actValue);
				System.out.println("Expected country name exist");
				myStatus= true;
				break;
			}
			
		}
		
		if(myStatus==false) {
			System.out.println("Expected country name doesn't exist");
		}


	}

}
