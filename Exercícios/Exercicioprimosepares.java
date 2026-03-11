package Exercícios;
import java.util.Scanner;


public class Exercicioprimosepares {

    public static double raiz(int a){
        return Math.sqrt(a);
    }

    public static boolean isPrimo(int n){
        if(n == 1) return false;
        for(int i=2;i<=raiz(n);i++){
            if(n%i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        int numInit;
        int numEnd;
        int countPrimos = 0;
        int countPares = 0;
        int countImpares = 0;
        int countPrimosImpares = 0;
        Scanner select = new Scanner(System.in);

        System.out.println("Digite o intervalo de números que você deseja: \n indo de: ");
        numInit = select.nextInt();
        System.out.print("Até: ");
        numEnd= select.nextInt();

       for(int i=numInit;i<=numEnd;i++){
           if(isPrimo(i)){
               System.out.println(i);
               countPrimos++;
           }
           if(i%2 == 0){
               countPares++;
           }
           else {
               countImpares++;
           }
       }
        countPrimosImpares = numInit <=2 ? countPrimos -1 : countPrimos;
        System.out.println("O número de pares entre "+numInit+" e "+numEnd+" é igual a: "+countPares);
        System.out.println("O número de impares entre "+numInit+" e "+numEnd+" é igual a: "+countImpares);
        System.out.println("O número de primos entre "+numInit+" e "+numEnd+" é igual a: "+countPrimos);
        System.out.println("O número de primos e ímpares entre "+numInit+" e "+numEnd+" é igual a: "+countPrimosImpares);
    }
}
