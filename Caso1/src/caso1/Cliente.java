/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import com.sun.source.tree.CaseTree;
import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class Cliente {
    
    private String nombre;
    private int cedula;
    private int telefono;
    private int numeroMes;
    private Categoria categoria;
    private int opCategoria;
    private int puntos;
    private int montoTotal;


    public Cliente(String nombre, int cedula, int telefono, int numeroMes, int opCategoria) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.numeroMes = numeroMes;
        this.opCategoria = opCategoria;
        this.categoria = Categoria.Regular;
        this.puntos = 0;
        
        switch (opCategoria) {
            case 1:
                categoria = Categoria.VIP;
                break;
        }        
        
        switch (numeroMes) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                JOptionPane.showMessageDialog(null, "No hay mes.");
        }
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getnumeroMes() {
        return this.numeroMes;
    }

    public void setnumeroMes(int numeroMes) {
        this.mes = mes;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    

    public void setCategoria(int opCategoria) {
        this.categoria = categoria;
    }

    public String getMes() {
        return mes;
    }
    
    private String mes;
    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + this.nombre + "\n Cédula: " + this.cedula + "\n Número: " + this.telefono + "\n Mes: " + this.mes + "\n Categoría: " + this.categoria;
    }
    
    
    
}
