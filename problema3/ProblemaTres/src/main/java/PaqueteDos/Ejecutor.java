
package PaqueteDos;

import PaqueteUno.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args) {
        InstitucionEducativa ins1 = new InstitucionEducativa();
        
        String nombre = "Perpetuo Socorro";
        String tipo = "Fiscomisional";
        int alumnos = 5000;
        int docentes = 123;
        int sedes = 150;
        double gastosEstudiante = 200;
        double presupuesto;
        
        
        ins1.establecerNombre(nombre);
        ins1.establecerTipo(tipo);
        ins1.establecerAlumnos(alumnos);
        ins1.establecerDocentes(docentes);
        ins1.establecerSedes(sedes);
        ins1.establecerGastosEstudiante(gastosEstudiante);
        ins1.calcularPresupuesto();
        
        
        InstitucionEducativa ins2 = new InstitucionEducativa();
        
        nombre = "Mater Dei";
        tipo = "Fiscomisional";
        alumnos = 1400;
        docentes = 50;
        sedes = 20;
        gastosEstudiante = 45;
        presupuesto = 0;
        
        ins2.establecerNombre(nombre);
        ins2.establecerTipo(tipo);
        ins2.establecerAlumnos(alumnos);
        ins2.establecerDocentes(docentes);
        ins2.establecerSedes(sedes);
        ins2.establecerGastosEstudiante(gastosEstudiante);
        ins2.calcularPresupuesto();
        
        
        System.out.printf("Institucion1: \n\nNombre: %19s\n"
                + "Tipo: %25s\nNumeroDeAlumnos: %6d\n"
                + "NumeroDeDocentes: %d\n"
                + "NumeroDeSedes: %5d\n"
                + "--------------------\nGastosPorEstudiante: %.2f\n"
                + "Presupuesto: %17.2f\n\n", ins1.obtenerNombre(), 
                ins1.obtenerTipo(), ins1.obtenerAlumnos(), ins1.obtenerDocentes(), 
                ins1.obtenerSedes(), ins1.obtenerGastosEstudiante(), 
                ins1.obtenerPresupuesto());
        
        System.out.printf("\nInstitucion2: \n\nNombre: %25s\n"
                + "Tipo: %20s\nNumeroDeAlumnos: %6d\n"
                + "NumeroDeDocentes: %3d\n"
                + "NumeroDeSedes: %6d\n"
                + "--------------------\nGastosPorEstudiante: %.2f\n"
                + "Presupuesto: %17.2f\n", ins2.obtenerNombre(), 
                ins2.obtenerTipo(), ins2.obtenerAlumnos(), 
                ins2.obtenerDocentes(), ins2.obtenerSedes(), 
                ins2.obtenerGastosEstudiante(), ins2.obtenerPresupuesto());
    }
    
}
