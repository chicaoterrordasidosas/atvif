import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        
        System.out.println("Digite as idades (ou -1 para sair):");
        
        while (true) {
            int idade = input.nextInt();
            
            if (idade == -1) {
                break;
            }
            
            soma += idade;
            contador++;
        }
        
        double media = (double) soma / contador;
        
        System.out.println("A média das idades é " + media);
        
        input.close();
    }
}
