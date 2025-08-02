import java.util.Scanner;
public class Gerente extends Funcionario {

    public Gerente() {
        setSalario(2510); 
    }

    public void aprovarFolga() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Você deseja aprovar essa folga? ");
        String aprovacao = ler.next();

        if (aprovacao.equalsIgnoreCase("Sim")) {
            System.out.println("Folga Aprovada");
        } else {
            System.out.println("Folga Reprovada");
        }

    }
}
