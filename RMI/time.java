/* the Remote Interface time.java */

import java.rmi.*;
public interface time extends Remote
{
	String time()throws RemoteException;
}
