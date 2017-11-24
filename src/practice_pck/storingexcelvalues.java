package practice_pck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class storingexcelvalues {
	String path="C://Test_workspace//Practice//Contri list.xlsx";

//Using array of maximum row and column count    
public void store_data(String sheet_name) throws IOException
{
	FileInputStream fs=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sheet=wb.getSheet(sheet_name);
    int Total_rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    System.out.println("Row count is " +Total_rowcount);
    
    int Physicalcount = sheet.getPhysicalNumberOfRows();
    System.out.println("Row count by physicalcount " +Physicalcount);    
    
    int Col_count = sheet.getRow(1).getPhysicalNumberOfCells();
	System.out.println("Column count is " +Col_count);
    for(int i=0;i<=Total_rowcount;i++)
    {
    	XSSFRow allrow = sheet.getRow(i);
    	
    	for(int j=0;j<2;j++)
    	{
    		  		//ArrayList<String> cellvalue=new ArrayList<String>();
			XSSFCell cell = allrow.getCell(j);
		String cellvalue[][]=new String[Physicalcount][Col_count];
			cellvalue[i][j]=cell.getStringCellValue();
    		 System.out.println("Content is " +cellvalue[i][j]);
    	}
    	
    }
}

// Using Iterator object
public void store_usingiterator(String sheet_name) throws IOException
{
	FileInputStream fs=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sheet=wb.getSheet(sheet_name);
	Iterator<Row> rowIterator=sheet.rowIterator();
	while(rowIterator.hasNext())
	{
		Row row=rowIterator.next();
		Iterator<Cell> cellIterator=row.cellIterator();
		while(cellIterator.hasNext())
		{
			Cell cell=cellIterator.next();
			System.out.println("Cell content is " +cell.getStringCellValue());
		}
	}
	}
	
//Using ArrayList
public void store_usingarraylist(String sheet_name) throws IOException
{
	ArrayList<String> list=new ArrayList<String>();
	FileInputStream fs=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sheet=wb.getSheet(sheet_name);
	Iterator<Row> rowIterator=sheet.rowIterator();
	while(rowIterator.hasNext())
	{
		Row row=rowIterator.next();
		Iterator<Cell> cellIterator=row.cellIterator();
		while(cellIterator.hasNext())
		{
			Cell cell=cellIterator.next();
					String c=cell.getStringCellValue();
			list.add(c);
			} 
		}
			for(int i=0;i<list.size();i++)
			{
			System.out.println("arraylist values are " +list.get(i));
			}
		}
	}


	
