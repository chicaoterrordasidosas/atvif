import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, maiorIdade = 0, menorIdade = Integer.MAX_VALUE;
        char sexo;
        double salario, mediaSalarios = 0, menorSalario = Double.MAX_VALUE;
        int qtdMulheres = 0, idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';
        int qtdHabitantes = 0;
        
        while (true) {
            System.out.print("Digite a idade (ou um valor negativo para sair): ");
            idade = sc.nextInt();
            if (idade < 0) {
                break;
            }
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next().charAt(0);
            System.out.print("Digite o salário: ");
            salario = sc.nextDouble();
            
            qtdHabitantes++;
            mediaSalarios += salario;
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (sexo == 'F') {
                qtdMulheres++;
            }
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }
        
        if (qtdHabitantes > 0) {
            mediaSalarios /= qtdHabitantes;
            System.out.println("Média dos salários do grupo: " + mediaSalarios);
            System.out.println("Maior idade do grupo: " + maiorIdade);
            System.out.println("Menor idade do grupo: " + menorIdade);
            System.out.println("Quantidade de mulheres na região: " + qtdMulheres);
            System.out.println("Idade e sexo da pessoa que possui o menor salário: " + idadeMenorSalario + ", " + sexoMenorSalario);
        } else {
            System.out.println("Não foi digitada nenhuma informação.");
        }
        
        sc.close();
    }
}
