/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfacez.Area_Externa;
import Interfacez.Area_Interna;

/**
 *
 * @author raulpenate
 */
public class EdificioLaEmpresa extends Edificio implements Area_Externa, Area_Interna {

    private int cantidad_cuartos;
    private int cantidad_salones_de_reunion;
    private boolean comedor;
    private int cantidad_baños;
    private boolean area_de_emergencias;
    private boolean parqueo;
    private boolean patio_trasero;
    private boolean torre_vigilancia;
    private boolean calles_internas;
    private boolean canchas;

    public EdificioLaEmpresa(String nombre, String ubicacion, int cantidad_de_plantas, String tipo,
            int cantidad_cuartos, int cantidad_salones_de_reunion,
            boolean comedor, int cantidad_baños, boolean area_de_emergencias, boolean parqueo,
            boolean patio_trasero, boolean torre_vigilancia, boolean calles_internas, boolean canchas
    ) {
        super(nombre, ubicacion, cantidad_de_plantas, tipo);
        this.cantidad_cuartos = cantidad_cuartos;
        this.cantidad_salones_de_reunion = cantidad_salones_de_reunion;
        this.comedor = comedor;
        this.cantidad_baños = cantidad_baños;
        this.area_de_emergencias = area_de_emergencias;
        this.parqueo = parqueo;
        this.patio_trasero = patio_trasero;
        this.torre_vigilancia = torre_vigilancia;
        this.calles_internas = calles_internas;
        this.canchas = canchas;
    }

    //AREA INTERNA
    @Override
    public int cantidadCuartos() {
        return cantidad_cuartos;
    }

    @Override
    public int cantidadSalonesDeReuniones() {
        return cantidad_salones_de_reunion;
    }

    @Override
    public boolean comedor() {
        return comedor;
    }

    @Override
    public int cantidadBaños() {
        return cantidad_baños;
    }

    @Override
    public boolean areaDeEmergencias() {
        return area_de_emergencias;
    }

    //AREA EXTERNA
    @Override
    public boolean parqueo() {
        return parqueo;
    }

    @Override
    public boolean patioTrasero() {
        return patio_trasero;
    }

    @Override
    public boolean torreVigiliancia() {
        return torre_vigilancia;
    }

    @Override
    public boolean callesInternas() {
        return calles_internas;
    }

    @Override
    public boolean canchas() {
        return canchas;
    }

    //SETTERS AND GETTERS
    public int getCantidad_cuartos() {
        return cantidad_cuartos;
    }

    public void setCantidad_cuartos(int cantidad_cuartos) {
        this.cantidad_cuartos = cantidad_cuartos;
    }

    public int getCantidad_salones_de_reunion() {
        return cantidad_salones_de_reunion;
    }

    public void setCantidad_salones_de_reunion(int cantidad_salones_de_reunion) {
        this.cantidad_salones_de_reunion = cantidad_salones_de_reunion;
    }

    public boolean isComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public boolean isParqueo() {
        return parqueo;
    }

    public void setParqueo(boolean parqueo) {
        this.parqueo = parqueo;
    }

    public boolean isPatio_trasero() {
        return patio_trasero;
    }

    public void setPatio_trasero(boolean patio_trasero) {
        this.patio_trasero = patio_trasero;
    }

    public boolean isTorre_vigilancia() {
        return torre_vigilancia;
    }

    public void setTorre_vigilancia(boolean torre_vigilancia) {
        this.torre_vigilancia = torre_vigilancia;
    }

    public boolean isCalles_internas() {
        return calles_internas;
    }

    public void setCalles_internas(boolean calles_internas) {
        this.calles_internas = calles_internas;
    }

}
