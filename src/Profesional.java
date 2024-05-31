
public class Profesional {
    private int matricula;
    private String nombre;

    public Profesional(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " [" + matricula + "]";
    }

}
