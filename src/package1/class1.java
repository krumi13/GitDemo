package package1;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class class1 {


public static void main (String[]args) {
	
//set the webdriver location 
//System.setProperty("webdriver.chrome.driver",("C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe"));
//WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.gecko.driver","C:\\Users\\Kabir\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
WebDriver gDriver = new FirefoxDriver();



/*
 * //navigate to webpage driver.get("https://www.stealmylogin.com/demo.html");
 * driver.findElement(By.name("username")).sendKeys("TestUser");
 * driver.findElement(By.name("password")).sendKeys("password1"); WebElement
 * loginButton = driver.findElement(By.xpath("/html/body/form/input[3]"));
 * loginButton.click();
 * 
 * //get current url String url = driver.getCurrentUrl();
 * System.out.println(url); if (url.equals("https://example.com/")){
 * System.out.println("Test Case passed"); } else {
 * System.out.println("Test case did not pass"); }
 */

gDriver.get("https://www.stealmylogin.com/demo.html");
gDriver.findElement(By.name("username")).sendKeys("username");
gDriver.findElement(By.name("password")).sendKeys("password");
gDriver.findElement(By.xpath("/html/body/form/input[3]")).click();




if (gDriver.getCurrentUrl().equals("https://example.com/")){
  System.out.println("test case passed"); 
  }else {
	  System.out.println("test case did not pass");
  }

 
 




}

}
