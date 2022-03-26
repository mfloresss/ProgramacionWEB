import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        final int MAX_CONTACT = 256;

        String name, email, num, opc;

        Scanner tec = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<Contact>();

        do {
            System.out.println("==============================================\n\n"
                    + " 1 - Ingresar un nuevo contacto\n\n"
                    + " 2 - Consultar un contacto existente\n\n"
                    + "==============================================");

            opc = tec.nextLine();

            switch (opc) {
                case "1":
                    System.out.print("\n> Ingrese su nombre: ");
                    do {
                        name = tec.nextLine();
                    } while (!checkName(name));

                    System.out.print("\n> Ingrese su numero: ");
                    do {
                        num = tec.nextLine();
                    } while (!checkNumber(num));

                    System.out.print("\n> Ingrese su email (o presione enter si no lo sabe): ");
                    do {
                        email = tec.nextLine();
                    } while (!checkEmail(email));

                    if (contacts.size() < MAX_CONTACT) {
                        contacts.add(new Contact(name, num, email));
                        System.out.println("\n> Contacto ingresado correctamente\n");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("\n> Se llego al limite de contactos para agregar");
                        Thread.sleep(1000);
                    }

                    break;

                case "2":
                    System.out.print("\n> Ingresa el nombre del contacto: ");
                    name = tec.nextLine().toLowerCase();

                    for (int i = 0; i < contacts.size(); i++) {
                        // if (contacts.get(i).getNombre().equals(name)) {
                        // Uso .contains para que te surgiera contactos que contengan el string
                        // ingresado.
                        if (contacts.get(i).getNombre().toLowerCase().contains(name)) {
                            System.out.println("\nNombre: " + contacts.get(i).getNombre() + "\n\n"
                                    + "Telefono: " + contacts.get(i).getNumero() + "\n");
                            System.out.println(contacts.get(i).getMail().isEmpty() ? "No tiene mail\n"
                                    : "Correo: " + contacts.get(i).getMail() + "\n");
                        } else {
                            if (i == contacts.size() - 1) {
                                System.out.println("El contacto " + name + " no existe");
                                Thread.sleep(1000);
                            }
                        }
                    }
                    Thread.sleep(1000);
                    break;

                default:
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n"
                            + "               OPCION INVALIDA"
                            + "\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    Thread.sleep(1000);
                    break;
            }
        } while (opc != "0");

    }

    public static boolean checkEmail(String email) {
        if (email.isEmpty()) {
            return true;
        } else {
            // Expresión que define un patrón de búsqueda para nuestra cadena de caracteres
            Pattern pattern = Pattern.compile(
                    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            // Matcher compara la expresion pattner entre la variable email
            Matcher mat = pattern.matcher(email);

            if (mat.find()) {
                return true;
            } else {
                System.out.print("\n> Ingrese un correo valido (o presione enter si no lo sabe): ");
                return false;
            }
        }
    }

    public static boolean checkName(String name) {
        if (name.isEmpty()) {
            return false;
        } else {
            if (name.matches("[A-Za-z ]*")) {
                return true;
            } else {
                System.out.print("\n> Debe ingresar un nombre valido: ");
                return false;
            }
        }
    }

    public static boolean checkNumber(String num) {
        if (num.isEmpty()) {
            return false;
        } else {
            if (num.matches("[0-9]*")) {
                return true;
            } else {
                System.out.print("\n> Debe ingresar un numero valido: ");
                return false;
            }
        }
    }
}
