class ContaDigital extends Conta {
    public ContaDigital(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void exibirDados() {
        System.out.println("Mercado Pago");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println();
    }
}
