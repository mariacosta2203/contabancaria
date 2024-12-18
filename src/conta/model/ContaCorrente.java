package conta.model;

public class ContaCorrente extends Conta { //  extends => herança/herda

	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {

		super(numero, agencia, tipo, titular, saldo); // Invocando o metódo Construtor Conta

		this.limite = limite;

	}
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
		
		
	}

	//metodo de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Polimorfismo sobrescrita
	public void visualizar() {
		super.visualizar(); //refrencia da classe principal
		System.out.println("Limite de crédito: " + this.limite);
		
	}

}
