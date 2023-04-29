import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        int i = 0;
        while (i < 3) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            soma += nota;
            i++;
        }
        
        double media = soma / 3;
        System.out.println("A média das notas é: " + media);
        
        sc.close();
    }
}
