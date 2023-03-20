package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tutorial {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarathy\\eclipse-workspace\\selenium project\\src\\chromedriver.exe");
	
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("abc@gmail.com");
	 
	 WebElement pass = driver.findElement(By.id("pass"));
	 pass.sendKeys("sarathy");
	 
	 WebElement loginbtn = driver.findElement(By.name("login"));
	 loginbtn.click();
	}

}
