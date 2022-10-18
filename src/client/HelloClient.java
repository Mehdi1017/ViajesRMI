package client;

import common.HelloInterface;

import java.rmi.Naming;
import java.util.Scanner;

/**
 * Esta clase es una adaptación del ejemplo Hello del libro de M. L. Liu.
 * Se ha eliminado el gestor de seguridad puesto que ha quedado obsoleto
 */

public class HelloClient {

    public static void main(String args[]) {
        try {
            System.out.println("By default, the RMIRegistry host name is localhost and its RMIregistry port number is 1099.");
            String hostName = "localhost";
            int RMIPortNum = 1099;

            String registryURL = "rmi://" + hostName + ":" + RMIPortNum + "/hello";
            // find the remote object and cast it to an interface object
            HelloInterface h = (HelloInterface) Naming.lookup(registryURL);

            System.out.println("Lookup completed ");
            // invoke the remote method
            String message = h.sayHello();
            System.out.println("HelloClient: " + message);
        } // end try
        catch (Exception e) {
            System.out.println("Exception in HelloClient: " + e);
        }
    } //end main
}//end class
