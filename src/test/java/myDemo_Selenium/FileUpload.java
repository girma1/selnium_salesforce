package myDemo_Selenium;

import org.openqa.selenium.By;



public class FileUpload extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();

		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")));
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		waitForPageElementToVisible(driver.findElement(By.id("logo")));
		Thread.sleep(5000);
		driver.findElement(By.id("logo")).sendKeys("C:\\Users\\ayagi\\Desktop\\colorado.jpg");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='bootbutton']")).click();
		Thread.sleep(5000);

	}

}
