package practice_pck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

//Constructor overloading
public class delete1 {
String fname1;
String fname2;

		public void constructor_overload() {
		// TODO Auto-generated method stub
delete1 student=new delete1("alex","Apeejay");

	}
		
		public delete1(String name1)
		{
			fname1=name1;
			System.out.println("Name is" +fname1);
		}
public delete1(String name1,String name2)
{
this("Jim");
fname1=name1;
fname2=name2;
System.out.println("Name is" +fname1);
System.out.println("Name is" +fname2);
}

// Wait

public void test_wait()
{
WebDriver driver;
driver=new FirefoxDriver();
driver.get("http://evs01tst11/SikaRnDInformationPortal/login.aspx");
//implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//explicit wait
WebDriverWait Wait=new WebDriverWait(driver, 60);
Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dnn_ctr474_Login_Login_DNN_plUsername_lblLabel")));
//Fluent wait
FluentWait wait=new FluentWait(driver);
wait.pollingEvery(1, TimeUnit.SECONDS);
wait.withTimeout(60, TimeUnit.SECONDS);
wait.ignoring(NoSuchElementException.class);
Object find= wait.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver){
		return driver.findElement(By.id("dnn_ctr474_Login_Login_DNN_plUsername_lblLabel"));}
	});

	}

//Annotations
@BeforeTest
public void test_annotations()
{System.out.println("Before test");
}
@BeforeMethod
public void test_beforemethod()
{System.out.println("Before method");
	}
@Test
public void test1()
{System.out.println("test1");}
@Test
public void test2()
{System.out.println("test2");}
@BeforeSuite
public void test_beforesuite()
{System.out.println("Before suite");}
@AfterTest
public void test_aftertest()
{System.out.println("After test");}
@AfterMethod
public void test_aftermethod()
{System.out.println("After mthod");}
@AfterSuite
public void test_aftersuite()
{System.out.println("after suite");}


@Test
public void read_excel() throws IOException
{
String path="C:\\RMS_workspace\\First_RMSProject\\RMS data.xlsx";
FileInputStream fs=new FileInputStream(path);
XSSFWorkbook wr=new XSSFWorkbook(fs);
XSSFSheet sheet=wr.getSheet("Sheet1");
XSSFRow row=sheet.getRow(2);
XSSFCell cell=row.getCell(1);

System.out.println("Values is "+cell.getStringCellValue());
}

}
