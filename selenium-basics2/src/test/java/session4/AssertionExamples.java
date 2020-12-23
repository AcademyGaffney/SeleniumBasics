package session4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

class AssertionExamples {
	
	private static WebDriver driver;
	private static String baseURL = "http://demo.guru99.com/test/login.html";
	private WebElement email;
	private WebElement pword;
	private WebElement submit;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.get(baseURL);
		email = driver.findElement(By.id("email"));
		pword = driver.findElement(By.id("passwd"));
		submit = driver.findElement(By.id("SubmitLogin"));
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.manage().deleteAllCookies();
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testEquals() {
		String expected = "Password";
		String found = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/form/div/div[2]/label")).getText();
		assertEquals(expected, found);

	}

}
