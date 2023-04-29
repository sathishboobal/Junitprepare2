package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven2 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\SATHISH KUMAR\\Desktop\\preparation\\datadriven\\file\\datadriven.xlsx");
		FileInputStream fs=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int celltype = cell.getCellType();
				if (celltype ==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);	
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat d=new SimpleDateFormat("dd-mmm-yyyy");
					String format = d.format(dateCellValue);
					System.out.println(format);	
				}
				else {
					double d = cell.getNumericCellValue();
					long l=(long)d;
					String value = String.valueOf(l);
					System.out.println(value);
					
					
					
				}
				
			}
			
		}
	
	
	
	
	}

}
