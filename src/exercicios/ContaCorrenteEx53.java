package exercicios;

public class ContaCorrenteEx53 extends ContaBancariaEx52 {

	public ContaCorrenteEx53(String identificacao, Double saldoInicial) {
		super(identificacao, saldoInicial);
	}
	
	static private Double taxa = 1.3;
	
	@Override
	Double sacar(Double valor) {
		if (valor > 0 && saldo > 0) {
			System.out.println("Saque realizado!");
			return saldo -= (valor * taxa);
		} else {
			System.out.println("Ação cancelada!");
			return saldo;
		}
	}
}

class ContaPoupanca extends ContaBancariaEx52 {

	public ContaPoupanca(String identificacao, Double saldoInicial) {
		super(identificacao, saldoInicial);
	}
	
	static private Double rendimento = 1.2;
	
	@Override
	Double depositar(Double valor) {
		if (valor > 0) {
			System.out.println("Depósito realizado!");
			return saldo += (valor * rendimento);
		} else {
			System.out.println("Ação cancelada!");
			return saldo;
		}
	}
}