public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private String titular;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + this.agencia + ", numero=" + this.numero + ", saldo=" + this.saldo + ", titular="
				+ this.titular + "]";
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public boolean saca(double valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular( String titular) {
		this.titular = titular;
	}
}
