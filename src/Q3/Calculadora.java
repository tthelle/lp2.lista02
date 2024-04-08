package Q3;

public class Calculadora {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN;
        }
    }
}
