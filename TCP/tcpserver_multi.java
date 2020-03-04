import java.io.*;
import java.net.*;
import java.util.*;
class tcpserver_multi{
	public static void main(String args[]) throws Exception{
		String clientsentence,serversentence;
		ServerSocket welcomesocket=new ServerSocket(8800);
		Socket connectionsocket1,connectionsocket2;
		System.out.println("server side ");
		connectionsocket1=welcomesocket.accept();
		System.out.println("connection accepted from client 1");
		connectionsocket2=welcomesocket.accept();
		System.out.println("connection accepted from client 2");
		
		BufferedReader infromclient=new BufferedReader(new InputStreamReader(connectionsocket1.getInputStream()));
		clientsentence=infromclient.readLine();
		System.out.println("from client : "+clientsentence);
		DataOutputStream outtoclient=new DataOutputStream(connectionsocket2.getOutputStream());
		outtoclient.writeBytes(clientsentence+'\n');
		

  		BufferedReader infromclient2=new BufferedReader(new InputStreamReader(connectionsocket2.getInputStream()));
		serversentence=infromclient2.readLine();
		System.out.println("from client : "+serversentence);
		DataOutputStream outtoclient2=new DataOutputStream(connectionsocket1.getOutputStream());
		outtoclient2.writeBytes(serversentence+'\n');
		


												
	}
}

