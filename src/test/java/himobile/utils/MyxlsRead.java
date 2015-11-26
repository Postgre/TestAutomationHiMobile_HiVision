package himobile.utils;



public class MyxlsRead {

	public static void main(String[] args) {
	
		String sheetName = "test";
		ExcelReader xlsFile = new ExcelReader("D:\\Automation_Appium\\wrkspace\\HiMobileTestAutomation\\Driver\\TestDataSheet.xlsx");

		String thatcell = xlsFile.getCellData(sheetName, "host", 2);
		//thatcellcount
		
		System.out.println(xlsFile.getColumnCount(sheetName));
		
		System.out.println(xlsFile.getRowCount(sheetName));
		
		System.out.println(thatcell);
	}

}
