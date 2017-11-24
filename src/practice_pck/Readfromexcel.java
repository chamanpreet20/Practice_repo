package practice_pck;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import practice_pck.storingexcelvalues;

public class Readfromexcel {

	public static void main(String[] args) throws IOException, NullPointerException, InterruptedException {
WebDriver driver;
FirefoxProfile fp = new FirefoxProfile();
fp.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
System.setProperty("webdriver.gecko.driver", "C://Users//chaman.preet//Downloads//geckodriver.exe");
driver=new FirefoxDriver(fp);
		// TODO Auto-generated method stub
/*String path="C://Test_workspace//Practice//Contri list.xlsx";
	FileInputStream fs;
		fs = new FileInputStream(path);
		XSSFWorkbook work=new XSSFWorkbook(fs);
		XSSFSheet sheet=work.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(4);
		XSSFCell cell=row.getCell(1);
		System.out.println("Row value is " +cell);
		for(int i=0;i<=10;i++)
		{
			XSSFRow allrow = sheet.getRow(i);
			for(int j=0;j<=1;j++)
			{
			XSSFCell allcell = allrow.getCell(j);
			System.out.println("All row values are " +allcell);
			}
			//sheet.getRow(3).getCell(0);
		}
		
		cell.setCellValue("Update");
		System.out.println(cell);
		
		FileOutputStream ofs=new FileOutputStream(path);
		work.write(ofs);
		fs.close();
		work.close();
	}*/
		//driver=new FirefoxDriver();
		//storingexcelvalues str=PageFactory.initElements(driver, storingexcelvalues.class);


	//	storingexcelvalues str=new storingexcelvalues();
		//str.store_data("Sheet1");
driver.manage().window().maximize();
		driver.get("http://evs01tst05/CompsBuilderTest/managecomps/index");
		driver.findElement(By.id("UserName")).sendKeys("test@evalueserve.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.className("pinkLogBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("MANAGE COMPS")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-owns='drp_Team_listbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='k-list-scroller']//ul[@id='drp_Team_listbox']//li[@data-offset-index='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-owns='drp_Template_listbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='k-list-scroller']//ul[@id='drp_Template_listbox']//li[text()='NY']")).click();
		Thread.sleep(1000);
	String element=	driver.findElement(By.xpath("//div[@class='k-list-scroller']//ul[@id='drp_Sector_listbox']//li[@data-offset-index='0']")).getAttribute("innerHTML");
		System.out.println("Filed value is " +element);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='k-list-scroller']//ul[@id='MulSel_SubSector_listbox']//li[@data-offset-index='0']")).click();
}
}
