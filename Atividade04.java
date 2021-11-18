
package praticajava;
import java.util.Scanner;
import java.util.Locale;
public class Atividade04 {
    
    public static void main(String [] Args){
    
        Scanner input = new Scanner(System.in);
        
        //setando linguagem do IDE US
        Locale.setDefault(Locale.US);
        //variaveis
        double valorH,salario;
        int numFunc,horasTrab;
    
        System.out.println("Digite o número do funcionario :");
        numFunc = input.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrab = input.nextInt();
        
        System.out.println("Digite o valor pago por hora: ");
        valorH = input.nextDouble();
        
        salario = horasTrab*valorH;
        
        System.out.printf("O funcionario de número "+numFunc+" recebe o salario de %.2f",+salario);
        input.close();
    }
    
}
