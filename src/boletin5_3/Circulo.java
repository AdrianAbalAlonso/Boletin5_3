/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author Adrián
 */
public class Circulo {

    private double radio;
    public final static double PI = 3.14;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio() {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public double calcularLongitud() {
        return PI * radio * 2;
    }
}
