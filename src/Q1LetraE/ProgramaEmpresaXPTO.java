package Q1LetraE;

public class ProgramaEmpresaXPTO {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Maria da Silva", "12 de março de 1985", 1234567-8, 123.456.789-00, "Rua das Flores, 123, Bairro Felicidade, Cidade Nova, São Paulo", "São Paulo, Brasil", 3500.0, "Enfermeira", "Ensino Superior Completo", 98765432);
        Funcionario funcionario2 = new Funcionario("João Oliveira", "25 de setembro de 1990", 9876543-2, 987.654.321-00, "Avenida dos Sonhos, 456, Bairro Esperança, Cidade do Sol, Rio de Janeiro", "Rio de Janeiro, Brasil", 4200.00, "Engenheiro Civil", "Pós-graduação em Engenharia de Estruturas", 54321987);

        System.out.println("Informações do Funcionário 1:");
        funcionario1.listar();
        System.out.println("\nInformações do Funcionário 2:");
        funcionario2.listar();

        funcionario1.alterar("João Oliveira", "25 de setembro de 1990", 9876543-2, 987.654.321-00, "Avenida dos Sonhos, 456, Bairro Esperança, Cidade do Sol, Rio de Janeiro", "Rio de Janeiro, Brasil", 4200.00, "Engenheiro Civil", "Pós-graduação em Engenharia de Estruturas", 54321987);
        funcionario2.alterar("Maria da Silva", "12 de março de 1985", 1234567-8, 123.456.789-00, "Rua das Flores, 123, Bairro Felicidade, Cidade Nova, São Paulo", "São Paulo, Brasil", 3500.0, "Enfermeira", "Ensino Superior Completo", 98765432);

        System.out.println("Informações do Funcionário 1 após alteração:");
        funcionario1.listar();
        System.out.println("\nInformações do Funcionário 2 após alteração:");
        funcionario2.listar();
    }
}


