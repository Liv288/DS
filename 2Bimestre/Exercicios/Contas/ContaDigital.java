
public class ContaDigital extends Conta{
	public void cartao() {
		double novoSaldo = getSaldo() - getValores();
		System.out.println("Você gastou R$"+getValores()+", agora seu saldo é de R$"+ novoSaldo);
	}
	public void cadastrarDados() {
		String nome = getNome();
		String cpf = getCpf();
		int dtNascimento = getDtNascimento();
	}
	public void listarDados() {
		System.out.println("Seu nome é " + getNome());
		System.out.println("Seu cpf é " + getCpf().substring(0,3)+"."+getCpf().substring(3,6)+"."+getCpf().substring(6,9)+"-"+getCpf().substring(9,11));
		System.out.println("Você nasceu dia: " + getDtNascimento());
	}
	public void poupanca() {
    }

    public void deposito() {
    }
}
