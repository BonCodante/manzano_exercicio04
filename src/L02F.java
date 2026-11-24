import java.util.Scanner;

/** Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente*/

public class L02F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor C: ");
        int c = sc.nextInt();

        int auxiliar;

        if (a > b) {
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        if (a > c) {
            auxiliar = a;
            a = c;
            c = auxiliar;
        }
        if (b > c) {
            auxiliar = b;
            b = c;
            c = auxiliar;
        }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);




        sc.close();

    }
}
