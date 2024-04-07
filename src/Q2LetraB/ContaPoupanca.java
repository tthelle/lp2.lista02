package Q2LetraB;
/*Sabendo que uma Conta Poupança para o Banco XPTO possui as seguintes
informações: Nome do Correntista, RG, CPF, saldo, número, agência. O
objeto possui os seguintes comportamentos: (i) cadastrar e alterar que
recebem como parâmetro as características da Conta Poupança; (ii)
Imprimir Saldo - que é responsável por imprimir o Saldo do Correntista.*/

public class ContaPoupanca {
    private String nome;
    private int rg;
    private int cpf;
    private double saldo;
    private int numero;
    private int agencia;

    public void cadastrar (String nome, int rg, int cpf, double saldo, int numero, int agencia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void alterar (String nome, int rg, int cpf, double saldo, int numero, int agencia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Alteração realizada com sucesso.");
    }

    public void imprimirSaldo(){
        System.out.println("Nome do correntista: " + nome + "Saldo total: " +saldo);
    }


}
