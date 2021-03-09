
public class ContaPoupanca extends Conta {

	private double valor;
	private double juros;
	private double val_juros;
	
	
	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public double getValJuros() {
		return val_juros;
		}

		public double getValor() {
		return valor;
		}

		public void setValor(double valor) {
		this.valor = valor;
		}

		public void setJuros(double juros) {
		this.juros = juros;
		}

		public double getJuros() {
		return juros;
		}

		public double calculaJuros(double valor, double juros){
		this.val_juros = (valor*juros)+valor;
		return val_juros;

		}

}
