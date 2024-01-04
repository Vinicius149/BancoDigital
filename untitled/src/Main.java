public class Main {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius");


        Conta cc = new ContaCorrente(vinicius);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(vinicius);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
