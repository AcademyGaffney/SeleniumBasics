package session3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAlert {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();          		
        driver.get("http://demo.guru99.com/test/delete_customer.php");	
        driver.manage().window().maximize();
        
        driver.findElement(By.name("cusid")).sendKeys("53920");	
        Thread.sleep(1000); 
        driver.findElement(By.name("submit")).submit();	
        Thread.sleep(1000); 
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        
        // Accepting alert		
        // alert.accept();	

        //Canceling alert
        alert.dismiss();

	}

}
