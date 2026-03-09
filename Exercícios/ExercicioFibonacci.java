package Exercícios;
import java.util.Scanner;

public class ExercicioFibonacci {
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        int digito;
        int num1 =0;
        int num2 =1;
        int num3 =1;
        System.out.println("Digite qual termo da sequência fibonacci você deseja saber: ");
        digito = select.nextInt();
         if(digito == 0){
             System.out.println("Opção inválida");
         }
         if(digito == 1){
             System.out.println("O valor do termo de número 1 da sequência fibonacci é: 0");
         }
         if(digito ==2){
             System.out.println("O valor do termo de número 1 da sequência fibonacci é: 1");
         }

         for(int i=0; i<digito -2;i++){
             num3 = num1 + num2;
             num1 = num2;
             num2 = num3;

         }
        System.out.println("O termo de número: "+ digito +" é: "+num3);

    }
}
