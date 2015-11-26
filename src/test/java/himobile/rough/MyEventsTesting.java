package himobile.rough;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

public class MyEventsTesting {
	
	public static void main(String[] args) throws Exception{
		
			System.out.println("From HiMobile App: Fetching data from XML File for Comparison");
			System.out.println("Reading data from eventlist.xml which is saved from getPageSource commands from Appium native code");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = null;
			File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\eventlist.xml");
			Document doc = null;
					try {
						dBuilder = dbFactory.newDocumentBuilder();
						doc = dBuilder.parse(fXmlFile);
					} catch (ParserConfigurationException e) {
						System.out.println("dbFactory Thrown ParserConfigurationException");
						e.printStackTrace();
					} catch (SAXException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				doc.getDocumentElement().normalize();
				NodeList nList = doc.getElementsByTagName("android.widget.ListView");
				Node nNode = nList.item(0);
				Element e = (Element) nNode;
				NodeList nListChild = e.getChildNodes();
				String[] eventshimobile = new String[200];
						
			for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			 	
				Node nNode1 = nListChild.item(temp2);
				Element eElement = (Element) nNode1;
				//Thread.sleep(10000);
				eventshimobile[temp2] = eElement.getAttribute("content-desc");
				System.out.println("The himobile event is " +eventshimobile[temp2]);
				}
			
				System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
				Thread.sleep(10000);
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
		        System.out.println("As a Result: Verify the data from both the file");
		        Assert.assertEquals(nListChild.getLength(), count);
		       	for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
				Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
				
				if(eventshimobile[temp2] == eventshivision[temp2])	{
					//reports.log(LogStatus.PASS, "Test Case-28:Validate Events test Pass");
					System.out.println("Pass");
					}		else	{
					//reports.log(LogStatus.FAIL, "Test Case-28: Validate Events test Fail");
						System.out.println("Fail");
					}
			}
		}
		
}
