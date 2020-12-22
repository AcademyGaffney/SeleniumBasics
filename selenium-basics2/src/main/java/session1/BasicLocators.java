package session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/ajax.html";
		driver.get(baseURL);
		
		WebElement yesButton = driver.findElement(By.id("yes"));
		yesButton.click();
		
		driver.findElement(By.id("buttoncheck")).click();
		
		WebElement output = driver.findElement(By.xpath("/html/body/div[2]/form/p[3]"));
		
		System.out.println(output.getText());

	}

}
