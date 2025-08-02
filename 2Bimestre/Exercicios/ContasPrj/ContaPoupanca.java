class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Poupança");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println();
    }
}
