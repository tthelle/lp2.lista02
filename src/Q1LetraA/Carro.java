package Q1LetraA;

public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabri;
    private int numPortas;
    private String tipoCombustivel;
    private int quantDisp;
    private double preco;
    private boolean completo;

    public void listar() {
        System.out.println("Informações do carro:");
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoFabri);
        System.out.println("Número de portas: " + this.numPortas);
        System.out.println("Tipo de combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade disponível: " + this.quantDisp);
        System.out.println("Preço: " + this.preco);
        System.out.println("Completo: " + this.completo);
    }

    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabri, int numPortas, String tipoCombustivel, int quantDisp, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabri = anoFabri;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantDisp = quantDisp;
        this.preco = preco;
        this.completo = completo;
        System.out.println("Cadastro completo.");
    }

    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabri, int numPortas, String tipoCombustivel, int quantDisp, double preco, boolean completo) {
        this.marca = marca;
        this.cor = cor;
        this.anoFabri = anoFabri;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantDisp = quantDisp;
        this.preco = preco;
        this.completo = completo;
        System.out.println("Alteração completa.");
    }
}