package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver;
  
@Test(groups = {"regression", "sanity"}, priority =1)
public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver",("C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe"));
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
 
@Test(groups = {"regression", "sanity"}, priority = 7)
public void closeBrowser() {
	  driver.close();
 }
 
@Test(groups = {"regression", "sanity"}, priority = 2)
public void verifyBing() {
	 driver.get("https://www.bing.com/");
	 Assert.assertEquals(driver.getTitle(),"Bing");
 }
 
@Test(groups = {"sanity"}, priority = 3)
public void verifyGoogle() {
	 driver.get("https://google.com");
	 Assert.assertEquals(driver.getTitle(), "Google");
 }

@Test(groups = {"regression"}, priority =4)
public void verifyYahoo() {
	 driver.get("https://yahoo.com");
	 Assert.assertEquals(driver.getTitle(), "Yahoo");
 }
 
@Test(groups = {"regression"}, priority =5)
public void verifyBankofamerica() {
	driver.get("https://bankofamerica.com");
	Assert.assertEquals(driver.getTitle(),"Bank of America - Banking, Credit Cards, Loans and Merrill Investing");
}

@Test(groups = {"regression"}, priority =6)
public void verifyExcellus() {
	driver.get("https://www.excellusbcbs.com/");
	Assert.assertEquals(driver.getTitle()," Health Insurance Plans | Excellus BlueCross BlueShield ");
}
 
 
}
