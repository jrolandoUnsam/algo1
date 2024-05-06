public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(){}

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulba, metodo placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Bulba, metodo aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulba, metodo mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulba, metodo drenaje");
        
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulba, metodo paralizar");
        
    }

}
