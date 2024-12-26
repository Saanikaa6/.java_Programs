import java.io.*;  
import java.net.*;  // networking chya concept aslel package

class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client application is running...");




        Socket sobj = new Socket("localhost",2100); //Request to server .. jr don laptops la kraych asel tr ith localhost takynya aaivaji ip address takaycha dusrya laptop cha
        System.out.println("Connection established with the Server..");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader((System.in)));
        String str1, str2;
        System.out.println("Marvellous Chat Messenger application started...");
        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter the message for Server : ");
            System.out.println("Server says : "+str2);
        }
        System.out.println("Thank You for using the Marvellous Chat Application..");
    }
}
