public class Charmander extends Pokemon implements IFuego{

    public Charmander(){}

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander, metodo placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Charmander, metodo aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander, metodo mordisco");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander, metodo lanzallamas");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Hola soy Charmander, metodo puno y trueno");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander, metodo ascuas");
    }

    
}
