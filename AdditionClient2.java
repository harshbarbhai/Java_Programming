import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running...");


        Socket sobj=new Socket("localhost",2100);//localhost or 127.0.0.1 which is ip address of localhost we should use
        System.out.println("Server Successfully connected");

        DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());
    }
}