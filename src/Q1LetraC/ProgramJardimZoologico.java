package Q1LetraC;

public class ProgramJardimZoologico {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Leão", "15 de junho de 2018", "Simba", 234, "Savana do Serengeti, Tanzânia");
        Animal animal2 = new Animal("Tigre", "7 de novembro de 2019", "Rajah", 754, "Floresta de Sundarbans, Índia");

        System.out.println("Informações sobre o animal 1: ");
        animal1.listar();
        System.out.println("Informações sobre o animal 2: ");
        animal2.listar();

        animal1.alterar("Tigre", "7 de novembro de 2019", "Rajah", 754, "Floresta de Sundarbans, Índia");
        animal2.alterar("Leão", "15 de junho de 2018", "Simba", 234, "Savana do Serengeti, Tanzânia");

        System.out.println("Informações sobre o animal 1 após alteração: ");
        animal1.listar();
        System.out.println("Informações sobre o animal 2 após alteração: ");
        animal2.listar();
    }
}
