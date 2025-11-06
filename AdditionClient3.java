import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running...");


        Socket sobj=new Socket("localhost",2100);//localhost or 127.0.0.1 which is ip address of localhost we should use
        System.out.println("Server Successfully connected");

        DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());

        int No1=11,No2=10;

        doobj.writeInt(No1);
        doobj.writeInt(No2);



        int Sum=diobj.readInt();
        System.out.println("Addition is:"+Sum);

        sobj.close();

        System.out.println("client application terminated");
    }
}