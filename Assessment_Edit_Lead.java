package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment_Edit_Lead {

	public static void main(String[] args) {

		//For Setting up the environment
		WebDriverManager.chromedriver().setup();

		//Chrome Driver to for Talking to the Web Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Navigating to URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Entering Credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Clicking on the Button
		driver.findElement(By.className("decorativeSubmit")).click();

		//CLikcing on CRMSFA and then Clicking on Create Lead
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();


		//Entering the Details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Acc Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suresh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vig_Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample Description for Create Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");

		//Using Select Class to handle Dropdown
		Select stateDropDown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateDropDown.selectByVisibleText("New York");

		//Creating the Leads
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Resulting Page's title post editing the Leads is : "+driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();

		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Duplicate Lead Company");
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys("DL FIrst Name Updated");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Resulting Page's title post Duplicating the Leads is : "+driver.getTitle());

		//Killing the Driver
		driver.close();
	}
}