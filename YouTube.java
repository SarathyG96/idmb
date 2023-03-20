package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class YouTube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarathy\\eclipse-workspace\\selenium project\\src\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com");
		 driver.manage().window().maximize();
		 
		WebElement searchbox = driver.findElement(By.xpath("//input[@id = 'search.ytd-searchbox]"));
		searchbox.sendKeys("DevaHits");
		
		WebElement clickon = driver.findElement(By.xpath("//button[@id = 'search.ytd-searchbox']"));
		clickon.click();
		
		WebElement song = driver.findElement(By.xpath("//a[@class = 'style-scope ytd-watch-flexy']"));
		song.click();
		
		driver.close();
		

	}

}
