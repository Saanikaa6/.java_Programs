import java.io.*;  
import java.net.*;  // networking chya concept aslel package

class Server
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting for client at port number 2100");

        Socket sobj = ssobj.accept();   //Accepts the request from the client
        System.out.println("Connection established with the client..");
    
        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader((System.in)));
        String str1, str2;
        System.out.println("Marvellous Chat Messenger application started...");
        while((str1 = br1.readLine()) !=null)
        {
            System.out.println("Client says : "+str1);
            System.out.println("Enter the message for Client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank You for using the Marvellous Chat Application..");
    }
}
