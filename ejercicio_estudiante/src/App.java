import paquete1.Estudiante;

public class App {
    public static void main(String[] args) {
        String[] materias = {"analisis", "icd", "discreta"};
        Estudiante julian = new Estudiante("Julian", 22, "LCD", materias);

        julian.imprimir_informacion();
    }
}
