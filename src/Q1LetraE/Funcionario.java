package Q1LetraE;

public class Funcionario {
    String nome;
    String nascimento;
    double rg;
    double cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String instrucao;
    int matricula;

    public void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.nascimento);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: "  + this.endereco);
        System.out.println("Local de nascimento: " + this.naturalidade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Grau de instrução: " + this.instrucao);
        System.out.println("Matrícula: " + this.matricula);
    }

    public void cadastrar (String nome, String nascimento, double rg, double cpf, String endereco, String naturalidade, double salario, String profissao, String instrucao, int matricula){
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.instrucao = instrucao;
        this.matricula = matricula;
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void alterar (String nome, String nascimento, double rg, double cpf, String endereco, String naturalidade, double salario, String profissao, String instrucao, int matricula){
        this.nome = nome;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.instrucao = instrucao;
        this.matricula = matricula;
        System.out.println("Alteração realizada com sucesso.");
    }

}
