package newStuding;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class base {
	
	public static WebDriver driver;
	

@BeforeClass
	
	public void TestConfigurator()
	
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Joona Kannan\\workspace\\Latest\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	}

     

@AfterClass

public void browserquit()

{
	driver.quit();
}

}
