public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);


    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
