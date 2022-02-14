package dataProvider;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromeExcel {

	@Test
	public void main ()throws Throwable, IOException {
		
		File path =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\src\\test\\java\\DataFolder\\testData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet = wb.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0; i<physicalNumberOfRows;i++) {
			
				XSSFRow row = sheet.getRow(i);
				
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				
				for(int j=0; j<physicalNumberOfCells; j++) {
					
					XSSFCell cell = row.getCell(j);
					
					DataFormatter df = new DataFormatter();
					String formatCellValue = df.formatCellValue(cell);
					System.out.println(formatCellValue);
				}
		}
		
		wb.close();
	}
	
}
