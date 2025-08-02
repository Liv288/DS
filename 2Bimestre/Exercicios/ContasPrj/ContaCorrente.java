class ContaCorrente extends Conta {
    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Corrente");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println();
    }
}
