
public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaJulian = new Cuenta(1,2);	
		cuentaJulian.getTitular().setNombre("Julian");
		System.out.println(cuentaJulian.getTitular().getNombre());
	}
}
