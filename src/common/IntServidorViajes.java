package common;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.rmi.RemoteException;

public interface IntServidorViajes {
    public JSONArray consultaViajes(String origen) throws RemoteException, IOException, ParseException;
    public JSONObject reservaViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
    public JSONObject anulaReserva(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
    public JSONObject ofertaViaje(String codcli, String origen, String destino, String fecha, long precio, long numplazas) throws RemoteException, IOException, ParseException;
    public JSONObject borraViaje(String codviaje, String codcli) throws RemoteException, IOException, ParseException;
}