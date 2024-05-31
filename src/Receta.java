public class Receta {
    private int id;
    private Paciente paciente;
    private Profesional profesional;
    private Estudio[] estudios;
    private boolean procesada;
    private static int ultimoId = 1;

    public Receta(Profesional profesional, Paciente paciente, Estudio[] estudios) {
        this.id = getUltimoId();
        this.profesional = profesional;
        this.paciente = paciente;
        this.estudios = estudios;
        this.procesada = false;
    }

    private static int getUltimoId() {
        int actual = ultimoId;
        ultimoId++;
        return actual;
    }

    public void procesar() {

        if (!procesada) {
            for (Estudio estudio : estudios) {
                estudio.realizar();
            }
            procesada = true;
        }
    }

    public Estudio[] getEstudios() {
        return estudios;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public int getID() {
        return id;
    }
    
    public boolean isProcesada() {
        return procesada;
    }

    public String getEstado(){
        if(procesada){
            return "PROCESADA";
        }
        else{
            return "CARGADA";
        }
   }

   @Override
    public String toString() {
        String salida = "\nReceta " + id + ":";
        salida += "\n- Profesional: " + profesional.getNombre() + " [" + profesional.getMatricula() + "]";
        salida += "\n- Paciente: " + paciente.getNombre() + " [" + paciente.getDni() + "]";
        salida += "\n- Estado: " + this.getEstado();
        salida += "\n- Estudios: ";
        for (Estudio estudio : estudios) {
            salida += "\n  - " + estudio.getNombre() + ": " + estudio.getDescripcion() + " (" + estudio.getEstado()+ ")";
        }
        return salida;
    }

    
}
