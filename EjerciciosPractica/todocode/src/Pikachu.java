public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){}

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu, metodo placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Pikachu, metodo aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu, metodo mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu, metodo impactrueno");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Hola soy Pikachu, metodo punotrueno");
    }

}
