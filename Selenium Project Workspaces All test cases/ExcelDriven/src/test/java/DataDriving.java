import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriving {
	
	

	public ArrayList<String> getData(String RequiredTest) throws IOException
	
	{
		
		
		
		
ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("D:\\Selenium Project collections\\Apache POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets	=	workbook.getNumberOfSheets();

		for(int i=0;i<sheets;i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestCase"))
				
			{
		XSSFSheet sheet =	workbook.getSheetAt(i);
		
		Iterator<Row> Rows =	sheet.iterator();
	
		Row FirstRow =	Rows.next();
		
		
		Iterator<Cell>	Cells =	FirstRow.cellIterator();
		
		int k =0;
		
		int coloumn =0;
		while(Cells.hasNext())
		{
			
			Cell ce = Cells.next();
			
			if(ce.getStringCellValue().equalsIgnoreCase("TestData"))
			{
				coloumn =k;
			}
			
			k++;
			
		}
		
		
		System.out.println(coloumn);
		
		
		
		while(Rows.hasNext())
		{
	Row r =	Rows.next();
	if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(RequiredTest))
		// in the step of searching the column element we have to pass the "RequirdTest"  varialable
	{
Iterator<Cell>	 cv = 	r.cellIterator();
while(cv.hasNext()) 
	
{
	
Cell c =	cv.next();

if(c.getCellType()==CellType.STRING)
{
	
	a.add(c.getStringCellValue());
}
else
{
	
	a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
}

	}
		}
		
		}
	
		
			}
			
		}
		return a;
	
		
	}
	
	

	
	
	public static void main(String[] args) throws IOException
	{
		
	}
	
	
	

	

}
