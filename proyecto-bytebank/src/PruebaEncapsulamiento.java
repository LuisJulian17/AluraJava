
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1,2);
		Cliente cliente = new Cliente();
		cliente.setNombre("Julian");
		cliente.setDocumento("efqwf1");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
	}
}
