package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.wi.select;



public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarathy\\eclipse-workspace\\selenium project\\src\\chromedriver.exe ");
		
		WebDriver account = new ChromeDriver();
		account.get("https://www.facebook.com/");
		account.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement create = account.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']"));
		create.click();
		Thread.sleep(2000);
		
		WebElement Firstname = account.findElement(By.name("first name"));
		Firstname.sendKeys("Sarathy");
		Thread.sleep(3000);
		
		WebElement Secondname = account.findElement(By.name("last name"));
		Secondname.sendKeys("G");
		Thread.sleep(3000);
		
		WebElement email = account.findElement(By.name("reg_email"));
		email.sendKeys("98765432");
		Thread.sleep(3000);
		
		WebElement pass = account.findElement(By.name("reg_password"));
		pass.sendKeys("sarathy123");
		Thread.sleep(3000);
		
	}

}
