import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String filepath) throws IOException {
		
		
	//	filepath ="C:\\Users\\ELCOT\\eclipse-workspace\\Testngrevision\\src\\test\\java\\DataFolder\\testData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filepath);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for(int i =0; i<physicalNumberOfRows; i++) {
			
			XSSFRow row = sheetAt.getRow(i);
			
		//	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for(int j= 0; j< row.getPhysicalNumberOfCells(); j++) {
				
				XSSFCell cell = row.getCell(j);
				//String stringCellValue = cell.getStringCellValue();
				DataFormatter df = new DataFormatter();
				String formatCellValue = df.formatCellValue(cell);
				System.out.println(formatCellValue);
				
				
			}
			
			wb.close();
			
		}
		
		

	}

}
