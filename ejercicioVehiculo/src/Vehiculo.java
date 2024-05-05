public class Vehiculo {
    private String marca;
    private String modelo;
    private double PrecioBase;

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, double PrecioBase){
        this.marca = marca;
        this.modelo = modelo;
        this.PrecioBase = PrecioBase;
    }

    public double calcularCostoAlquiler(int dias){
        return dias*PrecioBase;
    }
}
