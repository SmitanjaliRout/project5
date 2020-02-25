package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthDropdown {

	public static void main(String[] args) {
		//To initialize Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				//to read selected value from "Month" dropdown
				Select monthList=new Select(driver.findElement(By.id("month")));
					
				String actValue=monthList.getFirstSelectedOption().getText();
				//to compare value
				if(actValue.equals("Jun")) {
					System.out.println("Expected month already selected");
				}
				else {
					monthList.selectByVisibleText("Jun");
					System.out.println("WD selected Required month");
				}


	}

}
