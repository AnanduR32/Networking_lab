import java.net.*;
import java.util.*;
import java.io.*;

class UDPClient{
	public static void main(String a[])throws IOException{
		DatagramSocket dgs = new DatagramSocket();
		System.out.println("\nEstablishing UDP connection...");		
		byte[] sendData = new byte[1024];
		byte[] receiveData = new byte[1024];
		Scanner sc = new Scanner(System.in);
		String data1 = new String();
		data1 = sc.nextLine();
		sendData = data1.getBytes();
		System.out.println("\nSending packets Server..."); 
		DatagramPacket dgp1 = new DatagramPacket(sendData,sendData.length,InetAddress.getByName("localhost"),8088);
		dgs.send(dgp1);		
		System.out.println("\nMessage sent to the Server");
		System.out.println("\nWaiting for packets to be received...");
		DatagramPacket dgp2 = new DatagramPacket(receiveData,receiveData.length);
		dgs.receive(dgp2);
		String data2 = new String(dgp2.getData());
		System.out.println("\nMessage recieved from Server: "+data2);		
	}
} 	
