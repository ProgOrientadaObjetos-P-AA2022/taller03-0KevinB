
package PaqueteDos;

import PaqueteUno.EquipoCelular;

public class Ejecutor {

    public static void main(String[] args) {
       
        
        EquipoCelular cel1 = new EquipoCelular();
        
        String sistemaOperativo = "Android";
        String direccionMac = "d3:7c:6e:8f";
        String imei = "123124324351";
        double tamanioPantalla = 6.55;
        double costoInicial = 470;
        
        cel1.establecerSistemaOperativo(sistemaOperativo);
        cel1.establecerDireccionMac(direccionMac);
        cel1.establecerImei(imei);
        cel1.establecerTamanioPantalla(tamanioPantalla);
        cel1.establecerCostoInicial(costoInicial);
        cel1.calcularIva();
        cel1.calcularIvaCostoInicial();
        cel1.calcularCostoFinal();
        
      
        System.out.printf("Equipo Celular1 \n"
                + "Sistema Operativo: %s\n"
                + "Dirección MAC: %s\n"
                + "IMEI: %s\n"
                + "Tamaño De Pantalla: %.2f\n"
                + "Costo Inicial: %.2f\n"
                + "IVA: %.2f\n"
                + "\nIVA del Costo Inicial: %.2f\n"
                + "Costo Final del celular: %12.2f\n\n", 
                cel1.obtenerSistemaOperativo(), 
                cel1.obtenerDireccionMac(), cel1.obtenerImei(), 
                cel1.obtenerTamanioPantalla(), cel1.obtenerCostoInicial(), 
                cel1.obtenerIva(), cel1.obtenerIvaCostoInicial(), 
                cel1.obtenerCostoFinal());
        
    }
    
}
