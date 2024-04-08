package Q1LetraD;

public class ProgramaFaculdadeXPTO {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Ana Silva", "Doutora em Biologia Marinha", 42, 12000, "Conservação Marinha");
        Professor professor2 = new Professor("Lucas Barros", "Mestre em Economia", 35, 9000, "Introdução à Economia");

        System.out.println("Informações do Professor 1:");
        professor1.listar();
        System.out.println("\nInformações do Professor 2:");
        professor2.listar();

        professor1.alterar("Lucas Barros", "Mestre em Economia", 35, 9000, "Introdução à Economia);
        professor2.alterar("Ana Silva", "Doutora em Biologia Marinha", 42, 12000, "Conservação Marinha");

        System.out.println("Informações do Professor 1 após alteração:");
        professor1.listar();
        System.out.println("\nInformações do Professor 2 após alteração:");
        professor2.listar();
    }
}
