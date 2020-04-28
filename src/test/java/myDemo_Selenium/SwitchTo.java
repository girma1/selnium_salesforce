package myDemo_Selenium;

import javax.swing.JScrollBar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SwitchTo extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		
		//local webdriver i have created and i have replace the value of the browser instantiated driver objected to it
		
		WebDriver driver = BrowserUtility.driver;
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")));
		driver.findElement((By.xpath("(//button[contains(text(),'Window Alert')])[1]"))).click();
		Thread.sleep(2000);//--> Browser allows only one button  --> OK, cancel
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")));
		WebElement ele = driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);//developers 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]")).click();
		Thread.sleep(2000);
		quitBrowser();
		
		
	}

}




//====================++++=======================================

//package myDemo_Selenium;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class SwitchTo extends BrowserUtility{
//
//	public static void main(String[] args) {
//		lounchBrowser("ch");
//		loginToBrowser();
//		
//		WebDriver driver = BrowserUtility.driver;
//		waitForPageELementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
//		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
//		waitForPageELementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
//		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
//		waitForPageELementToVisible(driver.findElement(By.xpath("//div[contains(@class,'login')]//button[@class='bootbutton'][contains(text(),'Window Alert')]")));
//		driver.findElement(By.xpath("//div[contains(@class,'login')]//button[@class='bootbutton'][contains(text(),'Window Alert')]")).click();		
//		Thread.sleep(2000);
//		Alert aler = driver.switchTo().alert();
//		System.out.println(aler.getText());
//		aler.accept();
//		Thread.sleep(10000);
//		quitBrowser();
//	}
//
//}
