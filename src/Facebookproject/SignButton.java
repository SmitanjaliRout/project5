package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignButton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnSignup=driver.findElement(By.name("websubmit"));
		String btnTxt =btnSignup.getText();
		System.out.println("visible text of button is :"+btnTxt);
		
		Thread.sleep(2000);
		String btnName=btnSignup.getAttribute("name");
		
		if(btnSignup.equals(btnName)) {
			System.out.println("object is Enabled");
			btnSignup.click();
		}
		else {
		System.out.println("object is disabled");
	}
			
		

	}
}

