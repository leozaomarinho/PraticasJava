
package praticajava;

import java.util.Locale;
import java.util.Scanner;
public class Atividade02 {
    
    public static void main(String [] Args){
    
        Scanner input = new Scanner(System.in);
        
        //setando a linguagem local do IDE para US
        Locale.setDefault(Locale.US);
        //variaveis
        double R,a,pi = 3.14159 ;
        
        System.out.println("Digite o valor do raio do circulo: ");
        R = input.nextDouble();
        
        a = pi*R*R;
        
        System.out.printf("A=%.4f%n",+a);
          
        input.close();
    }
    
}
