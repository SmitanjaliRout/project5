package Facebookproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonfb {

	public static void main(String[] args) throws InterruptedException {
		
		//To initialize Browser
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\LiveTech Selenium Software\\Drivers\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//to collect radiobuttons info
				List<WebElement> radios=driver.findElements(By.className("_58mt"));
				System.out.println("Number of Radio buttons are: "+radios.size());
				
				//to select each radio button
				for(WebElement radio: radios) {
					System.out.println(radio.getText());
					radio.click();
				}
	}

}
