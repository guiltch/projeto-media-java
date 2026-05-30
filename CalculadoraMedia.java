import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) a Calculadora de Média!");

        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);
    }
}
