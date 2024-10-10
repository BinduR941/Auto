package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Data3/Testscrip1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("WriteData").getRow(1).getCell(1).setCellValue("Manager");
	FileOutputStream fos=new FileOutputStream("./Data3/Testscrip1.xlsx");
	wb.write(fos);
   
	
}
}
