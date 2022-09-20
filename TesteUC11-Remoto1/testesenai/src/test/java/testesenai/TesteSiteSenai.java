package testesenai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSiteSenai {
	private WebDriver driver;
	
	
	@Before
	public void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excel");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.RETURN);
		
	
	
	}
}
