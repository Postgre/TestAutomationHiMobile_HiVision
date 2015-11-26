package himobile.utils;

import java.io.IOException;

public class AppiumServer {

	//Appium Launch on Windows
		private static Process process;

		//Calling the node.exe and appium.js
		private static String STARTSERVER = "C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";

		//Starting the Appium Server
		public static void start() throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		process = runtime.exec(STARTSERVER);
		Thread.sleep(20000);
		if (process != null) {
		System.out.println("Appium server started");
		}
		}
		//Stopping the Appium Server
		public static void stop() throws IOException {
		if (process != null) {
		process.destroy();
		}
		System.out.println("Appium server stopped");

		}
}

