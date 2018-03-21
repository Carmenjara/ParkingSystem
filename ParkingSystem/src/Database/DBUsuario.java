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
public class DBUsuario {
    Connection conecta=LogicaConexion.getConexion();
    
    public ResultSet login() throws SQLException, ClassNotFoundException {
        Statement st=conecta.createStatement();
        //Se establece la consulta
        String sentencia = "SELECT idUsuario, username, password, rol "
                + "FROM usuario ";
        return st.executeQuery(sentencia);
    }
    
}
