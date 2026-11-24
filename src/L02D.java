import java.util.Scanner;

/** Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
 dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
 média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
 Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
 aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
 condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.  */

public class L02D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if (media >= 7.0) {
            System.out.println("Aluno APROVADO! Média: " + media);
        } else {
            System.out.print("Média insuficiente (" + media + "). Digite a nota do exame: ");
            double notaExame = sc.nextDouble();
            double novaMedia = (media + notaExame) / 2.0;

            if (novaMedia >= 5.0) {
                System.out.println("Aluno APROVADO EM EXAME! Nova média: " + novaMedia);
            } else {
                System.out.println("Aluno REPROVADO! Nova média: " + novaMedia);
            }
        }

        sc.close();
    }
}
