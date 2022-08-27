package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	
	public static String getTD(int rowindex,int colindex) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\Documents\\zerodhaDDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("zerodhaDDF");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
		
		
	}

}
