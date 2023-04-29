import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        
        System.out.println("Digite 10 números:");
        
        for (int i = 0; i < 10; i++) {
            int numero = input.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Foram digitados " + pares + " números pares e " + impares + " números ímpares.");
        
        input.close();
    }
}
