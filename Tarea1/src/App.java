import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int MAX_CONTACT = 256;
        int opc, num;

        String name = "", mail;

        Scanner tec = new Scanner(System.in);

        ArrayList<Contact> contacto = new ArrayList<Contact>();

        do {
            System.out.println("1 - Ingresar un nuevo contacto");
            System.out.println("2 - Consultar un contacto existente");

            opc = tec.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("> Ingresa el nombre:");
                    name = tec.next();

                    System.out.println("> Ingresa su numero:");
                    num = tec.nextInt();

                    tec.nextLine();

                    System.out.println("> Ingresa su email (o presione enter si no lo sabe):");
                    mail = tec.nextLine();

                    boolean mailValid = false;

                    if (!mail.isEmpty()) {
                        while (!mailValid) {
                            if (!mail.contains("@")) {
                                System.out.println("Ingrese un mail valido");
                                mail = tec.next();
                            } else {
                                mailValid = true;
                                System.out.println("Contacto ingresado!");
                            }
                        }
                    }

                    if (contacto.size() <= MAX_CONTACT) {
                        contacto.add(new Contact(name, num, mail));
                    } else {
                        System.out.println("No se pueden agregar mas contactos, llego al maximo");
                    }

                    break;

                case 2:
                    System.out.println("Ingresa el nombre del contacto que quieres consultar");

                    for (Contact contact : contacto) {
                        if (contact.getNombre() == name) {
                            System.out.println(contact.getNombre() + contact.getMail() + contact.getNumero());
                        } else {
                            System.out.println("El contacto " + name + " no existe");
                        }
                    }

                    break;
                default:
                    System.out.println("OPCION INVALIDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    break;
            }

        } while (opc != 0);

    }
}
