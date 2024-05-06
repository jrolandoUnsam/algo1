public class Squartle extends Pokemon implements IAgua{

    public Squartle(){}

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squartle, metodo placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Squartle, metodo aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squartle, metodo mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squartle, metodo hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squartle, metodo burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squartle, metodo pistola de agua");
    }

}
