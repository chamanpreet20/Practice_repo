package practice_pck;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

 public class Alllinks {
	 
	 @Test
	 public static void test()
	 {
	 WebDriver driver;
	 System.setProperty("webdriver.gecko.driver", "C://Users//chaman.preet//Downloads//geckodriver.exe");
 driver= new FirefoxDriver();
 
driver.get("http://toolsqa.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());

for (int i = 0;i<=links.size();i++)
{
	if(links.get(i).getText().isEmpty())
	{
		System.out.println("Blank link");
	}
	else{
	String options=links.get(i).getText();
	System.out.println("Link names are:"+options);
	}
}
	 }
 }
	 
