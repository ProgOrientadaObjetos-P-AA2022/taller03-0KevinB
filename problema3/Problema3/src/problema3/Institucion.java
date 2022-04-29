/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author UTPL
 */
public class Institucion {

    private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastoProyectado;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerAlumnos(int c) {
        alumnos = c;
    }

    public void establecerDocentes(int c) {
        docentes = c;
    }
    public void establecerSedes(int c) {
        sedes = c;
    }
    public void establecerGastoProyectado(double c) {
        gastoProyectado = c;
    }
    public void establecerPresupuesto(double a, double b) {
        presupuesto = a * b;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerAlumnos() {
        return alumnos;
    }
    public int obtenerDocentes() {
        return docentes;
    }
    public int obtenerSedes() {
        return sedes;
    }

    public double obtenerGastoProyectado() {
        return gastoProyectado;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
