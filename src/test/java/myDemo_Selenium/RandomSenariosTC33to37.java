package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RandomSenariosTC33to37 {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		
		BrowserUtility.driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		
		BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font"));
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font"))));
		BrowserUtility.driver.findElement(By.xpath("PersonalInfo_font")).click();

	}

}
