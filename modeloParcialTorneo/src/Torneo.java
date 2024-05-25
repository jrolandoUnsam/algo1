import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Torneo {
    private List<Equipo> equipos;
    private List<Partido> partidos;
    //private tablaPosiciones tabla;

    public Torneo(){
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
    }

    public void cargarEquipo(String nomb, int hinchas) {
        Equipo equipoNuevo = new Equipo(nomb,hinchas);
        equipos.add(equipoNuevo);
    }

    public void cargarPartido(String nombreLocal, String nombreVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        Equipo equipoLocal = buscarEquipoPorNombre(nombreLocal);
        Equipo equipoVisitante = buscarEquipoPorNombre(nombreVisitante);
        
        if (equipoLocal != null && equipoVisitante != null) {
            Partido partidoNuevo = new Partido(equipoLocal, equipoVisitante, fecha, golesLocal, golesVisitante);
            partidoNuevo.procesarPartido();
            partidos.add(partidoNuevo);
        } else {
            System.out.println("Uno o ambos equipos no existen en el torneo.");
        }


    }


    public Equipo buscarEquipoPorNombre(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }
        throw new IllegalArgumentException("El equipo no existe en el torneo.");
    }

    public void mostrarPartidosFecha(LocalDate fecha) {
        System.out.println("mostrarPartidosFecha");
        for (Partido partido : partidos) {
            if (partido.getDia().equals(fecha)) {
                System.out.println(partido.toString());
            }
        }
        System.out.println();
    }

    public void mostrarTabla() {
        List<Equipo> listaEquipos = new ArrayList<>(equipos);

        Collections.sort(listaEquipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                if (e2.getPuntos() != e1.getPuntos()) {
                    return Integer.compare(e2.getPuntos(), e1.getPuntos());
                } else {
                    return Integer.compare(e2.getDiferenciaDeGol(), e1.getDiferenciaDeGol());
                }
            }
        });

        System.out.println("Equipo | Ju| Pu| Ga| Em| Pe| GF| GC| DG");
        for (Equipo equipo : listaEquipos) {
            System.out.println(equipo.getNombre() + " | " + equipo.getPartidosJugados() + " | " + equipo.getPuntos() + " | " +
                equipo.getPartidosGanados() + " | " + equipo.getPartidosEmpatados() + " | " + equipo.getPartidosPerdidos() + " | " +
                equipo.getGolesConvertidos() + " | " + equipo.getGolesRecibidos() + " | " + equipo.getDiferenciaDeGol());
        }
        System.out.println();
    }
   
}