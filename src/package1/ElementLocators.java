package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.stealmylogin.com/demo.html");	
driver.manage().window().maximize();
//driver.findElement(By.name("username")).sendKeys("username");
WebElement editBox = driver.findElement(By.name("username"));
editBox.sendKeys("username");
driver.findElement(By.name("password")).sendKeys("password");
driver.findElement(By.xpath("/html/body/form/input[3]")).submit();


	}

}
