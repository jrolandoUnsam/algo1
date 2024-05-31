import java.util.ArrayList;
import java.util.List;

public class Hospital {
    
    private String nombre;
    private List<Profesional> profesionales = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Receta> recetas = new ArrayList<>();

    public Hospital(String nombreString) {
        this.nombre = nombreString;
        this.profesionales = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public Profesional registrarProfesional(String nombre, int matricula) {
        for (Profesional profesional : profesionales) {
            if (profesional.getMatricula() == matricula) {
                return profesional;
            }
        }
        Profesional profesional = new Profesional(nombre, matricula);
        profesionales.add(profesional);
        return profesional;
    }

    public Paciente registrarPaciente(String nombre, int dni) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDni() == dni) {
                return paciente;
            }
        }
        Paciente paciente = new Paciente(nombre, dni);
        pacientes.add(paciente);
        return paciente;
    }

    public Receta cargarReceta(Profesional profesional, Paciente paciente, Estudio[] estudios) {
        Receta nuevaReceta = new Receta(profesional, paciente, estudios);
        recetas.add(nuevaReceta);
        return nuevaReceta;
    }

    public void procesar(Receta receta) {
        receta.procesar();

        for (Estudio estudio : receta.getEstudios()) {
            if (estudio.isRealizado()) {
                String salida = "Notificando a paciente " + receta.getPaciente().toString();
                salida += " sobre " + estudio.toString();
                System.out.println(salida);

                salida = "Notificando a profesional " + receta.getProfesional().toString();
                salida += " sobre " + estudio.toString();
                System.out.println(salida);
            }
        }
    }

    public void mostrarRecetas() {
        String salida = "\nRecetas de " + nombre + ":";
        for(Receta receta : recetas){
            salida += "\n" + receta.toString();
        }
        System.out.println(salida);
    }

    public void mostrarRecetasProcesadas() {
        String salida = "\nRecetas procesadas de " + nombre + ":";
        for (Receta receta : recetas) {
            if (receta.isProcesada()) {
                salida += "\n" + receta.toString();
            }
        }
        System.out.println(salida);
    }
    

    public void mostrarPacientesConEstudios(int nroEstudios) {
        String salida = "\nPacientes con al menos " + nroEstudios + " estudios realizados en " + nombre + ":";
        for(Paciente paciente : pacientes){
            int estudiosRealizados = 0;
            for(Receta receta : recetas){
                if(receta.getPaciente().equals(paciente)){
                    for(Estudio estudio : receta.getEstudios()){
                        if(estudio.isRealizado()){
                            estudiosRealizados++;
                        }
                    }
                }
            }
            if(estudiosRealizados >= nroEstudios){
                salida += "\n" + paciente.toString();
            }
        }
        System.out.println(salida);
        
    }
    
}

        
    

