import java.util.Scanner;

public class QuestaoOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        while (num < 12 || num > 20) {
            System.out.print("Digite um número entre 12 e 20: ");
            num = sc.nextInt();
            if (num < 12 || num > 20) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }
        
        System.out.println("O número digitado foi: " + num);
        
        sc.close();
    }
}
