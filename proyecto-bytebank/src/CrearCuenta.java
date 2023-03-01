
public class CrearCuenta {
	public static void main(String[] args) {
		// Variable           valor
		Cuenta primeraCuenta = new Cuenta(1,2);
		primeraCuenta.depositar(400); 
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta (1,2);
		segundaCuenta.depositar(400);
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
		
		
		
	}
}
