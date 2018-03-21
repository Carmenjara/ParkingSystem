/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Database.DBEspacio;
import java.sql.SQLException;

/**
 *
 * @author Rocío
 */
public class LogicaEspacio {
    
    public void ocuparEspacio(int idEspacio) throws SQLException, ClassNotFoundException {
        DBEspacio objEspacio = new DBEspacio();
        objEspacio.ocuparEspacio(idEspacio);
    }
    
}
