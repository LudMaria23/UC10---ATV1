import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteMagalu {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://magazineluiza.com.br");
		driver.manage().window().maximize();

	}
	
	@Test
	public void testeNavegador() {
		driver.get("https://magazineluiza.com.br");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("input-search")).sendKeys("notebook");
		driver.findElement(By.className("sc-dkPtRN kkxyKb")).click();
	}
}

	