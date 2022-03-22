public class Contact {
    String nombre;
    int numero;
    String mail;

    public Contact(String nombre, int numero, String mail) {
        this.nombre = nombre;
        this.numero = numero;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
