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
public class Reserva {
    private int idReserva;
    private int idUsuario;
    private int idEspacio;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String estado;

    public Reserva() {
    }

    public Reserva(int idReserva, int idUsuario, int idEspacio, String fecha, String horaInicio, String horaFin, String estado) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.idEspacio = idEspacio;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
    }
    public Reserva(String fecha, String horaInicio, String horaFin, String estado,int idUsuario, int idEspacio) {
        this.idUsuario = idUsuario;
        this.idEspacio = idEspacio;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
    }
    public Reserva(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
