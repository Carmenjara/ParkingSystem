/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Logica.LogicaConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rocío
 */
public class DBEspacio {
    
    Connection conecta=LogicaConexion.getConexion();
    
    public ResultSet espacio(int espacio) throws SQLException, ClassNotFoundException {
        Statement st=conecta.createStatement();
        //Se establece la consulta
        String sentencia = "SELECT e.codigo, e.idEspacio FROM espacio e, area a "
                + "WHERE a.idArea="+espacio+" "
                + "AND e.idArea="+espacio+" "
                + "AND e.estado='disponible'";
        return st.executeQuery(sentencia);
    }
    
    //
    public void ocuparEspacio(int idEspacio) throws SQLException{
        Statement st=conecta.createStatement();
        String sentencia= "UPDATE `espacio` SET `estado` = 'ocupado' WHERE `espacio`.`idEspacio` ="+ idEspacio;
        int Res = st.executeUpdate(sentencia);
    }
}
