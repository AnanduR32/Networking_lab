import java.io.*;
import java.net.*;
import java.util.*;
class tcpclient
{

public static void main(String args[]) throws Exception
{
String clientsentence, replysentence;
System.out.println("client side");
Socket clientsocket=new Socket("localhost",8800);
DataOutputStream outtoserver;
BufferedReader br;
Scanner s;
while(true)
{
 s = new Scanner(System.in);
System.out.println("Enter a message: ");
clientsentence=s.nextLine();
outtoserver=new DataOutputStream(clientsocket.getOutputStream());
outtoserver.writeBytes(clientsentence + '\n');
 br= new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
replysentence=br.readLine();
System.out.println("from server: " + replysentence);
}
}
}

