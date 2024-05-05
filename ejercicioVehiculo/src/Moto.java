public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, double PrecioBase){
    super(marca, modelo, PrecioBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias){
        return (super.calcularCostoAlquiler(dias)*(1 + 0.15)); 
    }
}