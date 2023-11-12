package rmiservice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements Iconversion {
	
	//classe hedhy hiya l objet+l'interface avec service la méthode convertirmontant
	//protected si la classe ConversionServer existe dans le même package
	public ConversionImpl() throws RemoteException {
		super();
	}

	@Override
	public double convertirMontant(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt*3.3;
	}

}
