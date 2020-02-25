package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec23inCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.justdial.com/Travel/Train-Booking");
		driver.manage().window().maximize();
		
		//to click on Departure field
		driver.findElement(By.id("departDate")).click();
		
		//to pause execution
		Thread.sleep(4000);
		
		//to select Dec 23rd
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr[4]/td[2]/a")).click();
		


	}

}
