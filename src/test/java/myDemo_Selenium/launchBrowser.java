package myDemo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver(); //--> This should launch my chrome browser. Make sure chrome browser should be there in your machine
		//2.you have to navigate to some url --> www.google.com
		driver.get("https://www.google.com");
		
		//3. maximize your window
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait 30 seconds, 300 mille seconds
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("agirma@salesforce.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jt5f$a4R#");
		
		// click on Log In 
		wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//input[@id='Login']"))));
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    Thread.sleep(5000);
		 // forgot password
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='forgot_password_link']"))));
	    driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
	    driver.close(); //--> it will close the current window
		driver.quit();  //-->quit the browser also instance of the browser
		
	}

}
		//how to get the text in website
//		String sText=driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText();
//				System.out.println(sText);
//		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());
//		
//		
//		//Thread.sleep(10000);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
//		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
//		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("Alert")).click();
//		Thread.sleep(10000);
		//4. Close the browser
		
		
	

