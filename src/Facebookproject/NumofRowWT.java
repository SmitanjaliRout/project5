package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumofRowWT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromer", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//create reference object for WebTable
		WebElement myTable=driver.findElement(By.id("customers"));
		
		//to find number of Rows in a Table
		List<WebElement> rows=myTable.findElements(By.tagName("tr"));
		System.out.println("Number of Rows are: "+rows.size());
			//to focus on each row
		for(WebElement row: rows) {
			//to find number of td tags in each row
			List<WebElement> tds=row.findElements(By.tagName("td"));
			System.out.println("Number of tds are: "+tds.size());
			//to focus on each td/cell
			for(WebElement td: tds) {
				//to read cell data
				System.out.println(td.getText());
				
			}
			System.out.println("**************");

	}

	}
}
