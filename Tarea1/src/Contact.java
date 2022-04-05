import java.util.ArrayList;

public class Contact {
    private String nombre;
    private String numero;
    private String mail;

    public Contact(String nombre, String numero, String mail) {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static void getContact(ArrayList<Contact> contacts, String name) throws InterruptedException {
        for (int i = 0; i < contacts.size(); i++) {
            // if (contacts.get(i).getNombre().equals(name)) {
            // Uso .contains para que te surgiera contactos que contengan el string
            // ingresado.
            if (contacts.get(i).getNombre().toLowerCase().contains(name)) {
                System.out.println("\nNombre: " + contacts.get(i).getNombre() + "\n\n"
                        + "Telefono: " + contacts.get(i).getNumero() + "\n");

                System.out.println(contacts.get(i).getMail().isEmpty() ? "No tiene mail\n"
                        : "Correo: " + contacts.get(i).getMail() + "\n");

                Thread.sleep(1000);

            } else {
                if (i == contacts.size() - 1) {
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n"
                            + "\n         El contacto " + name + " no existe"
                            + "\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");

                    Thread.sleep(1000);
                }
            }
        }
    }
}