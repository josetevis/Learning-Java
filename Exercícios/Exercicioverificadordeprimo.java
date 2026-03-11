package Exercícios;
import java.util.Scanner;

public class Exercicioverificadordeprimo {

    public static double raiz(int a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

        int opcao;
        Scanner select = new Scanner(System.in);

        System.out.print("Digite o número que você deseja verificar se é primo: ");
        opcao = select.nextInt();

        boolean primo = true;

        for(int i = 2; i <= raiz(opcao); i++){

            int resultado = opcao%i;

            if(resultado == 0){
                primo = false;
                break;
            }

        }

        if(primo == true){
            System.out.println("O número " + opcao + " é primo");
        }else{
            System.out.println("O número " + opcao + " não é primo");
        }

    }
}