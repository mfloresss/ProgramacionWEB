public class Vehiculo {
    private String marca;
    private int cantRuedas;
    private double cantKmRecorridos;

    Posicion posicion;

    public Vehiculo(String marca, int cantRuedas) {
        this.marca = marca;
        this.cantRuedas = cantRuedas;
        cantKmRecorridos = 0;
        posicion = new Posicion(0, 0);
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public double getCantKmRecorridos() {
        return cantKmRecorridos;
    }

    public void setCantKmRecorridos(double cantKmRecorridos) {
        this.cantKmRecorridos = cantKmRecorridos;
    }

    public void moverse(double dx, double dy) {
        posicion.dx += dx;
        posicion.dy += dx;
        cantKmRecorridos++;

    }

}
