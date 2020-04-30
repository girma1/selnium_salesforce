package myDemo_Selenium;


import java.awt.Frame;
import java.beans.Visibility;
import java.sql.Driver;

import javax.swing.text.StyledEditorKit.UnderlineAction;

import org.apache.commons.codec.language.Nysiis;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.SearchContext;
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
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);
//		
		
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(3000);
		
		//a[@id='moderatorMutton']// openning the arrowdown button
		BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
		Thread.sleep(2000);
		
		
		
			
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();
		
		 // **click on about tab due to already active by nature not need this code.**
    	  BrowserUtility.driver.switchTo().frame("aboutMeContentId");
    	  
    	  Thread.sleep(3000);
    	  BrowserUtility.driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Hello");
    	  Thread.sleep(2000);
    	  BrowserUtility.driver.findElement(By.xpath("//textarea[@id='aboutMe']")).sendKeys("Hello there! I found you");
   	      Thread.sleep(2000);
   	      BrowserUtility.driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		
		//post tab on the same page to write on textArea.
		BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).sendKeys("Hello i am Girma");
		Thread.sleep(3000);
		//to post the text area permanently
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		Thread.sleep(3000);
		BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		BrowserUtility.driver.findElement(By.xpath("//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("why again");
		Thread.sleep(3000);
		
		//input[@id='publishersharebutton']
		BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	
		

	}

}
