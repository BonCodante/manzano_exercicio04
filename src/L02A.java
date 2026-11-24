import java.util.Scanner;

/** Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor. */

public class L02A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = sc.nextInt();

        int diferenca;
        if (valor1 > valor2) {
            diferenca = valor1 - valor2;
        } else {
            diferenca = valor2 - valor1;
        }

        System.out.println("A diferença do maior pelo menor é: " + diferenca);



        sc.close();
    }
}
