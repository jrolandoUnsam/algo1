package paquete1;
import java.util.Arrays;

public class Estudiante {

    private String nombre;
    private int edad;  
    private String carrera;
    private String[] materias;

    public Estudiante(String nom, int ed, String carr, String[] mat){

        nombre = nom;
        edad = ed;
        carrera = carr;
        materias = mat;
    }

    public void imprimir_informacion(){
        System.out.println("nombre:" + nombre);
        System.out.println("edad:" + edad);
        System.out.println("carrera:" + carrera);
        System.out.print("materias: ");
        for (String materia : materias) {
            System.out.print(materia + ", ");
        }
        System.out.println();
    }

    @Override
    public String ToString(){
        return "Nombre: " + nombre +
                "\nCarrera: " + carrera +
                "\nMaterias: " + Arrays.toString(materias);
    } 
}
