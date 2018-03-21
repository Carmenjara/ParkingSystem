/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Reserva;
import Clases.Usuario;
import Database.DBReserva;
import Database.DBUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class LogicaUsuario {
   
    public ArrayList<Usuario> obtenerUsuario() throws SQLException, ClassNotFoundException {
        DBUsuario objUsers = new DBUsuario();
        ArrayList<Usuario> listUsers=new ArrayList<Usuario>();
        //De ResultSet desfragmentar datos
        ResultSet rs = objUsers.login();
        while (rs.next()) {
            listUsers.add(new Usuario(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        return listUsers;
    }
    
    
    public Reserva obtenerReserva(String username) throws SQLException, ClassNotFoundException {
        DBReserva objReserva = new DBReserva();
        
        //De ResultSet desfragmentar datos
        ResultSet rs = objReserva.mostarReservas(username);
        Reserva objR= new Reserva();
        
        while (rs.next()) {
            objR = new Reserva(rs.getInt(6));
        }
        return objR;
    }
    
}
