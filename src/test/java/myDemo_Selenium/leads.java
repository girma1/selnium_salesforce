package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class leads {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);
		
		
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")).click();
       
		
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']"))));
		BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']")).click();
	
		
		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]")).click();
		
		BrowserUtility.driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
		
		BrowserUtility.driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")).click();
	  
		
		// logout
//		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
//		Thread.sleep(5000);
//		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
//		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
//		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}

}
