import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
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
