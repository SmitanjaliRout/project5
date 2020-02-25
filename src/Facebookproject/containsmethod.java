package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'account?')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]")).click();
		
	}

}
