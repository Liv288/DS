import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String escolha, nome, cpf;
        int dtNascimento;
        double saldo, valores;

        System.out.print("Escolha o tipo de conta (Corrente, Poupança ou Digital): ");
        escolha = in.next();

        switch (escolha) {
            case "Corrente":
            	ContaCorrente cc = new ContaCorrente();

                System.out.print("Digite seu nome: ");
                nome = in.next();
                cc.setNome(nome);

                System.out.print("Digite seu CPF: ");
                cpf = in.next();
                cc.setCpf(cpf);

                System.out.print("Digite sua data de nascimento: ");
                dtNascimento = in.nextInt();
                cc.setDtNascimento(dtNascimento);
                
                System.out.println("Digite seu saldo: ");
                saldo = in.nextDouble();
                cc.setSaldo(saldo);
                
                System.out.println("Quantos reais você deseja depositar?");
                valores = in.nextDouble();
                cc.setValores(valores);
                		
                
                cc.listarDados();
                cc.deposito();
                break;

            case "Poupança":
                ContaPoupanca cp = new ContaPoupanca();

                System.out.print("Digite seu nome: ");
                nome = in.next();
                cp.setNome(nome);

                System.out.print("Digite seu CPF: ");
                cpf = in.next();
                cp.setCpf(cpf);

                System.out.print("Digite sua data de nascimento: ");
                dtNascimento = in.nextInt();
                cp.setDtNascimento(dtNascimento);
                
                System.out.println("Digite seu saldo: ");
                saldo = in.nextDouble();
                cp.setSaldo(saldo);
                
                System.out.println("Quantos reais você deseja guardar?");
                valores = in.nextDouble();
                cp.setValores(valores);


                cp.listarDados();
                cp.poupanca();
                break;

            case "Digital":
                ContaDigital cd = new ContaDigital();

                System.out.print("Digite seu nome: ");
                nome = in.next();
                cd.setNome(nome);

                System.out.print("Digite seu CPF: ");
                cpf = in.next();
                cd.setCpf(cpf);

                System.out.print("Digite sua data de nascimento: ");
                dtNascimento = in.nextInt();
                cd.setDtNascimento(dtNascimento);
                
                System.out.println("Digite seu saldo: ");
                saldo = in.nextDouble();
                cd.setSaldo(saldo);
                
                System.out.println("Quantos reais você deseja pagar?");
                valores = in.nextDouble();
                cd.setValores(valores);

                cd.listarDados();
                cd.cartao();
                break;
        }

        in.close();
    }
}
