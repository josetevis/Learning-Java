package Exercícios;
import java.util.Scanner;


public class DecimalRomano {
   static int[] numeros = {1000,900,500,400,100,90,50,40,10,5,1};
   static String[] letras = {"M","CM","D","CD","C","XC","L","XL","X","V","I"};
    public static String decrementador(int num){
        String retorno = "";
        for(int i=0;i<numeros.length;i++){
           while (num >= numeros[i]){
               num = num - numeros[i];
               retorno = retorno + letras[i];
           }
        }
      return retorno;
    }

    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.println("Digite o número decimal que você deseja converter para número romano: ");
        int decimal = select.nextInt();
        String resultado = decrementador(decimal);
        System.out.println("O valor "+decimal+ " em algarismos romanos é: "+ resultado);

    }
}
