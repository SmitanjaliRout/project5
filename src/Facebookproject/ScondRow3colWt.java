package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScondRow3colWt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//to read 2nd row 3rd column celldata
		String cellData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(cellData);
        //String cellData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
        //System.out.println("cellData");
	}

}
