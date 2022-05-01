package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPI {

public static void main (String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://google.com");

driver.manage().window().maximize();

//get title of browser
String title = (driver.getTitle());
System.out.println(title);

//navigate to a url
driver.navigate().to("https://youtube.com");
driver.navigate().back();
Thread.sleep(5000);


}

}
