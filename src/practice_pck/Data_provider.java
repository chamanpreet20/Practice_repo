package practice_pck;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	@DataProvider
	@Test
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Chaman";
		data[1][0]="Amit";
		data[0][1]="Nisha";
		data[1][1]="Sweta";
		data[2][0]="Mala";
		data[2][1]="Rajeev";
		return data;
	}
	
	
	@Test(dataProvider="getdata")
	public void setdata(String username,String password)
	{
		System.out.println("Names are: " +username);
		System.out.println("PAssword are " +password );
	}
}
