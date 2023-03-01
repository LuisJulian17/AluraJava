
public class PruebaConstructor {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(5,2);	
		Cuenta cuenta2 = new Cuenta(333,2);
		Cuenta cuenta3 = new Cuenta(444,2);
		
		System.out.println(Cuenta.getTotal());
	}
	
}
