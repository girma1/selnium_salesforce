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
	
		// after logged in to browser go userNavbutton click
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
		
		BrowserUtility.driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font'][contains(text(),'Personal Information')]"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("///span[@id='DisplayAndLayout_font'][contains(text(),'Personal Information')]"))));
		BrowserUtility.driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font'][contains(text(),'Personal Information')]")).click();
		
		
		//span[@id='DisplayAndLayout_font']
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
		
//		BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"));
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"))));
//		BrowserUtility.driver.findElement(By.id("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']")).click();
//		Thread.sleep(2000);
//		
//		
//		//div[@id='DisplayAndLayout']//span[contains(@class,'accordionIcon expand_icon')]
//		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"))));
//		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();		
//		
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]"))));
//		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]")).click();
//		
		//span[contains(@class,'itemCategory')][contains(text(),'Personal Information')]
		
		//about popout page clicked, have an isssue with exception NOSUCH/ also area selected by nature
//		Thread.sleep(3000);
//		BrowserUtility.driver.findElement(By.xpath("//li[@id='aboutTab']")).click();
		
//		// last name unable to change
//    	Thread.sleep(2000);
		
		

	}

}
//p[contains(text(),'Table')	
		
////		WebElement ele = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
//		wait.until(ExpectedConditions/VisibilityOf(BrowserUtility.driver.))
//		Thread.sleep(3000);
		
		//Actions act = new Actions(BrowserUtility.driver);
		//act.moveToElement(ele).build().perform();// ele referring to mouse element
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"))));
//		WebElement ele = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
//	
//		Thread.sleep(3000);
//		//****
//		// action class is nusseary inorder to do a mouse over, so we need creat an object and pass browserUtility.driver
//		Actions act = new Actions(BrowserUtility.driver);
//		act.moveToElement(ele).build().perform();// ele referring to mouse element
//		Thread.sleep(5000);
//		// calling quit browser from brwser page quitBrowser() method
//	    //====================DoubleClick======================================================================
//		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
//		//WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"))));		
//		
//		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
//		
//     	wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]"))));
////		
//     	BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]")).click();
//		Thread.sleep(2000);
//		
//		WebElement eleDoubleClick = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));		
//		Actions act1 = new Actions(BrowserUtility.driver);
//		act1.doubleClick(eleDoubleClick).build().perform();
//		Thread.sleep(10000);			
//		act1.doubleClick(eleDoubleClick).build().perform(); // =1-->3 -->5
//		Thread.sleep(1000);
//		act1.doubleClick(eleDoubleClick).build().perform();
//		Thread.sleep(1000);
//		act1.doubleClick(eleDoubleClick).build().perform();
//		Thread.sleep(10000);
//		BrowserUtility.quitBrowser();
		//How many of you know waht is bug?
		// i want you guys to address these kind of bugs or as an improvement
		// By emailing srinidhi.b@tekarch.com
		// Bug Found : Mar2020 		//Improvement Found : Mar2020   --> it will be easy for us to implemment better
		// maximum bug or improvements in that tool.
		
		/*
		 locators, waits, mouse hover, single click and double click

 Tables
		 * */














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
