
import java.util.Scanner;
public class main_calculadora {
    
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Digite 1 para somar ");
        System.out.println("Digite 2 para subtrair ");
        System.out.println("Digite 3 para multiplicacao ");
        System.out.println("Digite 4 para dividir ");
        System.out.println("----------------------------------");

        System.out.print("Digite o numero desejado: ");
        Scanner leitor = new Scanner(System.in);
        int aritimetica = Integer.parseInt(leitor.nextLine()); 

        if (aritimetica > 4){
            System.out.println("Numero invalido");
        }


        System.out.print("Digite o primeiro: ");
        Float a = Float.parseFloat(leitor.nextLine());
        System.out.print("Digite o segundo: ");
        Float b = Float.parseFloat(leitor.nextLine());
        

        
        if(aritimetica == 1){
            float soma = calculadora.soma(a,b);
            System.out.println("O valor da soma é " + soma);
        }
        else if(aritimetica == 2){
            float subtrair = calculadora.subtrair(a,b);
            System.out.println("O valor da subtraçao é " + subtrair);
        }
        else if (aritimetica == 3){
            float multiplicar = calculadora.multiplicar(a,b);
            System.out.println("O valor da multiplicacao é " + multiplicar);
        }
        else if (aritimetica == 4){
            float dividir = calculadora.dividir(a,b);
            System.out.println("O valor da divisao é " + dividir);
        }
    }
}
