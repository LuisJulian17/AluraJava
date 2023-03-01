
public class Testreferencia2 {
	
	public static void main(String[] args) {
		Cliente Julian = new Cliente();
		Julian.setNombre("Julian P");
		Julian.setDocumento("21331231231");
		Julian.setTelefono("213123");
		
		Cuenta cuentaJulian = new Cuenta(1,2);
		cuentaJulian.setNumero(2);
		cuentaJulian.depositar(100000);		
		cuentaJulian.setTitular(Julian);
		
		System.out.println(cuentaJulian.getTitular().getDocumento());
		System.out.println(cuentaJulian.getTitular());
		System.out.println(Julian);
		
		
	}
}
