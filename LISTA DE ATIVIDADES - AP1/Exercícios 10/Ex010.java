import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da parede em metros: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        double litrosTinta = area / 2;

        System.out.println("----------------------------------------");
        System.out.printf("A área a ser pintada é de %.2f metros quadrados.%n", area);
        System.out.printf("A quantidade de tinta necessária é de %.2f litros.%n", litrosTinta);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
