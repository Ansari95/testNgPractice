import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcelUsingOfAppachePoi {
	
 	
	
	public static void main(String[] args) throws IOException {
		
//		String filepath = "C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\src\\test\\java\\DataFolder\\testData.xlsx";	
//		XSSFWorkbook wb = new XSSFWorkbook(filepath);
//		XSSFSheet sheet = wb.getSheetAt(0);
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
//		XSSFRow row2 = sheet.getRow(0);
//		XSSFCell cell2 = row2.getCell(1);
//		String stringCellValue = cell.getStringCellValue();
//		String stringCellValue2 = cell2.getStringCellValue();
//		System.out.println(stringCellValue);
//		System.out.println(stringCellValue2);
//		wb.close();
//		
		ReadFromExcelUsingOfAppachePoi rb = new ReadFromExcelUsingOfAppachePoi();
		rb.read();
	}
	
	
	public void read() throws IOException {
		
		String file = "C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\src\\test\\java\\DataFolder\\testData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheetAt(0);
		int lastRowNum = sheet.getPhysicalNumberOfRows();
		
		//System.out.println(lastRowNum);
		
		for(int i =0; i<lastRowNum;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
		//	System.out.println(physicalNumberOfCells);
			
			for(int j= 0; j<physicalNumberOfCells;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				//String CellValue = cell.getStringCellValue();
				
				DataFormatter df = new DataFormatter();
				String formatCellValue = df.formatCellValue(cell);
				System.out.println(formatCellValue);
				
			}
				
				
			}
			
			wb.close();
			
		}
		
		
		
		
		
		
		
	}
		
	
	
	


