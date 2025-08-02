import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String escolha;
        System.out.println("Escolha gerente ou assistente");
        escolha = ler.next();

        switch (escolha) {
            case "Gerente":
                Gerente gerente = new Gerente();
                gerente.listarDados();
                gerente.aprovarFolga();
                break;

            case "Assistente":
                Assistente assistente = new Assistente();
                assistente.listarDados();
                break;

            default:
                System.out.println("Opção inválida");
        }

        ler.close(); 
    }
}
