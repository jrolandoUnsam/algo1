public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo VW = new Auto("Volkswagen","Suran",2000);
        Vehiculo nagazaki= new Moto("Honda","Ninja",1000);

        double precioAuto = VW.calcularCostoAlquiler(3);
        double precioMoto = nagazaki.calcularCostoAlquiler(5);

        System.out.println("Precio Auto: "+ precioAuto + " Precio Moto:"+ precioMoto);
    }
}
