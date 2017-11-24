package practice_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class Radiocheck {
	public static void main(String[] arg) throws InterruptedException
	{
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
		System.setProperty("webdriver.gecko.driver", "C://Users//chaman.preet//Downloads//geckodriver.exe");
WebDriver driver=new FirefoxDriver(fp);
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.findElement(By.name("firstname")).sendKeys("Chaman");
	driver.findElement(By.name("lastname")).sendKeys("Preet");
	driver.findElements(By.id("sex-1")).get(0).click();
	driver.findElements(By.id("exp-2")).get(0).click();
	//driver.findElement(By.id("datepicker")).sendKeys("19/01/2017");
	driver.findElements(By.id("profession-1")).get(0).click();
	driver.findElements(By.id("tool-2")).get(0).click();
	Select upselect=new Select(driver.findElement(By.id("continents")));
	upselect.selectByIndex(1);
	Select downselect=new Select(driver.findElement(By.id("selenium_commands")));
	downselect.selectByVisibleText("Switch Commands");
	}

}
