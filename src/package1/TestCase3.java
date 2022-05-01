package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

public static void main (String []args) throws InterruptedException {

//set the webdriver location 
System.setProperty("webdriver.chrome.driver",("C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe"));
WebDriver driver = new ChromeDriver();
driver.get("https://demoblaze.com");
driver.findElement(By.partialLinkText("Sign ")).click();
Thread.sleep(5000);

if (!driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).isDisplayed()) {
	System.out.println("Did not open pop up window");
}

driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();


//class1 action1 = new class1();
//class1.main(args);

}

}
