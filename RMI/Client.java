/*Client.java*/
import java.io.*;
import java.net.*;
import java.rmi.*;
public class Client{
	public static void main(String args[]){
		try{
			String URL="rmi://localhost/Server";

			multiply m=(multiply)Naming.lookup(URL);
			System.out.println("number of items purchased:"+args[0]);
			int a=Integer.parseInt(args[0]);
			System.out.println("Unit price"+args[1]);
			int b=Integer.parseInt(args[1]);
			System.out.println("The total is"+m.multiply(a,b));

			time t=(time)Naming.lookup(URL);
			System.out.println("The time is: "+t.time());
		}catch(Exception e){
			System.out.println("Exception"+e);
		}
	}
}
