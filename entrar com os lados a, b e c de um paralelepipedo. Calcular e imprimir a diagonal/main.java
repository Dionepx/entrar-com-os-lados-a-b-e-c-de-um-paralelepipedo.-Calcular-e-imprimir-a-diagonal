import java.util.Scanner;

// a = comprimento, b = largura, c = altura

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Entre com a largura: ");
        double largura = scanner.nextDouble();

        System.out.println("Entre com a altura: ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;
        double diagonal = Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2) + Math.pow(altura, 2));

        System.out.println("Diagonal: " + diagonal);
        System.out.println("Volume: " + volume);
    }
}