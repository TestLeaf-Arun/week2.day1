package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AssignmentOpenCart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("Arun Prakash");
		driver.findElement(By.id("input-firstname")).sendKeys("Arun");
		driver.findElement(By.id("input-lastname")).sendKeys("Prakash");
		driver.findElement(By.id("input-email")).sendKeys("LearnSelenium@TestLeaf.com");
		WebElement country = driver.findElement(By.id("input-country"));
		Select drpDwn = new Select(country);
		drpDwn.selectByVisibleText("Argentina");
		driver.findElement(By.id("input-password")).sendKeys("xxxxxxxx");
	//	driver.findElement(By.id("button-register")).click();
	}
}