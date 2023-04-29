import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valor;
        
        do {
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            valor = input.nextInt();
        } while (valor < 1 || valor > 10);
        
        System.out.println("Tabuada de " + valor + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        
        input.close();
    }
}
