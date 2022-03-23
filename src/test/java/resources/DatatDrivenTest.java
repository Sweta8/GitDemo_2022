package resources;
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
public class DatatDrivenTest {
	
	
	public static ArrayList<String> getData(String testCaseName) throws IOException
	{
		
				FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestCasesData.xlsx");
				
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
				int sheets=workbook.getNumberOfSheets();
				
				ArrayList<String> a=new ArrayList<String>();
				
				for(int i=0;i<sheets;i++)
				{
					   String sheetName = workbook.getSheetAt(i).getSheetName();
					   if(sheetName.equalsIgnoreCase("testdata"))
					   {
						   XSSFSheet sheet= workbook.getSheetAt(i);
						   
						   Iterator<Row> rows =sheet.iterator();
						   
						   Row firstRow= rows.next();
						   
						   Iterator<Cell> cells = firstRow.iterator();
						   
						   int k=0,column=0;
						   while(cells.hasNext())
						   {
							   Cell c= cells.next();
							   if(c.getStringCellValue().equalsIgnoreCase("TestCases"))
							   {
								   column=k;
							   }
							   k++;
						   }
						   System.out.println(column);
						   
						   while(rows.hasNext())
							{
								Row r= rows.next();
								if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
								{
									
									Iterator<Cell> c = r.cellIterator();
									while(c.hasNext())
									{
									
										Cell c1= c.next();
										if(c1.getCellTypeEnum()==CellType.STRING)
										{
											
										a.add(c1.getStringCellValue());
										}
										else{
											
											a.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
									}
							   }
							
						   }
					   }
					   }
				}
					
		
				return a;
				
	}
				
			}


