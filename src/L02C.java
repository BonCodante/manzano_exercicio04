import java.util.Scanner;

/** Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
 dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
 foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
 valor da média do aluno para qualquer condição. */

public class L02C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 ) / 4.0;

        if (media >=5.0){
            System.out.println("Aluno APROVADO - Média: " +media);
        }else{
            System.out.println("Aluno REPROVADO - Media: "+ media);
        }

        sc.close();
    }
}
