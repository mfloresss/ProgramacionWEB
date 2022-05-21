import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacionamiento {
    private static final int MAX_LUGARES = 8;
    
    // Cambiar los horarios si la consola tira que el estacionamiento esta cerrado
    private static final int HORARIO_ABRE = 7;
    private static final int HORARIO_CIERRA = 8;

    private static int lugares;
    private static int precioIngreso;
    private static int precioNoche;

    private static ArrayList<Auto> lugaresOcupados = new ArrayList<Auto>();

    public static void inicializar(int lugares, int precioIngreso, int precioNoche) {
        Estacionamiento.lugares = lugares;
        Estacionamiento.precioIngreso = precioIngreso;
        Estacionamiento.precioNoche = precioNoche;
        Estacionamiento.lugaresOcupados = new ArrayList<Auto>();
    }

    public static void entra(Auto auto) {
        if (LocalDateTime.now().getHour() >= HORARIO_ABRE && LocalDateTime.now().getHour() <= HORARIO_CIERRA) {
            if (Estacionamiento.lugares > 0 && Estacionamiento.lugares < MAX_LUGARES) {
                auto.getPersona().setCuentaCorriente(auto.getPersona().getCuentaCorriente() + precioIngreso);
                Estacionamiento.lugares--;
                lugaresOcupados.add(auto);
                System.out.println(
                        "===========     INGRESA     ===========\n" +
                                "Nombre: " + auto.getPersona().getNombre() +
                                "\nNro de cuenta: " + auto.getPersona().getCuentaCorriente() +
                                "\nAuto: " + auto.getMarca() +
                                "\n========================================");
            } else if (Estacionamiento.lugares > MAX_LUGARES) {
                System.out.println(
                        "Nuestro estacionamiento permite " + Estacionamiento.MAX_LUGARES + " lugares, no "
                                + Estacionamiento.lugares);
            } else {
                System.out.println("No se puede agregar el auto de " + auto.getPersona().getNombre()
                        + ", el estacionamiento esta lleno");
            }
        } else {
            System.out.println("El estacionamiento esta cerrado");
        }
    }

    public static void sale(Auto auto) {
        if (Estacionamiento.lugaresOcupados.size() != 0) {
            for (int i = 0; i < Estacionamiento.lugaresOcupados.size(); i++) {
                if (Estacionamiento.lugaresOcupados.get(i).getMatricula().equals(auto.getMatricula())) {
                    Estacionamiento.lugares++;
                    lugaresOcupados.remove(auto);
                    System.out.println(
                            "=============     SALE     =============\n" +
                                    "Nombre: " + auto.getPersona().getNombre() +
                                    "\nNro de cuenta: " + auto.getPersona().getCuentaCorriente() +
                                    "\nAuto: " + auto.getMarca() +
                                    "\n========================================");
                } else {
                    System.out.println("El auto con la matricula: " + auto.getMatricula()
                            + " no se encuentra en el estacionamiento");
                }
            }
        } else {
            System.out.println("No hay autos para retirar, el estacionamiento esta vacio");
        }
    }

    public static void mostrarCuenta() {
        if (Estacionamiento.lugaresOcupados.size() != 0) {
            for (int i = 0; i < Estacionamiento.lugaresOcupados.size(); i++) {
                System.out.println(
                        "=============     CUENTA     =============\n" +
                                "Nombre: " + Estacionamiento.lugaresOcupados.get(i).getPersona().getNombre() +
                                "\nNro de cuenta: "
                                + Estacionamiento.lugaresOcupados.get(i).getPersona().getCuentaCorriente() +
                                "\nAuto: " + Estacionamiento.lugaresOcupados.get(i).getMarca() +
                                "\n========================================");
            }
        } else {
            System.out.println("No hay autos para calcular, el estacionamiento esta vacio");
        }
    }

    public static void nuevoDia() {
        if (Estacionamiento.lugaresOcupados.size() != 0) {
            for (int i = 0; i < Estacionamiento.lugaresOcupados.size(); i++) {
                Estacionamiento.lugaresOcupados.get(i).getPersona()
                        .setCuentaCorriente(
                                Estacionamiento.lugaresOcupados.get(i).getPersona().getCuentaCorriente() + precioNoche);
            }
        } else {
            System.out.println("El estacionamiento esta vacio");
        }
    }
}
