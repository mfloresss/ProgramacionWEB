public class App {
	public static void main(String[] args) throws Exception {
		Estacionamiento.inicializar(2, 60, 180);
		// Se inicializa el estacionamiento con 2 lugares, $60 para el ingreso, $180 la noche

		Persona juan = new Persona("Juan");
		Auto autoJuan = new Auto(Auto.MERCEDEZ_BENZ, "BCF-235", juan);
		Estacionamiento.entra(autoJuan);
		// Se inicializa la cuenta corriente a Juan y se le agrega $60

		Persona ana = new Persona("Ana");
		Auto autoAna = new Auto(Auto.FIAT, "BRF-535", ana);
		Estacionamiento.entra(autoAna);

		Estacionamiento.sale(autoJuan);

		Estacionamiento.nuevoDia();
		// Cierra el estacionamiento y abre el dia siguiente

		Estacionamiento.entra(autoJuan);
		
		Persona felipe = new Persona("Felipe");
		Auto autoFelipe = new Auto(Auto.PEUGEOT, "BFD-124", felipe);
		Estacionamiento.entra(autoFelipe);
		// Notar que no entra el auto, asi que no tiene ningun efecto

		Estacionamiento.mostrarCuenta();
		// Muestra la cuenta de las personas
	}
}
