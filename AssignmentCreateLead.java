package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignmentCreateLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Propreitor");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("1/2/34");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("b");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome To TestLeaf");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Happy Learning Selenium");
				
		WebElement sourcedrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(sourcedrop);
		drpDwn1.selectByVisibleText("Cold Call");
		
		WebElement marketingdrop = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(marketingdrop);
		drpDwn2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement industrydrop = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn3 = new Select(industrydrop);
		drpDwn3.selectByIndex(2);
		
		WebElement currencydrop = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn4 = new Select(currencydrop);
		drpDwn4.selectByVisibleText("BHD - Bahrain Dinar");
		
		WebElement ownershipdrop = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn5 = new Select(ownershipdrop);
		drpDwn5.selectByVisibleText("Sole Proprietorship");
		
	//	Contact Information		
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rajesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JavaSelenium@TestLeaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("TestLeaf.com");
		
	//	Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("12,3rd Street, Travis Square");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Princeton, JCT");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New Jersey");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("08550");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("5325");
		
		WebElement statedrop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn6 = new Select(statedrop);
		drpDwn6.selectByVisibleText("New Jersey");
		
		WebElement countrydrop = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn7 = new Select(countrydrop);
		drpDwn7.selectByVisibleText("United States");

	//	Click Create Lead Button [Submit button]
		driver.findElement(By.name("submitButton")).click();
		
	//  Verify the Title of the resulting page
		String title ="View Lead | opentaps CRM";
		String Title = driver.getTitle();
		if (title.equals(Title)) {
			System.out.println("In the View Lead page");
		}	
		else
			System.out.println("Not in the View Lead page");		
	}
}