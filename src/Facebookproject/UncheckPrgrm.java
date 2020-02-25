package Facebookproject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckPrgrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MASTER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
        //collect all the checkboxes info
		List<WebElement> checks= driver.findElements(By.name("Checkbox"));
		System.out.println("Number of checkboxes are: "+checks.size());
		//verify checkbox is selected or not
				for(WebElement check: checks) {
				//select checkbox which are not selected
					if(check.isSelected()==false) {
						check.click();
					}
				}
		
	}

}
