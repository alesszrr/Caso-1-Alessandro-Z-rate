/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author aless
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Cliente
        
        String nombre = JOptionPane.showInputDialog("Nombre del cliente: ");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Cedula del cliente."));
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Teléfono del cliente."));
        
        int numeroMes = 0;
        do{
            numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Numero del mes del alquiler."));
            if (numeroMes < 1 || numeroMes > 12)
                JOptionPane.showMessageDialog(null, "Valor incorrecto, intente de nuevo");
        } while (numeroMes < 1 || numeroMes > 12);
        
        int opCategoria;
        do{
            opCategoria = Integer.parseInt(JOptionPane.showInputDialog("Categoría.\n"
            + "1. VIP\n"
            + "2. Regular"));
            
            if (opCategoria < 1 || opCategoria > 2)
                JOptionPane.showMessageDialog(null, "Valor incorrecto, intente de nuevo.");
        } while (opCategoria < 1 || opCategoria > 2);
        
        Cliente c = new Cliente(nombre, cedula, telefono, numeroMes, opCategoria);
        JOptionPane.showMessageDialog(null, c.toString());
        
        // Do while para introducir cuántos vehículos se ocupen.
        int seguir;
        do {
            String placa = JOptionPane.showInputDialog("Placa del Vehículo: ");
            String marca = JOptionPane.showInputDialog("Marca del vehículo: ");
            double precioDia = Double.parseDouble(JOptionPane.showInputDialog("Precio por día del vehículo?:"));
            
            int cantidadDias;
            do {
                cantidadDias = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de días de renta: "));
                if (cantidadDias < 1) 
                    JOptionPane.showMessageDialog(null, "Valor incorrecto, Intente de nuevo.");
            }while (cantidadDias < 1);
            
            int temp;
            boolean seguro = false;
            do {
                temp = Integer.parseInt(JOptionPane.showInputDialog("Contó con seguro completo?\n" + "1. Sí\n" + "2. No"));
                if (temp < 1 || temp > 2)
                    JOptionPane.showMessageDialog(null, "Valor incorrecto, intente de nuevo.");
                if (temp == 1)
                    seguro = true;
            }while (temp < 1 || temp > 2);
            
            int temp2;
            boolean gps = false;
            do {
                temp2 = Integer.parseInt(JOptionPane.showInputDialog("Contó con GPS?\n" + "1. Sí\n" + "2. No"));
                if (temp2 < 1 || temp2 > 2)
                    JOptionPane.showMessageDialog(null, "Valor incorrecto, intente de nuevo.");
                if (temp2 == 1)
                    gps = true;
            }while (temp2 < 1 || temp2 > 2);
            
            Vehiculo v = new Vehiculo(placa, marca, precioDia, cantidadDias, seguro, gps);
            JOptionPane.showMessageDialog(null, v.toString());

            
            seguir = Integer.parseInt(JOptionPane.showInputDialog("Desea Seguir? \n" + "1. Si\n" + "2. No"));
        }while (seguir < 2);
    }
    
}
