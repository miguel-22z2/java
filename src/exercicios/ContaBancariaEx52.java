package exercicios;

public class ContaBancariaEx52 {
	static public String identificacao;
	static public Double saldo;
	
	public ContaBancariaEx52(String identificacao, Double saldoInicial) {
		ContaBancariaEx52.identificacao = identificacao;
		ContaBancariaEx52.saldo = saldoInicial;
		
	}
	
	void getDados() {
		System.out.println("Nome: " + identificacao);
		System.out.println("Número da conta: 35253735273");
		System.out.println("Número da agência: 225");
	}
	
	void getSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}
	
	Double depositar(Double valor) {
		if (valor > 0) {
			System.out.println("Depósito realizado!");
			return saldo += valor;
		} else {
			System.out.println("Ação cancelada!");
			return saldo;
		}
	}
	
	Double sacar(Double valor) {
		if (valor > 0 && saldo > 0) {
			System.out.println("Saque realizado!");
			return saldo -= valor;
		} else {
			System.out.println("Ação cancelada!");
			return saldo;
		}
	}
}
