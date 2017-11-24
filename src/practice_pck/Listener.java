package practice_pck;

import practice_pck.Test_java;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener {
	WebDriver driver=null;
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
	System.out.println("Test has been failed for test case: " +Result.getName());
	try {
		String methodname=Result.getName().toString().trim();
		takesscreenshot_fail(methodname);
	} catch (IOException e) {
		System.out.println("Some error in capturing screenshot for fail");
		e.printStackTrace();
	}	
	}
	
	public void takesscreenshot_fail(String methodname) throws IOException
	{
		driver=Test_java.driver;
		//this.driver = ((Test_java)result.getInstance()).driver;
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\chaman.preet\\Desktop\\screenshot\\Fail\\"+methodname+".png"));
		//System.out.println("Placed screenshot at filepath");
	}
	
	public void takesscreenshot_pass(String methodname) throws IOException
	{
		driver=Test_java.driver;
		//this.driver = ((Test_java)result.getInstance()).driver;
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\chaman.preet\\Desktop\\screenshot\\Pass\\"+methodname+".png"));
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Test has been skipped for test case: " +Result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Test case passed for " +Result.getName());
		String methodname=Result.getName().toString().trim();
		try {
			takesscreenshot_pass(methodname);
		} catch (IOException e) {
			System.out.println("Some error in capturing screenshot for pass");
			e.printStackTrace();
		}
		
	}

}
