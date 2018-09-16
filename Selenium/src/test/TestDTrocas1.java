package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDTrocas1 {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.xiru.rs/d/trocas/homolog/");
		WebElement link;
		link = driver.findElement(By.linkText("Cadastre-se"));
		link.click();
		WebElement userInfo;
		userInfo = driver.findElement(By.id("nome"));
		userInfo.sendKeys("Jane Doe");
		userInfo = driver.findElement(By.id("email"));
		userInfo.sendKeys("jane.doe@example.com");
		userInfo = driver.findElement(By.id("password"));
		userInfo.sendKeys("123456");
		userInfo = driver.findElement(By.id("passconf"));
		userInfo.sendKeys("123456");
		userInfo = driver.findElement(By.id("telefone"));
		userInfo.sendKeys("123456789");
		Select dropdown = new Select(driver.findElement(By.id("cidade")));
		dropdown.selectByValue("2");
		Thread.sleep(5000);
		driver.quit();
	}

}
