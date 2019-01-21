package testNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TK_POC {
	//static List yearvalues=new ArrayList();
	static List yearvalues = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\chaman.preet\\Desktop\\TK\\Copy of Market data.xlsx";
FileInputStream fs=new FileInputStream(path);
XSSFWorkbook work=new XSSFWorkbook(fs);
XSSFSheet sheet=work.getSheet("filtered sheet");
String cellContent = "EGGERT";
System.out.println("cell content to be filtered is " +cellContent);
int rownr=0;
int colnr =6; //column from which you need data to store in array list

yearvalues = findRow(sheet, cellContent);

if(yearvalues !=null){
    for(Iterator iter=yearvalues.iterator();iter.hasNext();){
        System.out.println(iter.next());
       // sum = sum+iter.next();
}
    
}
output(sheet, rownr, colnr);

finish();
}

private static void output(XSSFSheet sheet, int rownr, int colnr) {
/*
 * This method displays the total value of the month
 */

XSSFRow row = sheet.getRow(rownr);
XSSFCell cell = row.getCell(colnr);

        System.out.println("Your total is: " + cell);
}

/*public int total()
{
int sum = 0;
for(int i = 0; i < yearvalues.size(); i++){
	
	sum=sum+yearvalues.get(i);
	return sum;}}*/

private static List findRow(XSSFSheet sheet, String cellContent) {
List yearvalues=new ArrayList();
for (Row row : sheet) {
    for (Cell cell : row) {
    	//System.out.println("Cell type is  " +cell.getCellType());
        if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
        //	System.out.println("Cell string is " +cell.getRichStringCellValue());
        	 if (cell.getRichStringCellValue().getString().trim().equals(cellContent)) {
               // System.out.println("Row numbers are"+row.getRowNum());
                int rownumber=row.getRowNum();
                //return row.getRowNum();
                XSSFRow row1 = sheet.getRow(rownumber);
                XSSFCell cell1 = row1.getCell(10);
                yearvalues.add(cell1);
               
               // 
            }
        	
        }
        else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
        {
        	cell.toString();
        }
        else{System.out.println("No cell type found");}
    }
}    
System.out.println("Year values is " +yearvalues);
int sum = 0;
for (int i: yearvalues) {
    sum += i;
}
	return sum;
//return yearvalues;


}

private static void finish() {

System.exit(0);
}
}   
	


