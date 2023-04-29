import java.util.Scanner;

public class QuestaoQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0;

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            soma += num;
        } while (num != 0);

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
