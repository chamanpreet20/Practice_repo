package practice_pck;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://selenium-release.storage.googleapis.com/index.html?path=2.52/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement table = driver.findElement(By.xpath("html/body/table"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println("Row size is" +rows.size());
List<WebElement> columns = table.findElements(By.tagName("th"));
System.out.println("Column size is" +columns.size());
int i = 0;
int j = 0;
//char a = null;
//char table1= a[i][j];
for(i=0;i<rows.size();i++)
{
	System.out.println("Rows are: "+rows.get(i).getText());
}
for(j=0;j<columns.size();j++)
{
	System.out.println("Columns are: "+columns.get(j).getText());
}
System.out.println ("Table data is " );
	}

}
