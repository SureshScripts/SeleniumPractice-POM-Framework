package Testing;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SriptingPOM extends ExecuteTestCase{
	
	@FindBy (xpath="//input[@id='name']") WebElement FN;
	@FindBy (xpath="//input[@name='email']") WebElement EM;
	@FindBy (xpath="//input[@name='gender']") WebElement GR;
	@FindBy (xpath="//input[@name='mobile']") WebElement MN;
	@FindBy (xpath="//input[@id='dob']") WebElement DOB;
	@FindBy (xpath="//input[@id='subjects']") WebElement SUJ;
	@FindBy (xpath="//input[@id='picture']") WebElement PIC;
	@FindBy (xpath="//textarea[@id='picture']") WebElement CADR;
	@FindBy (xpath="//select[@id='state']") WebElement SST;
	@FindBy (xpath="//select[@id='city']") WebElement CS;
	@FindBy (xpath="//input[@type='submit']") WebElement SUB;
	
	
	public void Login() throws InterruptedException, AWTException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        FN.sendKeys("suresh");
        
        EM.sendKeys("suresh.koyyala89@gmail.com");
       
        Actions A = new Actions (driver);
        A.moveToElement(GR).click().perform();
        t(1);
        
        MN.sendKeys("6301653861");
      
        DOB.sendKeys("02042002");
       
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//input[@id='subjects']")));
        t(1);
        
        SUJ.sendKeys("English, Computer science");
        
          A.moveToElement(PIC).click().perform();
          
          StringSelection SS = new StringSelection("C:\\Users\\ADMIN\\Pictures\\Screenshots\\Screenshot (3).png");
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, SS);
          t(2);
          
          Robot R = new Robot ();
          R.keyPress(KeyEvent.VK_CONTROL);
          R.keyPress(KeyEvent.VK_V);
          R.keyRelease(KeyEvent.VK_CONTROL);
          R.keyRelease(KeyEvent.VK_V);
        
          R.keyPress(KeyEvent.VK_ENTER);
          R.keyRelease(KeyEvent.VK_ENTER);
          
          CADR.sendKeys("KPHB, Huderabad 500070");
          
          SST.click();
          
          R.keyPress(KeyEvent.VK_DOWN);
          R.keyRelease(KeyEvent.VK_DOWN);
          
          R.keyPress(KeyEvent.VK_DOWN);
          R.keyRelease(KeyEvent.VK_DOWN);
          
          R.keyPress(KeyEvent.VK_ENTER);
          R.keyRelease(KeyEvent.VK_ENTER);
          
          CS.click();
          
          R.keyPress(KeyEvent.VK_DOWN);
          R.keyRelease(KeyEvent.VK_DOWN);
          
          R.keyPress(KeyEvent.VK_ENTER);
          R.keyRelease(KeyEvent.VK_ENTER);
          
          SUB.click();       
          
	}
	
	public void t (int d) throws InterruptedException {
		
		int x = d*1000;
		Thread.sleep(x);
	}
 
}
