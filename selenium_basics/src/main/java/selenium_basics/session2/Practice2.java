package selenium_basics.session2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://demoqa.com/automation-practice-form/";

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.id("firstName"));
		WebElement lname = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement phone = driver.findElement(By.id("userNumber"));
		WebElement subjects = driver.findElement(By.id("subjectsInput"));
		WebElement address = driver.findElement(By.id("currentAddress"));
		
		List<WebElement> gender = driver.findElements(By.name("gender"));
		
		WebElement hbSports = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement hbReading = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement hbMusic = driver.findElement(By.id("hobbies-checkbox-3"));
		
		WebElement submit = driver.findElement(By.id("submit"));
		
		fname.sendKeys("Mike");
		lname.sendKeys("Gaffney");;
		email.sendKeys("mike@example.com");
		gender.get(0).sendKeys(" ");
		phone.sendKeys("6128675309");
		subjects.sendKeys("Computer Science, Economics");
		hbReading.sendKeys(" ");
		hbMusic.sendKeys(" ");
		address.sendKeys("8902 Lakewood Drive");
		address.sendKeys(Keys.ENTER);
		address.sendKeys("Irving, TX 75063");
		address.sendKeys(Keys.ENTER);
		address.sendKeys("USA");
		
		Thread.sleep(2000);
		submit.sendKeys(" ");
	}

}
