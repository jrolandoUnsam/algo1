import java.util.Objects;

public class Paciente {
    private int dni;
    private String nombre;

    public Paciente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " [" + dni + "]";
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || getClass() != otro.getClass()){
            return false;
        }

        Paciente paciente2 = (Paciente) otro;
        return this.dni == paciente2.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
