package himobile.rough;

import java.io.IOException;

import org.sikuli.script.FindFailed;

import himobile.sikuli.HiVisionSikuli;

public class TestSikuliScripting {

		public static void main(String[] args) throws FindFailed, Exception {
			
			HiVisionSikuli.stopService();
			Thread.sleep(20000);
			HiVisionSikuli.deletedatabasefolder();
			Thread.sleep(20000);
			HiVisionSikuli.consolidatedUsecases();
			Thread.sleep(20000);
			HiVisionSikuli.exiHiVisionGUI();
			System.out.println("Done");
			
	}

}
