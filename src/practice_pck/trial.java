package practice_pck;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class trial {
	WebDriver driver;
	 public static String downloadPath = "C:\\Users\\chaman.preet\\Desktop\\download";
  @Test
  public void toolsqa() throws Exception {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  driver.findElement(By.name("firstname")).sendKeys("Chaman");
	  driver.findElement(By.name("lastname")).sendKeys("Preet");
	  driver.findElement(By.id("sex-0")).click();
	  driver.findElement(By.id("exp-0")).click();
	  driver.findElement(By.id("datepicker")).sendKeys("02/04/2016");
	  driver.findElement(By.xpath("//input[@id='profession-0'][@value='Manual Tester']")).click();
	  driver.findElement(By.id("photo")).click();
	  StringSelection s=new StringSelection("C:\\Users\\chaman.preet\\Desktop\\bugs.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	  Robot rob=new Robot();
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_V);
	  rob.keyRelease(KeyEvent.VK_V);
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  driver.findElement(By.id("tool-0")).click();
	  Select sel=new Select(driver.findElement(By.id("continents")));
	  sel.selectByVisibleText("Australia");
	  //driver.findElements(By.id("continents")).get(1).click(); 
	 
			WebDriver driver = new FirefoxDriver(FirefoxDriverProfile());	
		    driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
		    
		    Select sellist=new Select(driver.findElement(By.id("selenium_commands")));
			  sellist.selectByVisibleText("WebElement Commands");	
	  
	  File srcf=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcf, new File("C:\\Users\\chaman.preet\\Desktop\\screenshot.png"));
	  driver.close();
  }
	  public FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		return profile;
		  }
  
  
  }
