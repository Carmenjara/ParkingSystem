/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Clases.Reserva;
import Logica.LogicaConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rocío
 */
public class DBReserva {
    Connection conecta=LogicaConexion.getConexion();
    
    public void guardarReserva(Reserva reserva) throws SQLException, ClassNotFoundException {
        Statement st=conecta.createStatement();       
        //Se establece la consulta
        String sentencia = "INSERT INTO `reserva` (`fecha`, `horaInicio`, `horaFin`, `estado`, `idUsuario`, `idEspacio`) "
                + "VALUES ('"+reserva.getFecha()+"','"+reserva.getHoraInicio()+"','"+reserva.getHoraFin()+"','"+reserva.getEstado()+"',"+reserva.getIdUsuario()+","+reserva.getIdEspacio()+")";
        int Res = st.executeUpdate(sentencia);
    }
    
    
    public ResultSet mostarReservas(String username) throws SQLException, ClassNotFoundException {
        Statement st=conecta.createStatement();
        //Se establece la consulta
        String sentencia = "SELECT * FROM reserva r, usuario u "
                + "WHERE r.idUsuario=u.idUsuario "
                + "AND u.username='"+username+"'";
        return st.executeQuery(sentencia);
    }
    
}
