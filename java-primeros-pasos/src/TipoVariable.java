
public class TipoVariable {

	public static void main (String[] args) {
		
		//Declarando Variables
		
		System.out.println("Hola Mundo 2");
		
		double edad = 24;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		//concatenacion
		
		edad = 46+88;
		System.out.println(edad);
		System.out.println("Mi edad es: " + edad);
		
		double salario = 1250.50;
		System.out.println(salario + " Salario neto");
		
		edad = 28;
		
		//Operaciones
		
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		int division;
		division = 1250 / 2;
		System.out.println(division);
		
		//Convertir valores
		
		double variable1 = 230.89;
		
		//Forzando a double convertirse en entero
		
		int variable1Entero = (int) variable1 ; //cast
		System.out.println(variable1Entero);
		
		long prueba = 1222222222222222222L;
		short numeroPequeno = 12222;
		byte numeroAunMasPequeno = 122;
		float numeroDecimalPequeno = 1.5F;
		
		double resultado = variable1 + variable1Entero;
		System.out.println(resultado);
	}
	
}
