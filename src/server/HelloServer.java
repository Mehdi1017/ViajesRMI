package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 * Esta clase es una adaptación del ejemplo Hello en RMI del libro de M. L. Liu.
 * Se a eliminado el gestor de seguridad puesto que su uso ha quedado obsoleto.
 */

public class HelloServer {
    public static void main(String args[]) {

        try {
            System.out.println("By default, the RMIregistry port number is 1099.");
            int RMIPortNum = 1099;

            startRegistry(RMIPortNum);

            HelloImpl exportedObj = new HelloImpl();
            String registryURL = "rmi://localhost:" + RMIPortNum + "/hello";
            Naming.rebind(registryURL, exportedObj);
            System.out.println("Server registered. Registry contains:");
            // list names currently in the registry
            listRegistry(registryURL);
            System.out.println("Hello Server ready.");
        }// end try
        catch (Exception re) {
            System.out.println("Exception in HelloServer.main: " + re);
        } // end catch
    } // end main

    // This method starts a RMI registry on the local host, if
    // it doesn't already exists at the specified port number.
    private static void startRegistry(int RMIPortNum)
            throws RemoteException {
        try {
            Registry registry = LocateRegistry.getRegistry(RMIPortNum);
            registry.list();  // This call will throw an
            //exception if the registry does not already exist
        } catch (RemoteException e) {
            // No valid registry at that port.
            System.out.println("RMI registry cannot be located at port " + RMIPortNum);
            Registry registry = LocateRegistry.createRegistry(RMIPortNum);
            System.out.println("RMI registry created at port " + RMIPortNum);
        }
    } // end startRegistry

    //This method lists the names registered with a Registry
    private static void listRegistry(String registryURL)
            throws RemoteException, MalformedURLException {
        System.out.println("Registry " + registryURL + " contains: ");
        String[] names = Naming.list(registryURL);
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
    } //end listRegistry

} // end class
