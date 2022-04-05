import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final int MAX_CONTACT = 256;

        String name, email, num;
        char opc;

        Scanner tec = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<Contact>();

        do {
            System.out.println("==============================================\n\n"
                    + " 1 - Ingresar un nuevo contacto\n\n"
                    + " 2 - Consultar un contacto existente\n\n"
                    + " 3 - Salir\n\n"
                    + "==============================================");

            opc = tec.nextLine().charAt(0);

            switch (opc) {
                case '1':
                    if (contacts.size() < MAX_CONTACT) {
                        System.out.print("\n> Ingrese su nombre: ");
                        do {
                            name = tec.nextLine();
                        } while (!Helper.checkName(name));

                        System.out.print("\n> Ingrese su numero: ");
                        do {
                            num = tec.nextLine();
                        } while (!Helper.checkNumber(num));

                        System.out.print("\n> Ingrese su email (o presione enter si no lo sabe): ");
                        do {
                            email = tec.nextLine();
                        } while (!Helper.checkEmail(email));

                        contacts.add(new Contact(name, num, email));

                        System.out.println("\n> Contacto ingresado correctamente \n");

                        Thread.sleep(1000);
                    } else {
                        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n"
                                + "SE LLEGO AL LIMITES DE CONTACTOS PARA AGREGAR"
                                + "\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");

                        Thread.sleep(1000);
                    }
                    break;

                case '2':
                    System.out.print("\n> Ingresa el nombre del contacto: ");
                    name = tec.nextLine().toLowerCase();

                    Contact.getContact(contacts, name);
                    break;

                case '3':
                    System.out.println("==============================================\n\n"
                            + "               NOS VEMOS!!!\n\n"
                            + "==============================================");

                    Thread.sleep(1000);
                    break;

                default:
                    System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n"
                            + "               OPCION INVALIDA"
                            + "\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");

                    Thread.sleep(1000);
                    break;
            }
        } while (opc != '3');

    }
}
