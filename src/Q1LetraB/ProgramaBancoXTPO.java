package Q1LetraB;

public class ProgramaContaPoupança {
    public static void main(String[] args) {

        ContaPoupanca conta1 = new ContaPoupanca("Jonas", "12345678-9", "567.898.765-33", 34500.0, 75991357886, 122);
        ContaPoupanca conta2 = new ContaPoupanca("Gabriela", "87655943-6", "345.637.889-98", 70000.0, 75992345664, 318);

        System.out.println("Saldo da conta 1: ");
        conta1.imprimirSaldo();
        System.out.println("Saldo da conta 2: ");
        conta2.imprimirSaldo();

        conta1.alterar("Gustavo", "12345678-9", "567.898.765-33", 56700.0, 75991357886, 122);
        conta2.alterar("Julia", "87655943-6", "345.637.889-98", 65000.0, 75992345664, 318);

        System.out.println("Saldo da conta 1 após alterações: ");
        conta1.imprimirSaldo();
        System.out.println("Saldo da conta 2 após alterações: ");
        conta2.imprimirSaldo();
    }
}
