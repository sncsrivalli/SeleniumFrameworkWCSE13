package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	Workbook workbook;
	public void excelInitialization() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstantPath.EXCELPATH);
		workbook = WorkbookFactory.create(fis);
	}
	
	public Map<String, String> fetchDataFromExcel(String sheetName)  {
		
		Sheet sheet = workbook.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		Map<String,String> map = new HashMap<>();
		
		for(int i=0; i<= sheet.getLastRowNum(); i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
		return map;
	} 
	
	public void closeExcel() throws IOException {
		workbook.close();
	}

}
