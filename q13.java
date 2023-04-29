import java.util.Scanner;

public class QuestaoTreze {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;

    do {
      System.out.print("Digite um número: ");
      num = scanner.nextInt();
    } while(num > 1);

    System.out.println("Número digitado é menor ou igual a 1.");
  }
}
