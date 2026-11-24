import java.util.Scanner;

/** Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de
 segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o
 referido cálculo. Lembre-se de que a variável A deve ser diferente de zero.*/


public class L02E {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("O valor de A deve ser diferente de zero para ser uma equação de 2º grau.");
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Não existem raízes reais (delta negativo).");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz X1: " + x1);
                System.out.println("Raiz X2: " + x2);
            }
        }


        sc.close();
    }
}
