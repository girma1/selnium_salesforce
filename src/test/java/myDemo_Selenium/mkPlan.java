package myDemo_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mkPlan {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.plar.eotcmk.org");
		driver.manage().window().maximize();
		

	}

}
