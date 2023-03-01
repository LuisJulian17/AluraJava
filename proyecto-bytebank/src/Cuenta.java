//entidad cuenta
class Cuenta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total = 0;

	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permite a 0");
			this.agencia = 1;
			this.numero = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//metodo no retorna valor
	public void depositar(double valor){
		//this.salgo se refiere al saldo de arriba 
		this.saldo += valor;
	}
	//Metodo retorna valor
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Retiro Exitoso");
			return true;
		}
		System.out.println("No Hay dinero");
		return false;
	}
	
	public boolean transferir (double valor, Cuenta destino, Cuenta origen){
		
		if (this.saldo >= valor) {
			origen.retirar(valor);
			destino.depositar(valor);
			System.out.println("Transferencia Exitosa");
			return true;
		}
		System.out.println("No Hay dinero");
		return false;
	}
	//double porque queremos motrar el saldo y este el souble
	
	public double getSaldo (){
		return this.saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return total;
	}
}

