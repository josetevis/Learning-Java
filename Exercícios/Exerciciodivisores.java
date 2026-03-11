package Exercícios;
import java.util.Scanner;


public class Exerciciodivisores {

    public static void main(String[] args) {


        Scanner select = new Scanner(System.in);
        int num = 0;
        int divisor =2;
        int expoente =0;
        int resto;
        int i=0;
        int resultado =1;
       int guarda;

        System.out.print("Digite o número que você deseja saber a qtd de divisores: ");

        num = select.nextInt();
        guarda =num;
        int[]armazem = new int[num];
        while(num >1){

            resto = num%divisor;

           if(resto ==0 ){

              num = num/divisor;
               expoente++;

           }
           else{

                divisor++;
               if (expoente > 0) {

                   armazem[i] = expoente + 1;
                   i++;
               }
               expoente=0;
           }

        }
        if(expoente >0) {
            armazem[i] = expoente + 1;
            i++;
        }

        for(int j=0;j<i;j++){
           resultado = resultado * armazem[j];
        }
        System.out.println("O número de divisores naturais de "+guarda+ " é igual a: "+resultado);
        System.out.print("Os divisores são: ");
        for(int s=1;s<=guarda;s++){
            if(guarda%s == 0){
                System.out.print(s+ ", ");
            }
        }
    }


}
