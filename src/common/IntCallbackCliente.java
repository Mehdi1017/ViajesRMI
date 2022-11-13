package common;

import java.rmi.RemoteException;

public interface IntCallbackCliente extends java.rmi.Remote{
    public void notificame(String mensaje) throws RemoteException;
}
