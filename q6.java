import java.util.Scanner;

public class QuestaoSeis {
    public static vod main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int dentroIntervalo = 0;
        int foraIntervalo = 0;
        
        System.out.println("Digite 10 números:");
        
        for (int i = 0; i < 10; i++) {
            int numero = input.nextInt();
            
            if (numero >= 10 && numero <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }
        
        System.out.println("Foram digitados " + dentroIntervalo + " números dentro do intervalo [10,20] e " + foraIntervalo + " números fora do intervalo.");
        
        input.close();
    }
}
