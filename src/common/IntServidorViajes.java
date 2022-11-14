package common;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IntServidorViajes extends Remote {
    public void guardaDatos(IntCallbackCliente cliente) throws RemoteException;
    public JSONArray consultaViajes(String origen) throws RemoteException, IOException, ParseException;
    public JSONObject reservaViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
    public JSONObject anulaReserva(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
    public JSONObject ofertaViaje(String codcli, String origen, String destino, String fecha, long precio, long numplazas) throws RemoteException, IOException, ParseException;
    public JSONObject borraViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
    public void registrarNotificacion(String origen, IntCallbackCliente cliente) throws RemoteException;
    public boolean borrarNotificacion(String origen, IntCallbackCliente cliente) throws RemoteException;
}
