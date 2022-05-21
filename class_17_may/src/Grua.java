import java.util.ArrayList;

public class Grua extends Vehiculo {
    Vehiculo vehiculo;

    public Grua() {
        super("Gruaaaa", 4);
    }

    public void remolca(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculo = vehiculo;
        } else {
            System.out.println("no");
        }
    }

    public void libera(Vehiculo vehiculo) {
        vehiculo = null;

    }
}
