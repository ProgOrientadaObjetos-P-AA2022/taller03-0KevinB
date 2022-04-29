/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import problema.pkg1.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        Terreno terreno = new Terreno();
        Terreno costoT = new Terreno();
        double ancho = 21.3;
        double largo = 25;
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        costoT.establecerAncho(ancho);
        costoT.establecerLargo(largo);
        System.out.println("El ancho del terreno es: " + terreno.obtenerAncho());
        System.out.println("El largo del terreno es: " + terreno.obtenerLargo());
        System.out.printf("El area es: %s metros cuadrados\n", terreno.calcularArea());
        double metroC = 150.2;

        costoT.establecerValorMetroC(metroC);
        System.out.printf("El terreno de %.2f m de area tiene un costo %.2f por "
                + "cada metro, el valor a pagar es: %.2f\n", costoT.calcularArea(),
                costoT.obtenerValorMetroC(), costoT.calcularCosto());
    }

}
