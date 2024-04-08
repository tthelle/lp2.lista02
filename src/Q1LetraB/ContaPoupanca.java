package Q1LetraB;

public class ContaPoupanca {
    private String nome;
    private String rg;
    private String cpf;
    private double saldo;
    private double numero;
    private int agencia;

    public void cadastrar (String nome, String rg, String cpf, double saldo, double numero, int agencia){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void alterar (String nome, String rg, String cpf, double saldo, double numero, int agencia){
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
