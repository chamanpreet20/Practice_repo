package practice_pck;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autoit {
	
	
 @Test
  public void uploadfile() throws IOException, InterruptedException {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("photo")).click();
		Runtime.getRuntime().exec("C://Program Files (x86)//AutoIt3//browse.exe");
		Thread.sleep(2000);
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C://Users//chaman.preet//Desktop//screenshot.png"));
		driver.close();
  }


}