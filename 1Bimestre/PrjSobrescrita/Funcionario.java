import java.util.Scanner;
public class Funcionario {
	
    private String nome;
    private double salario;

    public Funcionario() {
        this.salario = 1500;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void listarDados() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        setNome(ler.next());

        System.out.print("Digite seu salário: ");
        setSalario(ler.nextDouble());

        System.out.println("Nome: " + getNome() + " | Salário: R$" + getSalario());

        
    }
}
