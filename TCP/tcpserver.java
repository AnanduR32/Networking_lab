import java.io.*;
import java.net.*;
import java.util.*;
class tcpserver{
public static void main(String args[]) throws Exception{
	String clientsentence,serversentence;
	ServerSocket welcomesocket=new ServerSocket(8800);
	Socket connectionsocket;
	System.out.println("server side ");
	connectionsocket=welcomesocket.accept();
	System.out.println("connection accepted ");
	while(true){
		BufferedReader infromclient=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
		clientsentence=infromclient.readLine();
		System.out.println("from client : "+clientsentence);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a message: ");
		serversentence=s.nextLine();
		DataOutputStream outtoclient=new DataOutputStream(connectionsocket.getOutputStream());
		outtoclient.writeBytes(serversentence+'\n');
		}
	}
}

