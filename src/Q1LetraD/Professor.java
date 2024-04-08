package Q1LetraD;

public class Professor{
    String nome;
    String titulacao;
    int cargaHoraria;
    double salario;
    String disciplinas;

    public void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Carga horária (semanal): " + this.cargaHoraria);
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplinas ensinadas: " + this.disciplinas);
    }

    public void cadastrar (String nome, String titulacao, int cargaHoraria, double salario, String disciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void alterar (String nome, String titulacao, int cargaHoraria, double salario, String disciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;
        System.out.println("Alteração realizada com sucesso.");
    }

}
