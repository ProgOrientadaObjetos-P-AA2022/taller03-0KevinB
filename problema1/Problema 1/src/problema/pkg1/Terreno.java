/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg1;

/**
 *
 * @author UTPL
 */
public class Terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerValorMetroC(double c) {
        valorMetroCuadrado = c;
    }
    
    public double calcularArea() {
        area = largo * ancho;
        return area;
    }

    public double calcularCosto() {
        costoTerreno = area * valorMetroCuadrado;
        return costoTerreno;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerValorMetroC() {
        return valorMetroCuadrado;
    }

}
