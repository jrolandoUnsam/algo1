import java.time.LocalDate;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private LocalDate dia;

    public Partido(Equipo nombreLocal,Equipo nombreVisitante, LocalDate fecha, int golloc, int golvis){
        equipoLocal = nombreLocal;
        equipoVisitante = nombreVisitante;
        dia = fecha;
        golesLocal = golloc;
        golesVisitante = golvis;
    }

    public void procesarPartido(){
        equipoLocal.incrementarPartidosJugados();
        equipoLocal.contabilizarGoles(golesLocal, golesVisitante);
        equipoVisitante.incrementarPartidosJugados();
        equipoVisitante.contabilizarGoles(golesVisitante, golesLocal);
  
        if (golesLocal > golesVisitante){
            equipoLocal.victoria();
            equipoLocal.incrementarPartidosGanados();
            equipoVisitante.incrementarPartidosPerdidos();
        }
        else if(golesLocal < golesVisitante){
            equipoVisitante.victoria();
            equipoVisitante.incrementarPartidosGanados();
            equipoLocal.incrementarPartidosPerdidos();

        }
        else{
            equipoLocal.empate();
            equipoVisitante.empate();
            equipoLocal.incrementarPartidosEmpatados();
            equipoVisitante.incrementarPartidosEmpatados();
        }
    }
    
    public LocalDate getDia() {
        return dia;
        
    }

    @Override
    public String toString() {
        return "Fecha: " + dia + ", " + equipoLocal.getNombre() + " (" + golesLocal + ") - " +
                equipoVisitante.getNombre() + " (" + golesVisitante + ")";
    }


}