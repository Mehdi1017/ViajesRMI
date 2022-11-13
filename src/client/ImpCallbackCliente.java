package client;

import common.IntCallbackCliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpCallbackCliente extends UnicastRemoteObject implements IntCallbackCliente {
    public ImpCallbackCliente() throws RemoteException {
        super();
    }

    public void notificame(String mensaje) throws RemoteException{
        System.out.println(mensaje);
    }
}
