package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {

	public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/");
	Thread.sleep(2000);
	WebElement formsLink = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[3]/h5"));
	formsLink.click();
	//driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[3]/h5")).click();
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
	}

}
