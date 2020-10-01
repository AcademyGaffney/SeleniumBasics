package selenium_basics.session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

public class Practice1Improved {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cognizant.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		


		try {
			driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[3]/div/div/ul/li[1]/a")).click();
		} catch (ElementNotInteractableException e) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"bodyId\"]/div[1]/div/div[5]/div[4]/div/div/div[3]/div/div/div")).click();
			driver.findElement(By.xpath("//*[@id=\"offCanvasLeft\"]/div/ul/li[4]/div[1]/div/a")).click();
		}
		

		
		

	}

}
