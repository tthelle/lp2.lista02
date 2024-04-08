package Q1LetraC;

public class Animal {
    String especie;
    String nascimento;
    String nome;
    int numRegistro;
    String localNasc;

    public void listar() {
        System.out.println("Espécie: " + this.especie);
        System.out.println("Data de nascimento: " + this.nascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de registro: " + this.numRegistro);
        System.out.println("Local de nascimento: " + this.localNasc);
    }

    public void cadastrar (String especie, String nascimento, String nome, int numRegistro, String localNasc){
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNasc = localNasc;
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void alterar (String especie, String nascimento, String nome, int numRegistro, String localNasc){
        this.especie = especie;
        this.nascimento = nascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNasc = localNasc;
        System.out.println("Alteração realizada com sucesso.");
    }

}
