/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Rocío
 */
public class Espacio {
    private int idEspacio;
    private String codigo;
    private String estado;
    private int idArea;

    public Espacio() {
    }

    public Espacio(String codigo, int idEspacio){
        this.codigo = codigo;
        this.idEspacio=idEspacio;
    }
    
    public Espacio(int idEspacio, String codigo, String estado, int idArea) {
        this.idEspacio = idEspacio;
        this.codigo = codigo;
        this.estado = estado;
        this.idArea = idArea;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    
}
