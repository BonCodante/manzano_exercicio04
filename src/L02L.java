import java.util.Scanner;

/** Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
 saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
 mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
 mensagem de saudação o nome previamente informado.  */

public class L02L {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        String sexo = sc.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido informado.");
        }


        sc.close();
    }
}
