package myDemo_Selenium;

public class SecurityXLS {

	public static void main(String[] args) {
		//Read excel data

		FileInputStream fi = new FileInputStream("//home//mstemp122//Auto_Input.xls");

		//Open Workbook

		Workbook w = Workbook.getWorkbook(fi);

		//Open sheet

		Sheet s = w.getSheet(0);

		for(int row =1; row < s.getRows(); row = row+1 )

		{

		int aa = s.getRows();

		System.out.println("Row Limit :"+aa);

		//Log in as an employee

		driver.get("https://login.salesforce.com");

		driver.manage().window().maximize();

		//Read username from excel file

		String username = s.getCell(1, row).getContents();

		System.out.println("username :"+username); driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(username);

		Thread.sleep(5000);

		//Read password from the Excel file

		String password = s.getCell(2, row).getContents();

		System.out.println("Password: "+password);

		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);

		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='Login']")).click();

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		String e = driver.findElement(By.id("tsidButton")).getText();

		Thread.sleep(1000);

		System.out.println("Current Application: " +e);

		}

	}

}
