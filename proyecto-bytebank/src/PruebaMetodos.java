
public class PruebaMetodos {
	public static void main(String[] args) {
		
		Cuenta cuentaJulian = new Cuenta(1,2);
		cuentaJulian.depositar(300);
		cuentaJulian.depositar(200);
		
		System.out.println(cuentaJulian.getSaldo());
		
		cuentaJulian.retirar(100);
		System.out.println(cuentaJulian.getSaldo());

		Cuenta cuentaDos = new Cuenta(1,2);
		cuentaDos.depositar(1000);
		
		boolean puedeTransferir = cuentaDos.transferir(400, cuentaJulian, cuentaDos);
		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
			
		} else {
			System.out.println("Transferencia no realizada");
		}
		
		System.out.println(cuentaDos.getSaldo());
		System.out.println(cuentaJulian.getSaldo());
	}
	
}
