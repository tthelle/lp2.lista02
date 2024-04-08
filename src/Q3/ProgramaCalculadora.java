package Q3;
import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.println("Escolha a operação a ser realizada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número correspondente à operação: ");
        int operacao = teclado.nextInt();

        double resultado;
        switch (operacao) {
            case 1:
                resultado = Calculadora.soma(num1, num2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = Calculadora.subtracao(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = Calculadora.divisao(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Selecione uma opção válida.");
        }

        scanner.close();
    }
}
}
