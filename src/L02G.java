import java.util.Scanner;

/** Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3 */

public class L02G {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o 2º número inteiro: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o 3º número inteiro: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o 4º número inteiro: ");
        int n4 = sc.nextInt();

        System.out.println("Números divisíveis por 2 e 3:");

        if (n1 % 2 == 0 && n1 % 3 == 0) {
            System.out.println(n1);
        }
        if (n2 % 2 == 0 && n2 % 3 == 0) {
            System.out.println(n2);
        }
        if (n3 % 2 == 0 && n3 % 3 == 0) {
            System.out.println(n3);
        }
        if (n4 % 2 == 0 && n4 % 3 == 0) {
            System.out.println(n4);
        }



        sc.close();
    }
}
