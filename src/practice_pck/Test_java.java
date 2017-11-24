package practice_pck;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(practice_pck.Listener.class)

public class Test_java {
	static WebDriver driver;
	//@Test
	// Change date format using SimpleDateFormat class
	public void date_format()
	{
		DateFormat formattest=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		Date date=new Date();
		String changed_date = formattest.format(date);
		System.out.println("Formatted date is " +changed_date);
		}

@Test(priority=0)
public void open_RMS()
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo2.rms.evalueserve.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_UserName")).sendKeys("Teammanager.demo2@evalueserve.com");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_password")).sendKeys("evs1234$");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_login")).click();
	//System.out.println(driver.findElement(By.linkText("Home")).getText());
	Assert.assertEquals((driver.findElement(By.linkText("Home")).getText()), "Home");
}

@Test(priority=1)
public void NEW_req()
{
	driver.findElement(By.linkText("New request")).click();
	
	}
}