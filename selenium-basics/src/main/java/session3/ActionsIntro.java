package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsIntro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/login.html";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		
		Actions builder = new Actions(driver);
		Action seriesOfSteps = builder
						.moveToElement(username)
						.click()
						.sendKeys("Mike42314")
						.sendKeys("\t")
						.keyDown(Keys.SHIFT)
						.sendKeys("myp")
						.keyUp(Keys.SHIFT)
						.sendKeys("assword2")
						.moveToElement(submit)
						.click()
						.build();
		
		seriesOfSteps.perform();


	}

}
