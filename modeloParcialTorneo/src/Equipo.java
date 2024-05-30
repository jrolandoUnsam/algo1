
public class Equipo {
    private String nombre;
    private int fans;
    private int golesConvertidos;
    private int golesRecibidos;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int puntos;
    
    public Equipo(String nomb, int hinchas){
        this.nombre = nomb;
        this.fans = hinchas;
        golesRecibidos = 0;
        golesConvertidos = 0;
        partidosEmpatados = 0;
        partidosGanados = 0;
        partidosPerdidos = 0;
        partidosJugados = 0;
        puntos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void victoria(){
        puntos += 3;
    }

    public void empate(){
        puntos += 1;
    }

    public void contabilizarGoles(int golesCon, int golesRec){
        golesConvertidos += golesCon;
        golesRecibidos += golesRec;
    }

    public void incrementarPartidosJugados(){
        partidosJugados++;
    }

    public void incrementarPartidosGanados(){
        partidosGanados++;
    }

    public void incrementarPartidosPerdidos(){
        partidosPerdidos++;
    }

    public void incrementarPartidosEmpatados(){
        partidosEmpatados++;
    }

    public int getDiferenciaDeGol() {
        return golesConvertidos - golesRecibidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getPartidosPerdidos() {
       return  partidosPerdidos;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public int getFans() {
        return fans;
    }   

}
   