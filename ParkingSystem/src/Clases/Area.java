/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class Area {
    private int idArea;
    private String nombre;
    private String ubicacion;
    private ArrayList<Espacio> listaEspacios= new ArrayList<Espacio>();

    public Area() {
    }

    //Constructor con composición
    public Area(int idArea, String nombre, String ubicacion, int idEspacio,String codigo,String estado) {
        this.idArea = idArea;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEspacios.add(new Espacio(idEspacio, codigo, estado, idArea));
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Espacio> getListaEspacios() {
        return listaEspacios;
    }

    public void setListaEspacios(ArrayList<Espacio> listaEspacios) {
        this.listaEspacios = listaEspacios;
    }
}
