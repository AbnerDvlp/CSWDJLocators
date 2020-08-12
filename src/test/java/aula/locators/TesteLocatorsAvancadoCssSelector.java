package aula.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocatorsAvancadoCssSelector {
	static WebDriver driver;

	public static void main(String[] args) {
		//testeCssSelectorClass();
		//testeCssSelectorId();
		testeCssSelectorAtributo();
	}

	public static void testeCssSelectorId() {

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		// sintaxe do css selector usando id
		driver.findElement(By.cssSelector("input#email")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("button#u_0_b")).click();

	}

	public static void testeCssSelectorClass() {

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		// sintaxe do css selector usando class
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("123456");
		driver.findElement(By.cssSelector("button#u_0_b")).click();

	}
	public static void testeCssSelectorAtributo() {

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		// sintaxe do css selector usando atributo
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[id=u_0_b]")).click();

	}
	
	public static void testeCssSelectorSubstring() {

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		// sintaxe do css selector usando substring
		driver.findElement(By.cssSelector("input[name^='email']")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input[name$='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[name*='login']")).click();

	}
}
