package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToursLogin {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		WebElement uName = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("submit"));
		
		Thread.sleep(1000);
		uName.sendKeys("a");
		Thread.sleep(1000);
		password.sendKeys("a");
		Thread.sleep(1000);
		//submit.click();
		//submit.sendKeys(" ");
		uName.sendKeys("\n");
		//password.submit();
		

	}
}
