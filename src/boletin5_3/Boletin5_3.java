/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        String resultado = JOptionPane.showInputDialog("Introducir radio");
        radio = Double.parseDouble(resultado);
        Circulo circulo1 = new Circulo(radio);
        JOptionPane.showMessageDialog(null, "Area circulo: " + circulo1.calcularArea());
        JOptionPane.showMessageDialog(null, "Longitud circulo" + circulo1.calcularLongitud());

    }
}
