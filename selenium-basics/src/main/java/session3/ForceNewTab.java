package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForceNewTab {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://demo.guru99.com/test/login.html";

		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement insurance = driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[2]/a"));
		//Actions action = new Actions(driver);
		//action.contextClick(insurance).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		insurance.sendKeys(Keys.chord(Keys.COMMAND, Keys.RETURN));
		//This, of course, has to be Keys.CONTROL on a PC. Keys.SHIFT gives a new window on either platform.
		Thread.sleep(5000);

	}

}
