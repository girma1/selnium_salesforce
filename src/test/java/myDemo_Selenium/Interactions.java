package myDemo_Selenium;

import java.beans.Visibility;
import java.sql.Driver;
import java.util.jar.Attributes.Name;

import javax.swing.text.StyledEditorKit.UnderlineAction;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions {

	public static void main(String[] args) throws Exception {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
	
		
		/*
		 * Click on Display & Layout link and select Customize My Tabs link. 
		 * Select "Salesforce Chatter" option from custom App: drop down. 
		 * Select Reports tab from Available Tabs list. Click on >(Add) button. 
		 */
		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		Thread.sleep(2000);	
		
		BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font"))));
		BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font")).click();
		
		
		//span[@id='DisplayAndLayout_font']//span[@id='PersonalInfo_font']???
		/*
		 * clicked drop down  my setting profile 
		 */
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]"))));
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]")).click();
		
		//span[@id='LoginHistory_font']
		BrowserUtility.driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[@id='LoginHistory_font']"))));
		BrowserUtility.driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	
	//===========================================done with this=========================================================================
		//NOTE COPIED THIS CODE ONDESPLAYANDLAYOUT FOLDER
		
		BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"))));
		BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']")).click();
		Thread.sleep(2000);
		
		
		//div[@id='DisplayAndLayout']//span[contains(@class,'accordionIcon expand_icon')]
		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();		
		
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]"))));
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]")).click();
		
		//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]
		
		//about popout page clicked, have an isssue with exception NOSUCH/ also area selected by nature
		Thread.sleep(3000);
		BrowserUtility.driver.findElement(By.xpath("//li[@id='aboutTab']")).click();
		
//		// last name unable to change
//    	Thread.sleep(2000);
		
		

	}

}












//=====================++++++=======================================
//package myDemo_Selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class interactions  {
//	
//	public static void main(String args[]) throws Exception {
//	
//		BrowserUtility.lounchBrowser("ch");// this method called from browserutility file by using a classname
//		BrowserUtility.loginToBrowser();
//		// mousing-over Interactions and click
//		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
//	    WebDriverWait wait = new WebDriverWait(BrowserUtility.driver,  30);	
//	    wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]"))));
//		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop')]")).click();
//		// mousing-over Interactions and click buttons
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"))));
//		
//		// this Actions class help a mouseover pointing to, so first need get a web elment
//		WebElement element = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
//		Actions act = new Actions(BrowserUtility.driver);
//		// the act object ask to move the element which is mousehover
//		act.moveToElement(element).perform();
//		Thread.sleep(10000);
//		BrowserUtility.quitBrowser();
//	}
//
//}
