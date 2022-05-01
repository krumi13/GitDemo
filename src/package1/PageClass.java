package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageClass {
static WebDriver driver;

//create elements using element locator
By elements = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]");		
By forms = By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]");
By widgets = By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]");
By firstName = By.name("First Name");
By lastName = By.name("Last Name");

		
//set the webdriver location 
//System.setProperty("webdriver.chrome.driver",("C:\\Users\\Kabir\\Downloads\\chromedriver_win32\\chromedriver.exe"));
//driver = new ChromeDriver();

public PageClass(WebDriver driver) {
this.driver = driver;
}
	
//create user actiosns /Customized commands
public void navigateToForms() throws InterruptedException {
	driver.get("https://demoqa.com/");
	Thread.sleep(2000);
	WebElement formsLink = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[3]/h5"));
	formsLink.click();
	//driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]/div/div[3]/h5")).click();
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
	
}

public void enterName(String firstName, String lastName) {
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
}

public String captureName(){
	String enteredFN = driver.findElement(By.name("First Name")).getAttribute("value");
	String enteredLN = driver.findElement(By.name("Last Name")).getAttribute("value");
	return (enteredFN + " " + enteredLN);
	
	
}

	
}
