package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseURL = "http://jqueryui.com/droppable";

		driver.get(baseURL);
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions mover = new Actions(driver);
		
		//mover.dragAndDrop(source, destination).build().perform();
		/*mover.moveToElement(source)
			.clickAndHold()
			.moveToElement(destination)
			.release()
			.build()
			.perform();*/
		
		//mover.dragAndDropBy(source,  200, 50).build().perform();
		mover.moveToElement(source)
			.clickAndHold()
			.moveByOffset(200,  50)
			.release()
			.build()
			.perform();
		
		System.out.println(destination.getText());

	}

}
