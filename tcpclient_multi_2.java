import java.io.*;
import java.net.*;
import java.util.*;
class tcpclient_multi_2{
	public static void main(String args[]) throws Exception{
		String clientsentence, replysentence;
		System.out.println("client side");
		Socket clientsocket=new Socket("localhost",8800);
		System.out.println("Connection Successful");
		DataOutputStream outtoserver;
		BufferedReader br;
		Scanner s;
		
		br= new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		replysentence=br.readLine();
		System.out.println("from server: " + replysentence);

s = new Scanner(System.in);
		System.out.println("Enter a message: ");
		clientsentence=s.nextLine();
		outtoserver=new DataOutputStream(clientsocket.getOutputStream());
		outtoserver.writeBytes(clientsentence + '\n');

	}
}

