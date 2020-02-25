package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CellData {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//create reference object for WebTable
		WebElement myTable=driver.findElement(By.id("customers"));
		
		//to read all the celldata from table
		List<WebElement> tds=myTable.findElements(By.tagName("td"));
		for(WebElement td: tds) {
			System.out.println(td.getText());
		}

	}

}
