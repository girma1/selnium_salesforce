package myDemo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolTip {

	public static void main(String[] args) {
		WebDriver driver = BrowserUtility.driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// this should lunch chrome browser
		driver.get("https://www.google.com");// this for only showing open known browser purpose	
		// maximize the window
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle().length());
		
		

	}

}
