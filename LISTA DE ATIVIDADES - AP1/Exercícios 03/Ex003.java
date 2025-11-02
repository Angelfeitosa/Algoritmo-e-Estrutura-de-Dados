import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.printf("O funcionário %s tem um salário de R$%.2f reais por Mês.%n", nome, salario);

        scanner.close();
    }
}
