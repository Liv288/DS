
public abstract class Conta {
	private String nome;
	private String cpf;
	private double saldo;
	private int dtNascimento;
	private double valores;
	
	public double getValores() {
		return valores;
	}
	public void setValores(double valores) {
		this.valores = valores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(int dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public abstract void cadastrarDados();
	public abstract void listarDados();
	public abstract void deposito();
	public abstract void poupanca();
	public abstract void cartao();
}
