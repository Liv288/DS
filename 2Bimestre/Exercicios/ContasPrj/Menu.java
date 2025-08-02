public class Menu {
    public static void main(String[] args) {
        Conta[] contas = new Conta[6];

     
        contas[0] = new ContaCorrente("Luan", 1000.0);
        contas[1] = new ContaCorrente("Lucas", 2000.0);

        contas[2] = new ContaPoupanca("Zelda", 1500.0);
        contas[3] = new ContaPoupanca("Link", 2500.0);

        contas[4] = new ContaDigital("Lara Croft", 500.0);
        contas[5] = new ContaDigital("Scoffier", 800.0);

    
        for (Conta conta : contas) {
            conta.exibirDados();
        }
    }
}
