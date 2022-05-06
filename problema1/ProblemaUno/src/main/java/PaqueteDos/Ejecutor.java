package PaqueteDos;

import PaqueteUno.Terreno;


public class Ejecutor {
 
    public static void main(String[] args) { 
        
        Terreno terreno1 = new Terreno();
        
        double ancho = 20;
        double largo = 25;
        double valorMetroCuadrado = 1.5;
               
        terreno1.establecerAncho(ancho);
        terreno1.establecerLargo(largo);
        terreno1.calcularArea();
        terreno1.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno1.calcularCostoTerreno();
        
        
        System.out.printf("Terreno\n\nAnchoMetros: %.2f\n"
                + "LargoMetros: %.2f\nArea: %.2f\n"
                + "ValorMetroCuadrado: %.2f\n"
                +"CostoTerreno: %.2f\n", terreno1.obtenerAncho(),
                terreno1.obtenerLargo(), terreno1.obtenerArea(),
                terreno1.obtenerValorMetroCuadrado(), 
                terreno1.obtenerCostoTerreno());
        
    
    
    }
    
}

