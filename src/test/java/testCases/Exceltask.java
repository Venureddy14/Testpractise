package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Exceltask {
  @Test
  public void findrowsvalue() throws EncryptedDocumentException, InvalidFormatException, IOException {
	  
	  File fx = new File("C:\\Users\\zubairhussains\\workspace\\TestPractise\\Testdata\\testdata.xlsx");
		FileInputStream fix = new FileInputStream(fx);
		Workbook wb= WorkbookFactory.create(fix);
		Sheet sh= wb.getSheetAt(0);
		int totalRows=sh.getLastRowNum();
		
		for(int i=0;i<=totalRows;i++){
			
		System.out.println(sh.getRow(i).getCell(0).getStringCellValue()+" "+sh.getRow(i).getCell(1).getStringCellValue());
		}
		
  }
}
