package himobile.sikuli;

import himobile.screens.SettingsScreen;
import himobile.utils.ExcelReader;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class HiVisionSikuli {
	
public static void  stop() throws FindFailed{
		
		Screen stop = new Screen();
		String sheetName = "StopStartIHVServices";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\HiVisionHandlingSikuli.xlsx");
		String textstop = dataxls.getCellData(sheetName, "InputEnglish", 6);
		Pattern img1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img1.png");
		Pattern img2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img2.png");
		Pattern img3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img3.png");
		
		stop.find(img1);
		stop.click(img1);
		stop.find(img2);
		stop.click(img2);
		stop.type(img2, textstop);
		stop.wait(img3, 30*60);
		stop.click(img3);
		
	}
	
	//2-Delete db folder from IHV installed location
	public static void  deletedatabasefolder() throws Exception {
		String sheetName = "SourceLocation";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		String hivision = dataxls.getCellData(sheetName, "InstallLocation", 2);
		String InstallLocation = hivision;
		String destination = InstallLocation+"\\database";
		FileUtils.deleteDirectory(new File(destination));
		System.out.println("Hivision database folder deleted successfully");
	}
	
public static void  start() throws FindFailed{
		
		Screen start = new Screen();
		String sheetName = "StopStartIHVServices";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\HiVisionHandlingSikuli.xlsx");
		String textstart = dataxls.getCellData(sheetName, "InputEnglish", 14);
		Pattern img1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img1.png");
		Pattern img2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img2.png");
		Pattern img3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img3.png");
		
		start.find(img1);
		start.click(img1);
		start.find(img2);
		start.click(img2);
		start.type(img2, textstart);
		start.wait(img3, 30*60);
		start.click(img3);
		
	}

public static void  launch() throws FindFailed{
	
Screen launch = new Screen();
String sheetName = "LaunchIHV";
ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\HiVisionHandlingSikuli.xlsx");
String textui = dataxls.getCellData(sheetName, "InputEnglish", 6);
String textpwd = dataxls.getCellData(sheetName, "InputEnglish", 14);
	
Pattern img1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img1.png");
Pattern img2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img2.png");
Pattern img3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\STOPSTART\\img3.png");
	
Pattern imgs1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs1.png");
	Pattern imgs2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs2.png");
	Pattern imgs3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs3.png");
	Pattern imgs4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs4.png");
	Pattern imgs5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs5.png");
	Pattern imgs6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs6.png");
	Pattern imgs7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs7.png");
	Pattern imgs8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\PWDENTERY\\imgs8.png");
	
	launch.find(img1);
	launch.click(img1);
	launch.find(img2);
	launch.click(img2);
	launch.type(img2, textui);
	launch.wait(img3, 30*60);
	launch.click(img3);
	
	launch.waitVanish(imgs1, 30*60);
	launch.wait(imgs2, 30*60);
	
	launch.find(img3);
	launch.type(imgs3, textpwd);
	launch.find(imgs4);
	launch.click(imgs4);
	launch.waitVanish(imgs1, 30*60);
	launch.wait(imgs5, 30*60);
	launch.find(imgs6);
	launch.click(imgs6);
	
	launch.find(imgs7);
	launch.exists(imgs7);
	launch.hover(imgs8);
	launch.click(imgs8);
}

public static void exitgui() throws FindFailed{
	Screen exit = new Screen();
	
	Pattern imgs1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs1.png");
	Pattern imgs2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs2.png");
	Pattern imgs3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs3.png");
	Pattern imgs4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs4.png");
	Pattern imgs5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs5.png");
	Pattern imgs6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EXITIHVGUI\\imgs6.png");
	
	exit.find(imgs1);
	exit.click(imgs1);
	exit.find(imgs2);
	exit.click(imgs2);
	exit.find(imgs3);
	exit.click(imgs3);
	exit.wait(imgs4, 30*60);
	exit.find(imgs5);
	exit.click(imgs5);
	
	exit.waitVanish(imgs6, 30*60);
	
	
}	
	

			//1 - Stop IHV Services from cmdline		
			public static void  stopService() throws InterruptedException, FindFailed, Exception{
				
				Screen stop = new Screen();
				
				Pattern stop1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop1.png");
				Pattern stop2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop2.png");
				Pattern stop3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop3.png");
				Pattern stop4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop4.png");
				Pattern stop5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop5.png");
				Pattern stop6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StopServices\\stop6.png");
				
				System.out.println("Stopping HiVision Services...");
				stop.find(stop1);
				stop.click(stop2);
				stop.wait(stop3, 30*60);
				stop.find(stop3);
				stop.type(stop4, "Stop");
				stop.find(stop5);
				stop.click(stop6);
			}	
		
		
	//2-Delete db folder from IHV installed location
	public static void  deletedbfolder() throws Exception {
				String destination = "C:\\Program Files\\Hirschmann\\Industrial HiVision 6.0\\database" ;
				FileUtils.deleteDirectory(new File(destination));
				System.out.println("Hivision database folder deleted successfully");
	}
	
	//3 - Consolidated all usecases - Launch IHV + enter password + minimize IHV
	public static void consolidatedUsecases() throws FindFailed, Exception{
		
		Screen start = new Screen();
		
		Pattern im1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting1.png");
		Pattern im2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting2.png");
		Pattern im3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting3.png");
		Pattern im4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting4.png");
		Pattern im5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting5.png");
		Pattern im6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting6.png");
		Pattern im7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting7.png");
		Pattern im8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting8.png");
		Pattern im9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\starting9.png");
		Pattern pat1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd1.png");
		Pattern pat2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd2.png");
		Pattern pat3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd3.png");
		Pattern pat4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd4.png");
		Pattern pat5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd5.png");
		//Pattern pat6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd6.png");
		//Pattern pat7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd7.png");
		Pattern pat8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd8.png");
		Pattern pat9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd9.png");
		Pattern pat10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd10.png");
		Pattern pat11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd11.png");
		Pattern pat12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd12.png");
		Pattern pat13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\consolidatedUsecases\\pwd13.png");
		
		System.out.println("UseCase-1: Start IHV Services");
		System.out.println("Find Windows Icon on screen");
		start.find(im1);
		System.out.println("click on Windows Icon on screen");
		start.click(im2);
		start.find(im3);
		start.click(im4);
		start.type(im5, "Start");
		start.find(im6);
		start.click(im7);
		System.out.println("Hivision Service is starting....");
		System.out.println("Launch IHV Application");
		start.find(im1);
		System.out.println("click on Windows Icon on screen");
		start.click(im2);
		start.find(im3);
		start.click(im4);
		start.type(im5, "HiVision");
		start.wait(im8);
		start.click(im9);
		System.out.println("HiVision Application is Launching ...");

		System.out.println("UseCase-2: Enter User authentication");
		start.wait(pat1,30*60);
		start.exists(pat1,30*60);
		start.find(pat2);
		start.click(pat3);
		start.type(pat4, "admin123");
		start.find(pat5);
		start.click(pat5);
		start.waitVanish(pat8, 30*60);
		start.find(pat9);
		start.click(pat10);
		
		System.out.println("UseCase-3: Minimize IHV GUI");
		start.exists(pat11, 30*60);
		start.hover(pat12);
		start.click(pat13);
		System.out.println("Done");
		
	}
	
	
	//2-Start IHV Services
	public static void  startIHVServices() throws InterruptedException, FindFailed {
				Screen start = new Screen();
				
				Pattern im1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin1.png");
				Pattern im2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin2.png");
				Pattern im3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin3.png");
				Pattern im4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin4.png");
				Pattern im5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin5.png");
				Pattern im6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin6.png");
				Pattern im7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\StartHIVServices\\winIcin7.png");
							
				System.out.println("Launch HiVision Services");
				System.out.println("Find Windows Icon on screen");
				start.find(im1);
				System.out.println("click on Windows Icon on screen");
				start.click(im2);
				start.find(im3);
				start.click(im4);
				start.type(im5, "Start");
				start.find(im6);
				start.click(im7);
				System.out.println("Hivision Service is starting....");
			}

	//3-Launch IHV GUI
	public static void  launchIHV() throws FindFailed, Exception{
			
			Screen launch = new Screen();
			
			Pattern p1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a1.png");
			Pattern p2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a2.png");
			Pattern p3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a3.png");
			Pattern p4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a4.png");
			Pattern p5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a5.png");
			Pattern p6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a6.png");
			Pattern p7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\LaunchHIV\\a7.png");
			
			System.out.println("Launch Application");
			launch.find(p1);
			launch.click(p2);
			launch.find(p3);
			launch.click(p4);
			launch.type(p5, "HiVision");
			launch.wait(p6);
			launch.click(p7);
		}

	//4-Enter password
	public static void  enteringPwd() throws FindFailed, Exception{
				
				Screen pwd = new Screen();
				
				Pattern pat0 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd0.png");
				Pattern pat1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd1.png");
				Pattern pat2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd2.png");
				Pattern pat3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd3.png");
				Pattern pat4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd4.png");
				Pattern pat5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd5.png");
				Pattern pat6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd6.png");
				Pattern pat7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd7.png");
				Pattern pat8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd8.png");
				Pattern pat9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd6.png");
				Pattern pat10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd7.png");
				Pattern pat11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnterPWD\\pwd8.png");
				
				System.out.println("User Authentication Start-ups");
				System.out.println("Enter password in Login window");
				pwd.wait(pat1,30*60);
				pwd.exists(pat1,30*60);
				pwd.find(pat2);
				pwd.click(pat3);
				pwd.type(pat4, "admin123");
				pwd.find(pat5);
				pwd.click(pat6);
				pwd.waitVanish(pat7, 30*60);
				System.out.println("Close window by tapping Cancel button");
				try	{
				pwd.exists(pat8);
				pwd.click(pat9);
				} catch(Exception e)	{
					System.out.println("This is not first time");
				}
				System.out.println("Minimize the HiVision Application");
				pwd.find(pat10);
				pwd.click(pat10);
				
				System.out.println("HiVision is running successfully");
			}
		
		
	//5 Exit IHV GUI
	public static void  exiHiVisionGUI() throws FindFailed, Exception	{
				
				Screen st = new Screen();
				
				Pattern image1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa1.png");
				Pattern image2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa2.png");
				Pattern image3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa3.png");
				Pattern image4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa4.png");
				Pattern image5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa5.png");
				Pattern image6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa6.png");
				Pattern image7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa7.png");
				Pattern image8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa8.png");
				Pattern image9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\ExitHiVision\\aa9.png");
				
				st.find(image1);
				st.click(image2);
				st.find(image3);
				st.click(image4);
				st.find(image5);
				st.click(image6);
				st.find(image7);
				st.find(image8);
				st.click(image9);
			}
	
	
	//6 - Enabling https way-1
	public static void  HttpsEnablings() throws FindFailed, InterruptedException{

	Screen great = new Screen();
		
	Pattern img0 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img0.png");
	Pattern img1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img1.png");
	Pattern img2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img2.png");
	Pattern img3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img3.png");
	Pattern img4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img4.png");
	Pattern img5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img5.png");
	Pattern img6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img6.png");
	Pattern img7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img7.png");
	Pattern img8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img8.png");
	Pattern img9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img9.png");
	Pattern img10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img10.png");
	Pattern img11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img11.png");
	Pattern img12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img12.png");
	Pattern img13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img13.png");
	Pattern img14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img14.png");
	Pattern img15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img15.png");
	Pattern img16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img16.png");
	Pattern img17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img17.png");
	Pattern img18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img18.png");
	Pattern img19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img19.png");
	Pattern img20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img20.png");
	Pattern img21 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img21.png");
	Pattern img22 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img22.png");
	Pattern img23 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img23.png");
	Pattern img24 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img24.png");
	Pattern img25 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img25.png");
	Pattern img26 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img26.png");
	Pattern img27 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img27.png");
	Pattern img28 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img28.png");
	Pattern img29 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img29.png");
	Pattern img30 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img30.png");
	Pattern img31 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img31.png");
	Pattern img32 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img32.png");
	Pattern img33 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HTTPSEnabling\\img33.png");
	
	System.out.println("Start");
	great.click(img0);
	great.find(img2);
	great.click(img3);
	great.click(img4);
	great.find(img5);
	great.click(img6);
	great.find(img7);
	great.click(img8);
	great.wait(img9);
	great.find(img10);
	great.click(img11);
	great.wait(img12);
	great.find(img13);
	great.find(img14);
	great.click(img15);
	great.find(img16);
	great.click(img17);
	great.find(img18);
	great.click(img19);
	great.find(img20);
	great.click(img21);
	great.find(img22);
	great.click(img23);
	great.find(img24);
	great.click(img25);
	great.find(img26);
	great.click(img27);
	great.wait();
	great.find(null);
	great.click();
	great.click();
	great.wait(img28, 30*60);
	great.waitVanish(img29, 30*60);
	great.wait(img30, 30*60);
	great.hover(img31);
	great.find(img32);
	great.click(img33);
	
	}
	
	//7 - Enabling https way-2
	public static void  enableHttps() throws FindFailed, Exception{
		
		Screen https = new Screen();
		
		Pattern imghttps1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https1.png");
		Pattern imghttps2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https2.png");
		Pattern imghttps3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https3.png");
		Pattern imghttps4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https4.png");
		Pattern imghttps5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https5.png");
		Pattern imghttps6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https6.png");
		Pattern imghttps7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https7.png");
		Pattern imghttps8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https8.png");
		Pattern imghttps9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https9.png");
		Pattern imghttps10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https10.png");
		Pattern imghttps11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https11.png");
		Pattern imghttps12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https12.png");
		Pattern imghttps13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https13.png");
		Pattern imghttps14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https14.png");
		Pattern imghttps15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https15.png");
		Pattern imghttps16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https16.png");
		Pattern imghttps17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https17.png");
		Pattern imghttps18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https18.png");
		Pattern imghttps19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https19.png");
		Pattern imghttps20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https20.png");
		Pattern imghttps21 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https21.png");
		Pattern imghttps22 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https22.png");
		Pattern imghttps23 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https23.png");
		Pattern imghttps24 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https24.png");
		Pattern imghttps25 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https25.png");
		Pattern imghttps26 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https26.png");
		Pattern imghttps27 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https27.png");
		Pattern imghttps28 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\https28.png");
		Pattern imghttps29 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img28.png");
		Pattern imghttps30 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img29.png");
		Pattern imghttps31 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img30.png");
		Pattern imghttps32 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img31.png");
		Pattern imghttps33 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img32.png");
		Pattern imghttps34 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableHTTPS\\img33.png");
		
		System.out.println("Enable https functionality from Hi-Vision");
		https.find(imghttps1);
		https.click(imghttps2);
		System.out.println("Tap on preferences");
		https.find(imghttps3);
		https.click(imghttps4);
		System.out.println("Select display");
		https.click(imghttps5);
		https.find(imghttps6);
		System.out.println("Select Services");
		https.click(imghttps7);
		https.find(imghttps8);
		System.out.println("Select web services protocol");
		https.click(imghttps9);
		https.wait(imghttps10);
		System.out.println("Click Edit button");
		https.find(imghttps11);
		https.click(imghttps12);
		System.out.println("Windows with drop down options appears");
		https.wait(imghttps13);
		https.find(imghttps14);
		System.out.println("Select https");
		https.find(imghttps15);
		https.click(imghttps16);
		System.out.println("Click Ok");
		https.find(imghttps17);
		https.click(imghttps18);
		System.out.println("Click Ok");
		https.find(imghttps19);
		https.click(imghttps20);
		System.out.println("Click Apply");
		https.find(imghttps21);
		https.click(imghttps22);
		System.out.println("Click Ok");
		https.find(imghttps23);
		https.click(imghttps24);
		System.out.println("Window appears");
		https.find(imghttps25);
		https.click(imghttps26);
		System.out.println("Select Yes");
		https.find(imghttps27);
		https.click(imghttps28);
		System.out.println("Now, https is enabled in IHV");
		System.out.println("It will re-start the Services of Hi-Vision");
	}
	
	//8 - Disable https
	public static void  disableHttps() throws FindFailed, Exception{
		
		Screen http = new Screen();
		
		Pattern imghttp1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http1.png");
		Pattern imghttp2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http2.png");
		Pattern imghttp3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http3.png");
		Pattern imghttp4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http4.png");
		
		Pattern imghttp5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http5.png");
		Pattern imghttp6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http6.png");
		Pattern imghttp7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http7.png");
		Pattern imghttp8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http8.png");
		
		Pattern imghttp9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http9.png");
		Pattern imghttp10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http10.png");
		Pattern imghttp11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http11.png");
		Pattern imghttp12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http12.png");
		
		Pattern imghttp13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http13.png");
		Pattern imghttp14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http14.png");
		Pattern imghttp15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http15.png");
		Pattern imghttp16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http16.png");
		
		Pattern imghttp17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http17.png");
		Pattern imghttp18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http18.png");
		Pattern imghttp19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http19.png");
		Pattern imghttp20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http20.png");
		
		Pattern imghttp21 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http21.png");
		Pattern imghttp22 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http22.png");
		Pattern imghttp23 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http23.png");
		Pattern imghttp24 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http24.png");
		
		Pattern imghttp25 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http25.png");
		Pattern imghttp26 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Disablehttps\\http26.png");
		
		
		
		System.out.println("Disable https functionality from Hi-Vision");
		
		
		http.find(imghttp1);
		
		http.click(imghttp2);
		
		
		http.find(imghttp3);
		
		http.click(imghttp4);
		
		
		http.click(imghttp5);
		
		
		
		http.find(imghttp6);
		
		http.click(imghttp7);
		
		
		
		http.find(imghttp8);
		
		http.click(imghttp9);
		
		
		http.wait(imghttp10);
		
		
		http.find(imghttp11);
		
		http.click(imghttp12);
		
		
		http.find(imghttp13);
		
		
		http.find(imghttp14);
		
		http.click(imghttp15);
		
		
		http.click(imghttp16);
		
		
		http.find(imghttp17);
		
		http.click(imghttp18);
		
		
		http.find(imghttp19);
		
		http.click(imghttp20);
		
		
		http.find(imghttp21);
		
		http.click(imghttp22);
		
		
		http.find(imghttp23);
		
		http.click(imghttp24);
		
					
		System.out.println("Now, https is disabled in IHV or http is enabled for IHV");
		System.out.println("It will re-start the Services of Hi-Vision");
	}
	
	//8
	public static void enableUsrMangmnt() throws FindFailed, Exception{
		
		Screen enable = new Screen();
		
		Pattern ee1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee1.png");
		Pattern ee2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee2.png");
		Pattern ee3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee3.png");
		Pattern ee4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee4.png");
		Pattern ee5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee5.png");
		
		Pattern ee6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee6.png");
		Pattern ee7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee7.png");
		Pattern ee8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee8.png");
		Pattern ee9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee9.png");
		Pattern ee10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee10.png");
		
		Pattern ee11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee11.png");
		Pattern ee12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee12.png");
		Pattern ee13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee13.png");
		Pattern ee14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee14.png");
		Pattern ee15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee15.png");
		
		
		Pattern ee16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee16.png");
		Pattern ee17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee17.png");
		Pattern ee18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee18.png");
		Pattern ee19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee19.png");
		Pattern ee20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\EnableUsrMangmnt\\ee20.png");
		
		System.out.println("Launch IHV");
		
		enable.find(ee1);
		
		enable.click(ee2);
		
		enable.find(ee3);
		
		enable.click(ee4);
		
		System.out.println("Tap Preferences");
		enable.find(ee5);
		
		enable.click(ee6);
		
		enable.find(ee7);
		
		enable.click(ee8);
		
		enable.find(ee9);
		
		enable.click(ee10);
		
		System.out.println("Select User Management");
		enable.find(ee11);
		
		enable.click(ee12);
		System.out.println("Select local");
		
		enable.find(ee13);
		
		enable.click(ee14);
		
		enable.find(ee15);
		
		enable.click(ee16);
		
		System.out.println("Drag local to right side");
		enable.find(ee17);
		
		enable.click(ee18);
		
		enable.find(ee19);
		
		enable.click(ee20);
		System.out.println("Press Apply & Ok");
	}
	
	//9
	public static void  disableUsrManagement() throws FindFailed, Exception{
		Screen disable = new Screen();
		
		Pattern imgs1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab1.png");
		Pattern imgs2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab2.png");
		Pattern imgs3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab3.png");
		Pattern imgs4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab4.png");
		Pattern imgs5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab5.png");
		
		Pattern imgs6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab6.png");
		Pattern imgs7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab7.png");
		Pattern imgs8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab8.png");
		Pattern imgs9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab9.png");
		Pattern imgs10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab10.png");
		
		Pattern imgs11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab11.png");
		Pattern imgs12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab12.png");
		Pattern imgs13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab13.png");
		Pattern imgs14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab14.png");
		Pattern imgs15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab15.png");
		
		Pattern imgs16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab16.png");
		Pattern imgs17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab17.png");
		Pattern imgs18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab18.png");
		Pattern imgs19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab19.png");
		Pattern imgs20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\DisableUsrMangmnt\\ab20.png");
		
		System.out.println("Disable User Management");
		
		disable.find(imgs1);
		
		disable.click(imgs2);
		
		System.out.println("Launch IHV");
		
		disable.find(imgs3);
		
		disable.click(imgs4);
		
		disable.find(imgs5);
		
		disable.click(imgs6);
		
		System.out.println("Select preferences");
		
		disable.find(imgs7);
		
		disable.click(imgs8);
		
		System.out.println("Select user Management");
		
		disable.find(imgs9);
		
		disable.click(imgs10);
		
		disable.find(imgs11);
		
		disable.click(imgs12);
		
		System.out.println("Select local");
		
		disable.find(imgs13);
		
		disable.click(imgs14);
		
		System.out.println("Take local back");
		
		disable.wait(imgs15);
		
		disable.find(imgs16);
		
		System.out.println("Press Apply");
		
		disable.click(imgs17);
		
		disable.click(imgs18);
		
		disable.find(imgs19);
		
		disable.click(imgs20);
		System.out.println("Ok");
	}
	//10
	public static void  exportCSVfromHiVision() throws FindFailed, Exception{
		
		Screen exportCsv = new Screen();
		
		Pattern export1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp1.png");
		Pattern export2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp2.png");
		
		Pattern export3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp3.png");
		Pattern export4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp4.png");
		Pattern export5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp5.png");
		Pattern export6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp6.png");
		Pattern export7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp7.png");
		Pattern export8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp8.png");
		Pattern export9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp9.png");
		Pattern export10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp10.png");
		
		Pattern export11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp11.png");
		Pattern export12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp12.png");
		Pattern export13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp13.png");
		Pattern export14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp14.png");
		Pattern export15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp15.png");
		Pattern export16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp16.png");
		Pattern export17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp17.png");
		Pattern export18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp18.png");
		
		Pattern export19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\exportCSVfromHiVision\\exp19.png");
		
		System.out.println("Start Execution Sikuli Tests for exporting CSV file from HiVision");
		
		System.out.println("Step1: Find HiVision icon in Bottom bar");
		exportCsv.find(export1);
		
		System.out.println("Step2: Click on HiVision icon in Bottom bar to focus on HiVision Application");
		exportCsv.click(export2);
		
		System.out.println("Step3: Find File icon in HiVision at top-left-corner");
		exportCsv.find(export3);
		
		System.out.println("Step4: Click file icon shown the Context menu list");
		exportCsv.click(export4);
		
		System.out.println("Step5: Find Export Event option from the list of Context Menu");
		exportCsv.find(export5);
		
		System.out.println("Step6: Select Export Event option from the list of Context Menu");
		exportCsv.click(export6);
		
		System.out.println("Step7: Find files of type in Save As window");
		exportCsv.find(export7);
		
		System.out.println("Step8: Click in dropdown option");
		exportCsv.click(export8);
		
		System.out.println("Step9: Select .csv option in Save As window");
		exportCsv.click(export9);
		
		System.out.println("Step10: Find events.csv file in Save As window");
		exportCsv.find(export10);
		
		System.out.println("Step11: Select events.csv file in Save As window");
		exportCsv.click(export11);
		
		System.out.println("Step12: Find Save button in Save As window");
		exportCsv.find(export12);
		
		System.out.println("Step13: Click Save button in Save As window");
		exportCsv.click(export13);
		
		System.out.println("Step14: wait & click OverWrite message window");
		exportCsv.click(export14);
		
		System.out.println("Step15: Find Yes button in OverWrite message window");
		exportCsv.find(export15);
		
		System.out.println("Step16: Save Yes button in OverWrite message window");
		exportCsv.click(export16);
		
		System.out.println("Step17: Find minimize button at right corner of IHV Application");
		exportCsv.find(export17);
		
		System.out.println("Step18: Hover minimize button at right corner of IHV Application");
		exportCsv.hover(export18);
		
		System.out.println("Step19: Click minimize button at right corner of IHV Application");
		exportCsv.click(export19);
		
		System.out.println("End Execution of Test Cases: while exporting the CSV file from HiVision Application");
	}
	
	//11
	public static void  exportCSVfromHiVision_new() throws FindFailed, Exception{
		
		Screen screen = new Screen();
		
		Pattern img = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\1_HiVisionIcon.png");
		Pattern img1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\2_HiVisionIcon1.png");
		Pattern img2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\3_FineIcon.png");
		Pattern img3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\4_FineIcon1.png");
		Pattern img4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\5_ExportEvents.png");
		Pattern img5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\6_SaveAsExplorer.png");
		Pattern img6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\7_SaveAsExplorer1.png");
		Pattern img7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\8_EditBoxFileName.png");
		Pattern img8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\9_EditBoxFileName1.png");
		Pattern img9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\10_SaveButton.png");
		Pattern img10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\11_AttentionWindow.png");
		Pattern img11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\12_YesButton.png");
		Pattern img12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\13_YesButton1.png");
		
		Pattern img13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\14_HiVisionIcon.png");
		Pattern img14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\SaveCSVImages\\15_HiVisionIcon.png");
		
		System.out.println("Start Execution Sikuli Tests");
		
		System.out.println("Step1: Find HiVision icon in Bottom bar");
		screen.find(img);
		
		System.out.println("Step2: Click on HiVision icon in Bottom bar to focus on HiVision Application");
		screen.click(img1);
		
		System.out.println("Step3: Find File icon in HiVision at top-left-corner");
		screen.find(img2);
		
		System.out.println("Step4: Click file icon shown the Context menu list");
		screen.click(img3);
		
		System.out.println("Step5: Select Export Event option from the list of Context Menu");
		screen.click(img4);
		
		System.out.println("Step6: Wait for Save as explorer window for exporting the CSV");
		screen.wait(img5);
		
		System.out.println("Step7: Find for Save as explorer window for exporting the CSV");
		screen.find(img6);
		
		System.out.println("Step8: Find Edit box in Save as window");
		screen.find(img7);
		
		System.out.println("Step9: Enter the name of CSV file into the Editbox");
		screen.type(img8, "events.csv");
		
		System.out.println("Step10: Click on Save button");
		screen.click(img9);
		
		System.out.println("Step11: Wait for attention alert for asking replacing the existing file");
		screen.wait(img10);
		
		System.out.println("Step12: Find Yes button in Alert window");
		screen.find(img11);
		
		System.out.println("Step13: Click on Yes button of Alert window");
		screen.click(img12);
		
		screen.find(img13);	
		System.out.println("Step15: Minimize the IHV Application");
		
		screen.click(img14);
		System.out.println("End Execution of Test Cases: HiVision");
	}
	//12
	public static void howToExportCsv() throws FindFailed, Exception{
				
		Screen exporting = new Screen();
				
				Pattern csvimg1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg1.png");
				Pattern csvimg2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg2.png");
				Pattern csvimg3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg3.png");
				Pattern csvimg4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg4.png");
				Pattern csvimg5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg5.png");
				Pattern csvimg6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg6.png");
				
				Pattern csvimg7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg7.png");
				Pattern csvimg8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg8.png");
				Pattern csvimg9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg9.png");
				Pattern csvimg10 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg10.png");
				Pattern csvimg11 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg11.png");
				
				Pattern csvimg12 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg12.png");
				Pattern csvimg13 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg13.png");
				
				Pattern csvimg14 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg1415.png");
				Pattern csvimg15 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg15.png");
				Pattern csvimg16 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg16.png");
				Pattern csvimg17 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg17.png");
				
				Pattern csvimg18 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg18.png");
				Pattern csvimg19 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg19.png");
				
				Pattern csvimg20 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg20.png");
				Pattern csvimg21 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg21.png");
				Pattern csvimg22 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg22.png");
				Pattern csvimg23 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg23.png");
				Pattern csvimg24 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg24.png");
				Pattern csvimg25 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg25.png");
				Pattern csvimg26 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg26.png");
				Pattern csvimg27 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg27.png");
				Pattern csvimg28 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg28.png");
				Pattern csvimg29 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg29.png");
				Pattern csvimg30 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg30.png");
				
				Pattern csvimg31 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg31.png");
				Pattern csvimg32 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HowExportCSV\\csvImg32.png");
				
				
				try	{
				
				System.out.println("Start Test - Export CSV file");
				Thread.sleep(5000);
				exporting.exists(csvimg1);
				
				exporting.click(csvimg2);
				
				exporting.find(csvimg3);
				
				exporting.click(csvimg4);
				
				exporting.find(csvimg5);
				
				exporting.click(csvimg6);
				
				
				exporting.find(csvimg7);
				
				exporting.click(csvimg8);
				
				exporting.find(csvimg9);
				
				exporting.doubleClick(csvimg10);
				
				exporting.doubleClick(csvimg11);
				
				exporting.dragDrop(csvimg12, csvimg13);
				
				exporting.doubleClick(csvimg14);
				
				exporting.doubleClick(csvimg15);
				
				exporting.doubleClick(csvimg16);
				
				exporting.doubleClick(csvimg17);
				
				exporting.doubleClick(csvimg18);
				
				exporting.doubleClick(csvimg19);
				
				exporting.find(csvimg20);
				
				exporting.click(csvimg21);
				
				exporting.click(csvimg22);
				
				exporting.find(csvimg23);
				
				exporting.click(csvimg24);
				
				exporting.find(csvimg25);
				
				exporting.click(csvimg26);
				
				exporting.wait(csvimg27, 10);
				
				exporting.find(csvimg28);
				
				exporting.click(csvimg29);
				if(exporting.exists(csvimg30)!=null){
				
				exporting.hover(csvimg31);
				
				exporting.click(csvimg32);
				} else	{
				exporting.find(csvimg1);
				exporting.click(csvimg2);
				}
		} catch(Throwable t)	{
			
			    Process p = Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Driver\\SikuliBatchFiles\\exportCSV.bat");
				p.waitFor();
		}
				
	}
	
	//13
	public static void  launchCSVFile() throws Exception{
		Screen row = new Screen();
		//Delete rows
		Pattern imaA = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\deleteSingleRowCSV\\imgA.png");
		Pattern imaB = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\deleteSingleRowCSV\\imgB.png");
		Pattern imaC = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\deleteSingleRowCSV\\imgC.png");
		Pattern imaD = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\deleteSingleRowCSV\\imgD.png");
		//Save & Close
		Pattern imA = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im1.png");
		Pattern imB = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im2.png");
		Pattern imC = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im3.png");
		Pattern imD = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im4.png");
		Pattern imE = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im5.png");
		Pattern imF = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im6.png");
		Pattern imG = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im7.png");
		Pattern imH = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im8.png");
		Pattern imI = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im9.png");
		Pattern imJ = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im10.png");
		Pattern imK = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im11.png");
		Pattern imL = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im12.png");
		Pattern imM = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im13.png");
		Pattern imN = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im14.png");
		Desktop desktop = Desktop.getDesktop();
		System.out.println("Launch CSV file");
        File fileToOpen = null;
        try {
            fileToOpen = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv");
            desktop.open(fileToOpen);
            
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
        
        System.out.println("CSV File Launched successfully");
        
        System.out.println("Delete first row from csv");
		row.find(imaA);
		
		row.rightClick(imaB);
		
		row.find(imaC);
		
		row.click(imaD);
		
		System.out.println("First row deleted successfully");
		System.out.println("Delete second row from csv");
		row.find(imaA);
		
		row.rightClick(imaB);
		
		row.find(imaC);
		
		row.click(imaD);
		
		System.out.println("Second row deleted successfully");
		System.out.println("Delete third row from csv");
		row.find(imaA);
		
		row.rightClick(imaB);
		
		row.find(imaC);
		
		row.click(imaD);
		
		System.out.println("Third row deleted successfully");
		System.out.println("Delete fourth row from csv");
		row.find(imaA);
		
		row.rightClick(imaB);
		
		row.find(imaC);
		
		row.click(imaD);
		
		System.out.println("Fourth row deleted successfully");
		
		System.out.println("Now, save & close the CSV file successfully");
		
		row.find(imA);
		
		row.click(imB);
		
		row.find(imC);
		
		row.click(imD);
		
		row.find(imE);
		
		row.click(imF);
		
		row.find(imG);
		
		row.click(imH);
		
		row.find(imI);
		
		row.click(imJ);
		
		row.find(imK);
		
		row.click(imL);
		
		row.find(imM);
		
		row.click(imN);
		
		System.out.println("CSV File saved and closed successfully");
    }
	
	//14
	public static void  minimaxmizeIHVApp() throws InterruptedException, FindFailed{
			
			Screen minimixing = new Screen();
			Pattern minicon1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin1.png");
			Pattern minicon2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin2.png");
			Pattern minicon3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin3.png");
			Pattern minicon4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin4.png");
			Pattern minicon5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin5.png");
			Pattern minicon6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin6.png");
			Pattern minicon7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin7.png");
			Pattern minicon8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\Minimized\\iconmin8.png");
			
			minimixing.wait(minicon1, 30*60);
			minimixing.exists(minicon2, 30*60);
			minimixing.find(minicon3);
			minimixing.hover(minicon4);
			minimixing.hover(minicon5);
			minimixing.find(minicon6);
			minimixing.click(minicon7);
			
			System.out.println("HiVision App minimises");
		}
		//15
		public static void  focusOnEclipse() throws FindFailed{
			
			Screen focus = new Screen();
			Pattern eclicon1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\FocusEclipse\\eclipseicon1.png");
			Pattern eclicon2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\FocusEclipse\\eclipseicon2.png");
			
			focus.find(eclicon1);
			focus.click(eclicon2);
			
			
		}
		//16
		public static void  saveAndClosedCSV() throws FindFailed, Exception{
			
			Screen saved = new Screen();
			Pattern imA = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im1.png");
			Pattern imB = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im2.png");
			Pattern imC = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im3.png");
			Pattern imD = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im4.png");
			
			Pattern imE = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im5.png");
			Pattern imF = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im6.png");
			Pattern imG = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im7.png");
			Pattern imH = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im8.png");
			
			Pattern imI = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im9.png");
			Pattern imJ = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im10.png");
			Pattern imK = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im11.png");
			Pattern imL = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im12.png");
			
			Pattern imM = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im13.png");
			Pattern imN = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\saveAndClosedCSV\\im14.png");
			
			saved.find(imA);
			saved.click(imB);
			
			saved.find(imC);
			saved.click(imD);
			
			saved.find(imE);
			saved.click(imF);
			
			saved.find(imG);
			saved.click(imH);
			
			saved.find(imI);
			saved.click(imJ);
			
			saved.find(imK);
			saved.click(imL);
			
			saved.find(imM);
			saved.click(imN);
			

			}	
		
		//17
		public HiVisionSikuli waitingOneMin() throws Exception{
			Thread.sleep(30000);
			System.out.println("30 seconds are Over");
			Thread.sleep(30000);
			System.out.println("1 min is completed");
			return this;
		}
		
		//18
		public static void  IHVGUIServicesStopping() throws FindFailed, Exception{
			try	{	
			Screen stop = new Screen();
				
				Pattern imgst1 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11a.png");
				Pattern imgst2 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11b.png");
				Pattern imgst3 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11c.png");
				Pattern imgst4 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11d.png");
				Pattern imgst5 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11e.png");
				Pattern imgst6 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11f.png");
				
				Pattern imgst7 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11g.png");
				Pattern imgst8 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11h.png");
				Pattern imgst9 = new Pattern(System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\Images\\HIVStopped\\a11i.png");
				
				System.out.println("Stop HiVision Services");
				stop.find(imgst1);
				
				stop.click(imgst2);
				stop.find(imgst3);
				stop.click(imgst4);
				stop.find(imgst5);
				stop.click(imgst6);
				stop.find(imgst7);
				stop.click(imgst8);
			}	catch(Throwable t)	{
				
				System.out.println("For Generic Execution");
					Process p = Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Driver\\SikuliBatchFiles\\stopIHVGUI.bat");
					p.waitFor();
			}
		System.out.println("HiVision Services are Stopping...");
	}

		
		
		
		
}
