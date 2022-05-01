package DataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
static WebDriver driver;

@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

}

  @Test 
  public void launch() {
	  driver.get("https://google.com");
  }
}
