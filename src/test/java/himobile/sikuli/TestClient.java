package himobile.sikuli;

import java.io.*;
import java.net.*;

public class TestClient {
	
	PrintStream streamToServer;
    BufferedReader streamFromServer;
    Socket toServer;
    public TestClient()
    {
       connectToServer();
    }
    private void connectToServer()
    {
        try{
            String name;
            toServer = new Socket("10.11.244.181",1001);
            streamFromServer = new BufferedReader(new InputStreamReader((toServer.getInputStream())));
            streamToServer = new PrintStream(toServer.getOutputStream());
            System.out.println("Enter Connection Name");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            name = reader.readLine();   
            streamToServer.println(name);
            String str = streamFromServer.readLine();
            System.out.println("The Server Says "+str);         
        }
        catch(Exception e)
        {
                System.out.println("Exception "+e);
        }       
    }
    public static void main(String args[])
    {
        new TestClient();
    }

}
