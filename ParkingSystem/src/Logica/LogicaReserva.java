/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Espacio;
import Clases.Reserva;
import Clases.Usuario;
import Database.DBEspacio;
import Database.DBReserva;
import Database.DBUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class LogicaReserva {
    
    public ArrayList<Espacio> obtenerEspacios(int espacio) throws SQLException, ClassNotFoundException {
        DBEspacio objEspacio = new DBEspacio();
        ArrayList<Espacio> listEspacios=new ArrayList<Espacio>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objEspacio.espacio(espacio);
        while (rs.next()) {
            listEspacios.add(new Espacio(rs.getString(1), rs.getInt(2)));
        }
        return listEspacios;
    }
    
    public void guardarReserva(Reserva reserva) throws SQLException, ClassNotFoundException {
        DBReserva objReserva = new DBReserva();
        //De ResultSet desfragmentar datos
        objReserva.guardarReserva(reserva);
    }
}
