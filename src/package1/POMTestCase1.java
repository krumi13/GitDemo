package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTestCase1 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",("C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe"));
WebDriver driver = new ChromeDriver();

PageClass pomClass = new PageClass(driver);
pomClass.navigateToForms();
pomClass.enterName("Kabir", "Rumi");
	}

}
