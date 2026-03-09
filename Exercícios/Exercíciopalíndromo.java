package Exercícios;

public class Exercíciopalíndromo {

    public static void main(String[] args) {

        int num =9009;
        int verificador;
        int original = num;
        int inversor = 0;
         while (num>0){
             verificador = num %10;
             inversor = inversor *10 +verificador;
             num = num/10;



         }
         if(original == inversor){
             System.out.println("É palíndromo");

         }
         else{
             System.out.println("Não é palíndromo");
         }



    }
}
