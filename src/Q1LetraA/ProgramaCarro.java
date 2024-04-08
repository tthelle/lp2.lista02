package Q1LetraA;

public class ProgramaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro(001, "Toyota", "Branco", "Corolla", 2017, 4, "Gasolina", 5, 45000.0, true);
        Carro carro2 = new Carro(002, "Honda", "Preto", "Civic", 2019, 4, "Flex", 2, 70000.0, false);

        System.out.println("Informações do Carro 1:");
        carro1.listar();
        System.out.println("\nInformações do Carro 2:");
        carro2.listar();

        carro1.alterar(001,"Chevrolet", "Prata", "SUV", 2021, 4, "Alcool", 10, 80000.0, true);
        carro2.alterar(002,"Toyota", "Vermelho", "Corolla", 2022, 4, "Combustivel", 6, 75000.0, true);

        System.out.println("\nInformações atualizadas do Carro 1:");
        carro1.listar();
        System.out.println("\nInformações atualizadas do Carro 2:");
        carro2.listar();
    }
}
