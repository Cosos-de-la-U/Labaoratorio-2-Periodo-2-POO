package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Interfacez.*;

/**
 *
 * @author raulpenate
 */
public class Edificio {

    private String nombre;
    private String ubicacion;
    private int cantidad_de_plantas;
    private String tipo;

    public Edificio(String nombre, String ubicacion, int cantidad_de_plantas, String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidad_de_plantas = cantidad_de_plantas;
        this.tipo = tipo;
    }

    //SETTERS AND GETTERS
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

    public int getCantidad_de_plantas() {
        return cantidad_de_plantas;
    }

    public void setCantidad_de_plantas(int cantidad_de_plantas) {
        this.cantidad_de_plantas = cantidad_de_plantas;
    }

    public String geTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
