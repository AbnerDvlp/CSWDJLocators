package aula.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocatorsAvancadoXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//testeXpathAbsoluto();
		testeXpathRelativo();
	}

	public static void testeXpathAbsoluto() throws InterruptedException {
		// o site pode ter alterações fazendo o codigo não funcionar.../

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		String xpathPesquisa = "/html/body/div[2]/div[2]/div[1]/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[1]/input[1]";
		String xpathBtnPesquisa = "/html/body/div[2]/div[2]/div[1]/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div[1]/span";
		String xpathCeluarPesquisa = "/html/body/div[2]/div[3]/div[1]/div[6]/div[2]/ul/li[10]/a/div[1]/div/img";
		String xpathFiltroPreco = "/html/body/div[2]/div[3]/div[1]/div[6]/div[1]/div[1]/ul/li[2]/ul/li[6]/a";
		String xpathCookie = "/html/body/div[4]/div[2]/p";

		driver = new ChromeDriver();

		driver.get("https://www.magazineluiza.com.br");
		driver.manage().window().maximize();

		// procura o elemento pelo xpath
		driver.findElement(By.xpath(xpathPesquisa)).sendKeys("celular");
		System.out.println("step1");
		driver.findElement(By.xpath(xpathBtnPesquisa)).click();
		System.out.println("step2");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("step3");

		// rola a tela
		js.executeScript("window.scrollBy(0,700);");
		System.out.println("step4");

		Thread.sleep(1500);
		System.out.println("step5");
		driver.findElement(By.xpath(xpathCookie)).click();
		driver.findElement(By.xpath(xpathFiltroPreco)).click();

		js.executeScript("window.scrollBy(0,700);");
		System.out.println("step6");
		driver.findElement(By.xpath(xpathCeluarPesquisa)).click();

	}

	public static void testeXpathRelativo() throws InterruptedException {
		// o site pode ter alterações fazendo o codigo não funcionar.../

		String driverPath = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaLocators\\drivers\\chrome\\084\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		String xpathPesquisa = "//input[@id='inpHeaderSearch']";
		String xpathBtnPesquisa = "//span[contains(@title,'scar')]";
		String xpathCeluarPesquisa = "//*[contains(@alt,'Celular Positivo P26 Dual Chip 2G Bluetooth - Desbl.')]";
		String xpathFiltroPreco = "//a[contains(@data-filter-data,'R$ 40 a R$ 110')]";
		String xpathCookie = "/html/body/div[4]/div[2]/p";

		driver = new ChromeDriver();

		driver.get("https://www.magazineluiza.com.br");
		driver.manage().window().maximize();

		// procura o elemento pelo xpath
		driver.findElement(By.xpath(xpathPesquisa)).sendKeys("celular");
		System.out.println("step1");
		driver.findElement(By.xpath(xpathBtnPesquisa)).click();
		System.out.println("step2");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("step3");

		// rola a tela
		js.executeScript("window.scrollBy(0,700);");
		System.out.println("step4");

		Thread.sleep(1500);
		System.out.println("step5");
		driver.findElement(By.xpath(xpathCookie)).click();
		driver.findElement(By.xpath(xpathFiltroPreco)).click();

		js.executeScript("window.scrollBy(0,700);");
		System.out.println("step6");
		driver.findElement(By.xpath(xpathCeluarPesquisa)).click();

	}
}
