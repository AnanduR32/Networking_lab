/* the Remote Interface   multiply.java */

import java.rmi.*;
public interface multiply extends Remote
{
	int multiply(int x,int y)throws RemoteException;
}
