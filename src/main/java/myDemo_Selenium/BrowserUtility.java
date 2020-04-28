package myDemo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static WebDriver driver = null;// this driver access by other class
	
	static void launchBrowser(String myBrowser){
		
		if(myBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(myBrowser.startsWith("e")) {
			WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			
			}		
		else {
			System.out.println("You have not given browser type correctly");
		}
		
		driver.manage().window().maximize(); 
		driver.get("https://www.salesforce.com/"); 
		
	}

	static void quitBrowser(){
		driver.quit();
	}
	static void loginToBrowser() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("agirma@salesforce.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jt5f$a4R#");
		
		// click on Log In 
		wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//input[@id='Login']"))));
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
		 
	}
	
	static void waitForPageElementToVisible(WebElement eleToWait) {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}

	 static void Interactions() {
		driver.quit();
		
	}
	 
	 static void logout() {
		 driver.quit();
	 }
}






















//=======================+++++===================================
//package myDemo_Selenium;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//// this class are created to reuse a browser utility from louncBrowser file
//public class BrowserUtility {
//	
//	public static WebDriver driver = null;
//	
//	static void lounchBrowser(String sBrowser) { // I will put on static because i am called this methods
//		
//		if(sBrowser.startsWith("ch")) {	
//		WebDriverManager.chromedriver().setup();
//		// to have a browser need setUp one property, Line number 16 is a little long way
//		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ayagi\\Desktop\\chromDriver_win32_2020\\chromedriver.exe");
//		driver = new ChromeDriver();// this should lunch chrome browse		
//		
//	}else {
//		System.out.println("youe haven't givin browser type correctly");
//	}
//	
//
//		// maximize the window
//	    	driver.manage().window().maximize();
//		
//		   driver.get("https://qa-tekarch.firebaseapp.com/");
//	}
//	
//	static void quitBrowser() {
//		driver.quit();
//	}
//	     static void loginToBrowser() {
//	    	 
//	    	    WebDriverWait wait = new WebDriverWait(driver,  30);	
//	    	    
//				WebElement email = driver.findElement(By.id("email_field"));
//				email.sendKeys("admin123@gmail.com");	
//				WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
//				password.sendKeys("admin123");				
//				   //------------------ login button clicked-----------------
//				WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
//				loginButton.click();
//				
//				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
//				
//				
//				
//	     }
//			
//	    
//	     
//	     
//	     
//}	





//						//---------------- accessing first name-------------------
//				WebElement Fname = driver.findElement(By.id("name"));
//				Fname.sendKeys("Girma");
//			   
//						//------------ accessing Last Name----------------------
//			    WebElement Lname = driver.findElement(By.xpath("//input[@id='lname']"));
//			    Lname.sendKeys("ayele");
//			  
//					    //------------------- Fill postal address----------------------
//				WebElement postalAddress = driver.findElement(By.id("postaladdress"));
//				postalAddress.sendKeys("1234 main st");
//				
//				      //-------------------- personal address fill---------------------
//				WebElement personalAddress = driver.findElement(By.id("personalAddress"));
//				personalAddress.sendKeys("1111 main st");
//			
//				
//					//---------------- radio Element----------------------
//				WebElement Sex_Female = driver.findElement(By.xpath("//span[2]//input[1]"));
//				System.out.println(Sex_Female.isEnabled());
//				Thread.sleep(1000);
//				Sex_Female.click();
//				
//				//============== select city===================
//				WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
//				Select dropDown1 = new Select(city);
//				dropDown1.selectByIndex(4);
//				
//				
//				// -------------course taken-----------------
//				WebElement Course = driver.findElement(By.xpath("//select[@id='course']"));
//				Select dropDown2 = new Select(Course);
//				dropDown2.selectByIndex(2);
//			
//				//-------------- District choosed----------------
//				WebElement District = driver.findElement(By.xpath("//select[@id='district']"));
//				Select dropDown3= new Select(District);
//				dropDown3.selectByIndex(3);
//				
//				//-------------------State chooses-----------------------
//				WebElement State = driver.findElement(By.xpath("//select[@id='state']"));
//				Select dropDown4= new Select(State);
//				dropDown4.selectByIndex(2);
//				
//				//------------- select PinCode------------------------
//				WebElement PinCode = driver.findElement(By.id("pincode"));
//				PinCode.sendKeys("777");
//				;
//				//--------- email-id--------------------
//				WebElement EmailAddress = driver.findElement(By.id("emailid"));
//				EmailAddress.sendKeys("stayonpath1@gmail.com");
//				
//				  //---------submit button --------
//				WebElement submitButton = driver.findElement(By.xpath("//button[@class='bootbutton']"));
//				submitButton.click();
//				
	      
   
        
     
	
