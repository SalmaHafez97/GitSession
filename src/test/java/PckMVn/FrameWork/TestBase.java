package PckMVn.FrameWork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
  
	protected WebDriver driver;
	
	public void openfirefox (String url) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to(url);
	    
	}
	
}
