package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/login.html";

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pword = driver.findElement(By.id("passwd"));
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("LovesBirds12");
		Thread.sleep(1000);
		pword.sendKeys("BadPassword");
		Thread.sleep(1000);
		
		//There are multiple options for submitting a form with a standard submit behavior.
		
		//Click the submit button
		//submit.click();
		
		//use the form submit method on any form element
		//email.submit();
		//pword.submit();
		//submit.submit();
		
		//Hit "enter" on either field or the submit button
		//email.sendKeys(Keys.ENTER);
		pword.sendKeys(Keys.ENTER);
		//submit.sendKeys(Keys.ENTER);
		
		//tap spacebar on submit button
		//submit.sendKeys(" ");
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		//The page is newly loaded after back, so we need to re-fetch the element
		email = driver.findElement(By.id("email"));
		
		//Tabbing
		email.clear();
		email.sendKeys("kittykat");
		Thread.sleep(500);
		email.sendKeys(Keys.TAB);
		//switchTo() moves focus to something other than the main page the driver has loaded
		driver.switchTo().activeElement().sendKeys("l33tpword");
		driver.switchTo().activeElement().sendKeys(Keys.TAB); // move to lost password
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.TAB); // move to submit button
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(" "); //tap space bar
		
		
		
		
		
		
		


	}

}
