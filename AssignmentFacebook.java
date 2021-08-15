package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("xxxxxxxx");
		
	//  Date of Birth	
		WebElement day = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select(day);
		drpDwn1.selectByIndex(15);
		
		WebElement month = driver.findElement(By.id("month"));
		Select drpDwn2 = new Select(month);
		drpDwn2.selectByValue("2");
		
		WebElement year = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select(year);
		drpDwn3.selectByVisibleText("2000");
		
	//	Gender - Select the Radio button [Female]
		driver.findElement(By.name("sex")).click();		
	}
}