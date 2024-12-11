package conta.model;

public class Conta {
	
	// Atributos = Váriaveis 
	
		private int numero; // 0
		private int agencia; // 1
		private int tipo; // 1
		private String titular; // "João"
		private float saldo; // 50f
		
		/*3 modificadores de acesso
		 * 
		 * Private - somente o código dentro do arquivo pode acessar (meu celular)
		 * Protected - Se estiverem dentro do mesmo packge podem acessar (telefone residencial, só as pessoas da minha casa podem usar)
		 * Public - Qualquer classe pode acessar (telefone público - orelhão)
		 * Default - Igual a protecd, mas ela depende de herança, então só atributos
		 * */
		
		// Método Especial - Método Construtor
		public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
			
			//this => Representa a Classe Conta = Conta.numero
			// numero = 6
			// this.numero = 6
			
			this.numero = numero;
			this.agencia = agencia;
			this.tipo = tipo;
			this.titular = titular;
			this.saldo = saldo;
			
		}
		
		//Comportamentos = metodos
		
			// metodos de acesso
		
		
		// get -> pegar o número na váriavel / guardar o numero
		public int getNumero() {
			return numero;
		}

		// Set -> Colocar/Setar - atualiza o atributo / colocar um novo valor
		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public boolean sacar(float valor) {
			if (this.getSaldo() < valor) {
				System.out.println("\n Saldo Insuficiente");
				return false;
			}
			
			this.setSaldo(this.getSaldo() - valor);
			return true;
			
		}
		
		public void depositar(float valor) {
			
			this.setSaldo(this.getSaldo() + valor);
			
		}
		
		public void visualizar() {
			
			String tipo = "";
			
			switch (this.tipo) {
			
			case 1:
				tipo = "Conta corrente";
				
				break;
				
			case 2:
				tipo = "Conta poupança";
				
				break;
			
			}
			
			System.out.println("\n\n**********************************************************************");
			System.out.println("Dados da Conta");
			System.out.println("************************************************************************");
			System.out.println("Número da Conta: " + this.numero);
			System.out.println("Agência: " + this.agencia);
			System.out.println("Tipo de Conta: " + tipo);
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo: " + this.saldo);
			
		}

}
