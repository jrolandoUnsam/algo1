public class Estudio {
    private String nombre;
    private String descripcion;
    private boolean realizado;

    public Estudio(String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.realizado = false;
    }

    public void realizar() {
        if (!realizado) {
            realizado = true;
        }
    }

    public String getNombre(){
        return nombre;
    }


    public boolean isRealizado() {
        return realizado;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getEstado() {
        if (realizado) {
            return "REALIZADO";
        } else {
            return "PENDIENTE";
        }
    }

    public String toString() {
        return nombre + ": " + descripcion + " (" + getEstado() + ")";
    }
}
