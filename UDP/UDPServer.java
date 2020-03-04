import java.net.*;
import java.io.*;
import java.util.*;

class UDPServer{
	public static void main(String a[])throws IOException{
		DatagramSocket dgs = new DatagramSocket(8088);
		System.out.println("\nUDP...");		
		byte[] sendData = new byte[1024];
		byte[] receiveData = new byte[1024];
		System.out.println("\nWaiting for packets to be received...");
		DatagramPacket dgp1 = new DatagramPacket(receiveData,receiveData.length);
		dgs.receive(dgp1);
		String data1 = new String(dgp1.getData());
		System.out.println("\nMessage recieved from Client: "+data1);
		InetAddress iObj = dgp1.getAddress();
		int port = dgp1.getPort();
		Scanner sc = new Scanner(System.in);
		String data2 = new String();
		data2 = sc.nextLine();
		sendData = data2.getBytes();
		System.out.println("\nSending packets Server...");
		DatagramPacket dgp2 = new DatagramPacket(sendData,sendData.length,iObj,port);
		dgs.send(dgp2);		
		System.out.println("\nMessage sent to the Client");		
				
	}
}
