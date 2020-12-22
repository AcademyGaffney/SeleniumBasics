package session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RadioCheckActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/radio.html";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		List<WebElement> group = driver.findElements(By.name("webform"));
		
		Actions builder = new Actions(driver);
		
		Action doStuff = builder
				.moveToElement(group.get(0))
				.click()
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(" ")
				.keyDown(Keys.LEFT_SHIFT)
				.sendKeys(Keys.TAB)
				.keyUp(Keys.LEFT_SHIFT)
				.sendKeys(" ")
				.build();
		
		doStuff.perform();
		
		for(WebElement e : group) {
			System.out.println(e.getAttribute("value") + ": " + (e.isSelected() ? "Checked" : "Unchecked"));
		}

	}

}
