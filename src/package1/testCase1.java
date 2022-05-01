package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {
	
public static void main (String [] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");

//initiate brwser and navigate to selenium wiki page
WebDriver driver = new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
driver.findElement(By.linkText("Create account")).click();
Thread.sleep(5000);

//get current url and verify if internal link
String url1 = driver.getCurrentUrl();
if (url1.contains("https://en.wikipedia.org")) {
	System.out.println("Link is internal"); 
}else {
	System.out.println("Link is not internal test case failed");
}

driver.navigate().back();
driver.findElement(By.partialLinkText("selenium.dev")).click();
Thread.sleep(2000);
String url2 = driver.getCurrentUrl();
if (!url2.contains("wikipedia.org")) {
	System.out.println("Link is external");
}else {
	System.out.println("Link is not External test case failed");
}
driver.close();
	}
	

}
