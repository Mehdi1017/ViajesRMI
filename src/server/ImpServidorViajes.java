package server;

import common.IntServidorViajes;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpServidorViajes extends UnicastRemoteObject implements IntServidorViajes {


    protected ImpServidorViajes() throws RemoteException {
        super();
    }

    @Override
    public JSONArray consultaViajes(String origen) throws RemoteException, IOException, ParseException {
        return null;
    }

    @Override
    public JSONObject reservaViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException {
        return null;
    }

    @Override
    public JSONObject anulaReserva(String codviaje, String codcli) throws RemoteException, IOException, ParseException {
        return null;
    }

    @Override
    public JSONObject ofertaViaje(String codcli, String origen, String destino, String fecha, long precio, long numplazas) throws RemoteException, IOException, ParseException {
        return null;
    }

    @Override
    public JSONObject borraViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException {
        return null;
    }
}
