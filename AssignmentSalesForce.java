package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSalesForce {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.findElement(By.name("UserFirstName")).sendKeys("Arun");
		driver.findElement(By.name("UserLastName")).sendKeys("Prakash");
		driver.findElement(By.name("UserEmail")).sendKeys("SeleniumTraining@TestLeaf.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select drpDwn1 = new Select(jobtitle);
		drpDwn1.selectByVisibleText("Operations Manager");
		
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select (employees);
		drpDwn2.selectByValue("75");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(country);
		drpDwn3.selectByIndex(8);
		
		driver.findElement(By.className("checkbox-ui")).click();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
	//	driver.close();
	}
}