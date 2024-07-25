package BasePack;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

 
public class BaseClass {
  
	public static WebDriver driver;
	
	@BeforeClass
	  public void openbrowser() throws IOException {
		
	System.setProperty("WebDriver.Chrome.Driver", "‪C:\\Users\\ADMIN\\eclipse-workspace\\MavenDemoQA\\mydriver\\msedgedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	
	 
	
	  }
	
	
	
	
  

  

}
