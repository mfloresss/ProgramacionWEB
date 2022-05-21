public class Persona {
    private String nombre;
    private int cuentaCorriente;

    Persona(String nombre) {
        this.nombre = nombre;
        this.cuentaCorriente = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(int cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
}
