package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
//	Identify column name by scanning 1st row
//	Once column found search for desired row data
	
	public ArrayList<String> GetData(String SheetName, String columnName, String rowName) throws IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\ARJUNC\\Downloads\\demoData.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		ArrayList<String> Data = new ArrayList<String>();
		int totalSheets = workbook.getNumberOfSheets();
		for(int i=0;i<totalSheets;i++)
		{		
			
//			System.out.println();
			if (workbook.getSheetName(i).equalsIgnoreCase(SheetName))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				System.out.println(sheet.getSheetName());
				
				Iterator<Row> rows = sheet.iterator();  // sheet is collection of row
				Row firstRow = rows.next();
				
				Iterator<Cell> cell = firstRow.cellIterator();  // row is collection of cells
				
				int k=0;
				int columnIndex=0;
				while (cell.hasNext())
				{
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase(columnName))
					{
						System.out.println(value.getStringCellValue());
						columnIndex = k;
					}
					k++;
				}
				System.out.println(columnIndex);
				
				
				while(rows.hasNext())
				{
					Row value = rows.next();
					if (value.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(rowName))
					{
						Iterator<Cell> cv =  value.cellIterator();
						while(cv.hasNext())
						{
//							System.out.println(cv.next().getStringCellValue());
							Data.add(cv.next().getStringCellValue());
						}
						
					}
				}
				System.out.println(Data);
				
				
			}
		}
		
		workbook.close();
		return Data;
	}

}
