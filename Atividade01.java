
package praticajava;

import java.util.Scanner;
public class Atividade01 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        //variaveis
        int num1,num2,soma;
        
        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = input.nextInt();
        
        soma = (num1+num2);
        
        System.out.println("Soma = "+soma);    
    }
    
}
