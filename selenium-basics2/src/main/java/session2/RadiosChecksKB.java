package session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiosChecksKB {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/radio.html";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		List<WebElement> group = driver.findElements(By.name("webform"));
		
		Thread.sleep(500);
		group.get(0).click();
		Thread.sleep(500);
		
		for(WebElement e : group) {
			System.out.println(e.getAttribute("value") + ": " + (e.isSelected() ? "Checked" : "Unchecked"));
		}
		
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		
		for(WebElement e : group) {
			System.out.println(e.getAttribute("value") + ": " + (e.isSelected() ? "Checked" : "Unchecked"));
		}
		
		driver.switchTo().activeElement().sendKeys("\t");
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(" ");
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.LEFT_SHIFT, Keys.TAB));
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(" ");
		
		for(WebElement e : group) {
			System.out.println(e.getAttribute("value") + ": " + (e.isSelected() ? "Checked" : "Unchecked"));
		}
	}

}
