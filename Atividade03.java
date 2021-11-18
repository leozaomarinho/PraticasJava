package praticajava;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        //scanner para entrada

        //variaveis
        int A, B, C, D, Dif;

        System.out.println("Digite o valor de A :");
        A = input.nextInt();
        
        System.out.println("Digite o valor de B :");
        B = input.nextInt();
        
        System.out.println("Digite o valor de C :");
        C = input.nextInt();
        
        System.out.println("Digite o valor de D :");
        D = input.nextInt();
        
        Dif = (A*B) - (C*D);
        
        System.out.println("A diferença de A e B para C e D é :" +Dif);
        
        input.close();
    }

}
