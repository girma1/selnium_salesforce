package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DesplayAndlayout {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		
		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		
		//Actions actions = BrowserUtility.driver();
		
		BrowserUtility.driver.findElement(By.id("//span[@class='accordionIcon expand_icon']"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("//span[@class='accordionIcon expand_icon']"))));
		BrowserUtility.driver.findElement(By.id("//span[@class='accordionIcon expand_icon']")).click();
		Thread.sleep(2000);
		
		
		//div[@id='DisplayAndLayout']//span[contains(@class,'accordionIcon expand_icon')]
		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();		
		
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
