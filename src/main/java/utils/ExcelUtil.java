package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public FileOutputStream fileOut;
	public String path;
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public static String cFileNameWithPath;
	public static String cSheetName;
	public static String cTcID;
	public static String cTcValue;
	public XSSFSheet sheet;
	public XSSFRow row;

	//public XSSFCell cell;



	public Map<Object, Object> GetRowData(File filepath, String sheetName, int rowNum) throws IOException {
		fis = new FileInputStream(filepath);
		workbook = new XSSFWorkbook(fis);
		Map<Object, Object> rowDataSet = new HashMap<Object, Object>();
		//DataFormatter formatter = new DataFormatter();
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				sheet = workbook.getSheetAt(i);
			}
		}
		Iterator<Row> rows = sheet.iterator();
		Row row = rows.next();
		Iterator<Cell> headerCell = row.cellIterator();
		List<Object> colHeaders = new ArrayList<Object>();
		List<Object> rowValues =  new ArrayList<Object>();
		int totalRows = sheet.getPhysicalNumberOfRows();
		//int totalColumn = sheet.getRow(0).getLastCellNum();

		while (headerCell.hasNext()) {
			Cell cell = headerCell.next();
			switch(cell.getCellType())
			{
			case NUMERIC:
				colHeaders.add(cell.getNumericCellValue());
				break;
			case STRING:
				colHeaders.add(cell.getStringCellValue());
				break;
			default:
				break;
			}
			
		}

		if (rowNum > totalRows) {
			 return null;
		} else {
			XSSFRow rowData = sheet.getRow(rowNum);
			
			Iterator<Cell> cellData = rowData.cellIterator();
			while (cellData.hasNext()) {
				Cell cell = cellData.next();
				switch(cell.getCellType())
				{
				case NUMERIC:
					;    
					rowValues.add((int)(cell.getNumericCellValue()));
					break;
				case STRING:
					rowValues.add(cell.getStringCellValue());
					break;
				default:
					break;
				}
			}

		}
		Iterator<Object> keys = colHeaders.iterator();
		Iterator<Object> values = rowValues.iterator();
		while (keys.hasNext() && values.hasNext()) {
			rowDataSet.put(keys.next(), values.next());
		}

		return rowDataSet;

	}

	public int GetRowCount(String sheetName) {
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int totalRow = sheet.getLastRowNum() + 1;
		return (totalRow);
	}

	public String[][] getDataFromSheet(String sheetName) {

		String dataSet[][] = null;
		return dataSet;

	}

	public String getStringCellData(String sheetName, String colName, int rowNum) {

		return null;

	}

}
