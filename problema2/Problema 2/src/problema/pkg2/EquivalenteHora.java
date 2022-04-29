/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema.pkg2;

/**
 *
 * @author UTPL
 */
public class EquivalenteHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerHoras(double c) {
        horas = c;
        establecerMinutos(horas);
        establecerDias(horas);
    }

    public void establecerMinutos(double horas) {
        minutos = (horas * 60);
        establecerSegundos(minutos);
    }

    public void establecerSegundos(double minutos) {
        segundos = (minutos * 60);
    }

    public void establecerDias(double horas) {
        dias = horas / 24;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerDias() {
        return dias;
    }
}
