package rmiserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiservice.ConversionImpl;

public class ConversionServer {
	public static void main(String[] args) throws MalformedURLException {
		try {
			LocateRegistry.createRegistry(1099);
			//skeleton
			ConversionImpl od=new ConversionImpl(); //hedhy tsna3 beha un skeleton,kif 3ayett ll super tsna3 skeleton
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/ObjetDistant", od);
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
	}
}
