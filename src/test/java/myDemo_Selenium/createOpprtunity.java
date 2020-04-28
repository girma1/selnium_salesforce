package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class createOpprtunity {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		BrowserUtility.driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);
		
		//a[@class='listRelatedObject opportunityBlock title']
		Thread.sleep(5000);
		BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"))));
		BrowserUtility.driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		
		Thread.sleep(2000);
		
		//input[@id='opp17']
		BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']"))));
		BrowserUtility.driver.findElement(By.xpath("//select[@id='fcf']")).click();
		
		//input[@name='new']
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//input[@name='new']"))));
		BrowserUtility.driver.findElement(By.xpath("//input[@name='new']")).click();
		
		BrowserUtility.driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("");
		BrowserUtility.driver.findElement(By.tagName("#opp4")).sendKeys("Gname");
		BrowserUtility.driver.findElement(By.tagName("#opp4")).sendKeys("Gname");
		BrowserUtility.driver.findElement(By.tagName("//td[contains(text(),'28')]")).sendKeys("4/28/2020");
		BrowserUtility.driver.findElement(By.tagName("//option[contains(text(),'Qualification')]")).click();
		BrowserUtility.driver.findElement(By.tagName("//input[@id='opp17']")).sendKeys("none");
		
		BrowserUtility.driver.findElement(By.tagName("#opp12")).sendKeys("10");
		
	
		BrowserUtility.driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		//select[@id='quarter_q']
		BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']"))));
		BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']")).click();
		//select[@id='quarter_q']//option[3]
		
		BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]"))));
		BrowserUtility.driver.findElement(By.xpath("//select[@id='quarter_q']//option[3]")).click();
		
		
		BrowserUtility.driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]"))));
		BrowserUtility.driver.findElement(By.xpath("//table[contains(@class,'opportunitySummary')]//input[contains(@name,'go')]")).click();
	}

}
