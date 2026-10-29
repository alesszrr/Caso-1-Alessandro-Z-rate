/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private double precioDia;
    private int cantidadDias;
    private boolean seguro;
    private boolean gps;
    private double costoBase;
    private int puntos;
    private int acumuladorPuntos;

    public Vehiculo(String placa, String marca, double precioDia, int cantidadDias, boolean seguro, boolean gps) {
        this.placa = placa;
        this.marca = marca;
        this.precioDia = precioDia;
        this.cantidadDias = cantidadDias;
        this.seguro = seguro;
        this.gps = gps;
        this.costoBase = 0;
        this.puntos = 0;
        
        if (cantidadDias > 7)
            puntos =+ 5;
        if (seguro || gps)
            puntos =+ 2;
        if (seguro && gps)
            puntos =+ 4;

    }

    }
    
    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioDia() {
        return this.precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getCantidadDias() {
        return this.cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public boolean isSeguro() {
        return this.seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isGps() {
        return this.gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getAcumuladorMontos() {
        
        return acumuladorMontos;
    }

    public void setAcumuladorMontos(double acumuladorMontos) {
        this.acumuladorMontos = acumuladorMontos;
    }

    public int getAcumuladorPuntos() {
        
        
        return acumuladorPuntos;
    }

    public void setAcumuladorPuntos(int acumuladorPuntos) {
        this.acumuladorPuntos = acumuladorPuntos;
    }
    
    
    
    @Override
    public String toString() {
        return ">> Subtotal: Vehículo: " + this.marca + " " + this.placa + ": "+ this.costoBase +"| Puntos obtenidos: " + this.puntos;
    }  
}
