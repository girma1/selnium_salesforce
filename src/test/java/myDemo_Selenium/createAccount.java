package myDemo_Selenium;

import java.sql.Driver;

import org.apache.poi.ss.formula.functions.Code;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Exit;



public class createAccount {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		//BrowserUtility.driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
	//1	BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();;
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);	
		
			/*
		 * Click on the New button to create new account New Account edit page is
		 * displayed. Enter <Account name> select type as Technology partner from drop
		 * down, set coustomer priority as high
		 */
		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']"))));
		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("GIRMA");
		Thread.sleep(2000);
		//select[@id='acc6']
		BrowserUtility.driver.findElement(By.xpath("//option[contains(text(),'Technology Partner')]")).click();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//select[@id='00N5w00000HWswU']")).sendKeys("High");
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(2000);
		
  	    BrowserUtility.driver.switchTo().frame("fname");  
  	    Thread.sleep(3000);
  	    
  	    BrowserUtility.driver.findElement(By.xpath("//input[@id='fname']']")).sendKeys("New View name");
  	    Thread.sleep(2000);
//  	  BrowserUtility.driver.findElement(By.xpath("//textarea[@id='aboutMe']")).sendKeys("Hello there! I found you");
// 	    
		
		BrowserUtility.driver.close(); //--> it will close the current window
		BrowserUtility.driver.quit();  //-->quit the browser also instance of the browser
		
		}

	}

