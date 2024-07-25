package Testing;


import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class ExecuteTestCase extends BaseClass {
    
	
	@Test
   public void mytestcases() throws InterruptedException, AWTException {
	   
	   SriptingPOM P = PageFactory.initElements(driver, SriptingPOM.class);
	   
	   P.Login();
	   
    	
}
	  
	
	
	@AfterMethod
	  public void closebrowser() {
		  
		  driver.quit();
		  
		  
	  }
}
