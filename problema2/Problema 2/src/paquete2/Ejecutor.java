/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
import problema.pkg2.EquivalenteHora;
/**
 *
 * @author UTPL
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora conversion = new EquivalenteHora();
        EquivalenteHora lectura = new EquivalenteHora();
        double horas = 31;
        conversion.establecerHoras(horas);
        lectura.establecerHoras(horas);
        System.out.printf("%s horas son: \n%s minutos\n%s segundos \n%s dias\n", 
                lectura.obtenerHoras(),
                lectura.obtenerMinutos(),
                lectura.obtenerSegundos(),
                lectura.obtenerDias());
    }
}
