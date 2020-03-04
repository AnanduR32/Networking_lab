import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class Server extends UnicastRemoteObject implements multiply,time
{
	public Server() throws RemoteException{}
	public static void main(String args[])throws Exception{
		System.out.println("Server starts");
		Server s=new Server();
		Naming.rebind("Server",s);
	}public int multiply(int x1,int y1){
		return x1*y1;
	}public String time(){
		return (new Date().toString());
	}
}




























//46


//34,40,46, 52
