package himobile.testcases;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class deleteFolder {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		/*
		String destination = "C:\\Program Files\\Hirschmann\\Industrial HiVision 6.0\\database" ;
		FileUtils.deleteDirectory(new File(destination));
		System.out.println("Hivision database folder deleted successfully");
*/
		System.out.println("From HiVision Application: Fetching data from CSV File for Comparison");
		
		System.out.println("CSV file exported successfully from HiVision");
        String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv";
		String input;
        int count = 0;
        int temp1 = 0;
        BufferedReader br1 = null;
        String line = "";
    	String cvsSplitBy = ";";
    	String[] eventshivision = new String[200];
		int iteration = 0;
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			while((line = br1.readLine()) != null)
			{
				if(iteration == 0 || iteration == 1 || iteration == 2 || iteration == 3) {
                    iteration++;  
                    continue;
                }

				int iPos= line.lastIndexOf("\",");	
				if (iPos > -1){
					line = line.substring(0, iPos);
				}
		
					eventshivision[temp1]= line.split(cvsSplitBy)[8];
					eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
					System.out.println("The hivison event is " + eventshivision[temp1] );
					temp1++;
			
				count++;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
        System.out.println("The number of events in HiVision are : "+count);
	}

}
