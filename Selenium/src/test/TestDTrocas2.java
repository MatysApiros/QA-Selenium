package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TestDTrocas2 {
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.xiru.rs/d/trocas/homolog/");
		WebElement searchBox;
		searchBox = driver.findElement(By.id("filter-box"));
		searchBox.sendKeys("PC");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
