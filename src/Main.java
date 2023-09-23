
abstract class Bebida {
    protected String descripcion;
    protected double costo;

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getCosto();
}


class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
        costo = 2.0;
    }

    public double getCosto() {
        return costo;
    }
}

class Te extends Bebida {
    public Te() {
        descripcion = "Té";
        costo = 1.5;
    }

    public double getCosto() {
        return costo;
    }
}


abstract class Decorador extends Bebida {
    protected Bebida bebida;

    public Decorador(Bebida bebida) {
        this.bebida = bebida;
    }
}

class Leche extends Decorador {
    public Leche(Bebida bebida) {
        super(bebida);
        descripcion = "Leche";
        costo = 0.5;
    }

    public double getCosto() {
        return bebida.getCosto() + costo;
    }
}

class Chocolate extends Decorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
        descripcion = "Chocolate";
        costo = 0.7;
    }

    public double getCosto() {
        return bebida.getCosto() + costo;
    }
}


public class CafeteriaVirtual {

}