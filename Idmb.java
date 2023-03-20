package selenium;

           import org.openqa.selenium.By;
           import org.openqa.selenium.WebDriver;
           import org.openqa.selenium.WebElement;
           import org.openqa.selenium.chrome.ChromeDriver;
           


public class Idmb {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\Sarathy\\eclipse-workspace\\selenium project\\src\\chromedriver.exe");
	  
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 
	WebElement searchbox = driver.findElement(By.xpath("//input[@id = '\"twotabsearchtextbox\"']"));
	
	searchbox.sendKeys("Babydolls");
	WebElement clickon = driver.findElement(By.xpath("//button[@id = 'twotabsearchtextbox']"));
	clickon.click();
	
	
	driver.close();
	
	

	
	
	 
	 }

}
