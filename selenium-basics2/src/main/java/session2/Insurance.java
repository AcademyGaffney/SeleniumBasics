package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insurance {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/insurance/v1/header.php";

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newquote")).click();
		
		WebElement incidents = driver.findElement(By.id("quotation_incidents"));
		WebElement registration = driver.findElement(By.id("quotation_vehicle_attributes_registration"));
		WebElement mileage = driver.findElement(By.id("quotation_vehicle_attributes_mileage"));
		WebElement value = driver.findElement(By.id("quotation_vehicle_attributes_value"));
		WebElement windscreenY = driver.findElement(By.id("quotation_windscreenrepair_t"));
		WebElement windscreenN = driver.findElement(By.id("quotation_windscreenrepair_f"));
		
		Select parking = new Select(driver.findElement(By.id("quotation_vehicle_attributes_parkinglocation")));
		Select year = new Select(driver.findElement(By.id("quotation_vehicle_attributes_policystart_1i")));
		Select month = new Select(driver.findElement(By.id("quotation_vehicle_attributes_policystart_2i")));
		Select date = new Select(driver.findElement(By.id("quotation_vehicle_attributes_policystart_3i")));
		Select bdCover = new Select(driver.findElement(By.id("quotation_breakdowncover")));
		
		WebElement calculate = driver.findElement(By.xpath("//*[@id=\"new_quotation\"]/div[8]/input[1]"));
		
		incidents.sendKeys("1");
		registration.sendKeys("8675309");
		mileage.sendKeys("8500");
		value.sendKeys("22000");
		windscreenY.click();
		
		parking.selectByValue("Driveway");
		year.selectByIndex(6);
		month.selectByVisibleText("May");
		date.selectByValue("1");
		bdCover.selectByVisibleText("European");

		calculate.click();
		
		WebElement quote = driver.findElement(By.id("calculatedpremium"));

		System.out.println(quote.getText());

		//driver.quit();

	}

}
