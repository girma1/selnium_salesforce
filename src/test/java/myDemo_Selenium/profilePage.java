package myDemo_Selenium;


import java.beans.Visibility;
import java.sql.Driver;

import javax.swing.text.StyledEditorKit.UnderlineAction;

import org.apache.commons.codec.language.Nysiis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class profilePage extends Interactions {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		//BrowserUtility.Interactions();
		
		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 30);
//		
	      
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(1000);
		
		BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
//		Thread.sleep(2000);
			
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		
		Thread.sleep(1000);
		BrowserUtility.driver.findElement(By.xpath("//input[@id='lastName']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@id='lastName']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kebede");
		
		
		
	
	  
//		WebDriverWait lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
//		lastName.sendKeys("Kebede");
	
		
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//div[2]/input[1][@id='lastName']"));
	    wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//div[2]/input[1][@id='lastName']"))));
		BrowserUtility.driver.findElement(By.xpath("//div[2]/input[1][@id='lastName']")).sendKeys("myG");
		
		//post tab on the asame page to write on textArea.
		BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).sendKeys("Hello i am Girma");
		
		//to post the text area permanently
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"))));
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		
		BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(element)driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();

	}

}
