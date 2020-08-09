package aula.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		// testeFacebook();
		// testeTagEClass();
		//testeClassEName();
		testeText();
	}

	public static void testeFacebook() {
		// seta o driver a ser usado
		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\firefox\\027\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);

		// estacia o objeto
		driver = new FirefoxDriver();

		// abre a pagina
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("teste@email.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("u_0_b")).click();

		driver.findElement(By.name("firstname")).sendKeys("Abner");
		driver.findElement(By.name("lastname")).sendKeys("Marcelino");
		driver.findElement(By.name("reg_email__")).sendKeys("email@email.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		driver.findElement(By.name("u_0_b")).click();

		// Actions act = new Actions();

	}

	public static void testeTagEClass() {
		// seta o driver a ser usado
		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		// estancia o objeto
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// nova lista para adicionar melementos pela tag
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement webElement : links) {
			System.out.println(webElement.getText());
		}

		List<WebElement> labels = driver.findElements(By.tagName("label"));

		for (WebElement webElement : labels) {
			System.out.println(webElement.getText());
		}

		System.out.println(links.size());
		System.out.println(labels.size());

	}

	public static void testeClassEName() {
		// seta o driver a ser usado
		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		// estacia o objeto
		driver = new ChromeDriver();
		driver.get("https://www.trivago.com.br");
		// busca o elemento pela cllasse
		driver.findElement(By.className("siteheader__control js-user-menu-button")).click();
	}

	public static void testeText() {
		// seta o driver a ser usado
		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		// estacia o objeto
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//busca links na pagina
		//driver.findElement(By.linkText("Esqueceu a conta?")).click();
		//busca links na pagina com nome parcial Case sensitive
		driver.findElement(By.partialLinkText("Esqueceu")).click();
		
	}
}
