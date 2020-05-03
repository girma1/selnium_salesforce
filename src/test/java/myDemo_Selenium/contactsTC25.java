package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactsTC25 {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);
		Thread.sleep(2000);
		//TC-25
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("kebede");
		
		Thread.sleep(2000);	
		BrowserUtility.driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("gir1");
		BrowserUtility.driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
	   //TC-26 
		
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(5000);
		
		//TC27-TC28
		BrowserUtility.driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("View Name");
		BrowserUtility.driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("View unique Name");
		BrowserUtility.driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		
		Thread.sleep(5000);
		
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();		
		BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']")).click();
		
		Thread.sleep(5000);
		
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();	
		System.out.println("done here");
		//BrowserUtility.driver.findElement(By.xpath("//tr[contains(@class,'dataRow even first highlight')]//a[contains(text(),'kebede')]")).click();
		Thread.sleep(5000); 
		//TC 30
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();	
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();	
		BrowserUtility.driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Unique Name : EFGH");
		BrowserUtility.driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		System.out.println("done here");
		
	    //TC-31
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();	
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(1000);
		BrowserUtility.driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("EFGH");
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//input[@id='devname']")).sendKeys(" ABCD");
		BrowserUtility.driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
		Thread.sleep(2000);
		//TC-32
		BrowserUtility.driver.findElement(By.xpath("//li[@id='Contact_Tab']")).click();	
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']")).click();
		BrowserUtility.driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("India");
		BrowserUtility.driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		
		BrowserUtility.driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
	}

}
