package myDemo_Selenium;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



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
		
		
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']")).click();
		//=======>Advertisement is injected here
		
		// this is for pop up blocked but not working
//		Thread.sleep(2000);
//		BrowserUtility.driver.findElement(By.id("tryLexDialogX"));
//		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("tryLexDialogX"))));
//		BrowserUtility.driver.findElement(By.id("tryLexDialogX")).click();
		//((WebDriver) wait1).switchTo().alert().dismiss();
	
	
//		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
//		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']"))));
//		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
//		
//		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]"));
//		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]"))));
//		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
//		
		//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]
		
		}

	}

