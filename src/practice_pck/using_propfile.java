package practice_pck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class using_propfile {
/*@FindBy(id="ctl00_PlaceHolderMain_signInControl_UserName")
WebElement username;

@FindBy(id="ctl00_PlaceHolderMain_signInControl_password")
WebElement password;

@FindBy(id="ctl00_PlaceHolderMain_signInControl_login")
WebElement login;*/

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://demo2.rms.evalueserve.com/");
File src=new File("C:\\Test_workspace\\Practice\\src\\practice_pck\\object.properties");
FileInputStream fs=new FileInputStream(src);
Properties prp=new Properties();
prp.load(fs);
driver.findElement(By.id(prp.getProperty("username.id"))).sendKeys("Teammanager.demo2@evalueserve.com");
driver.findElement(By.id(prp.getProperty("password.id"))).sendKeys("Evs1234$");
driver.findElement(By.id(prp.getProperty("login.id"))).click();
WebDriverWait wait=new WebDriverWait(driver, 60);
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_SPWebPartManager1_g_82524232_dbf5_4585_a08d_80771f735d21_UpdatePanel_ProjectQueue")));
	driver.close();}

}
