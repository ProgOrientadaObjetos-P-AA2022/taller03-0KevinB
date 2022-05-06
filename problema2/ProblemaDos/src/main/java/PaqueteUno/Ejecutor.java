package PaqueteUno;

import PaqueteDos.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {

        EquivalenteHora eq = new EquivalenteHora();

        double horas = 23;

        eq.establecerHoras(horas);
        eq.establecerMinutos();
        eq.establecerSegundos();
        eq.establecerDias();

        System.out.printf("Horas: %.2f\nMinutos: %.2f\nSegundos: %.2f\nDias: %.2f\n",
                eq.obtenerHoras(),
                eq.obtenerMinutos(),
                eq.obtenerSegundos(),
                eq.obtenerDias());

    }

}
