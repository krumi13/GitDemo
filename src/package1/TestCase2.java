package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://gmail.com");
Thread.sleep(2000);
boolean linkPresent = driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).isDisplayed();
if (linkPresent== true) {
	System.out.println("test case passed");
}else {
	System.out.println("test case failed");
}
driver.close();

	}

}
