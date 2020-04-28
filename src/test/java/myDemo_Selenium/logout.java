package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class logout  {

	public static void main(String[] args) throws InterruptedException {


		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		

		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver, 40);
		
		Thread.sleep(5000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		wait1.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		

	}

}
