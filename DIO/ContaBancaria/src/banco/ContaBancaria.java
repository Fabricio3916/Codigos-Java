package banco;

public class ContaBancaria {
	private double saldo;
	private double chequeEspecial;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
		if(saldo <= 500) {
			this.chequeEspecial = 50;
		}
		else{
			this.chequeEspecial = saldo / 2;
		}
		
	}

	public double consultarSaldo() {
		return saldo;
	}

	public void depositarDinheiro(double valor) {
		saldo += valor;
		System.out.println("Seu novo saldo é de: " + saldo );
	}
	
	public void sacarDinheiro(double valor) {
		
	}

	public double consultarChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
}
