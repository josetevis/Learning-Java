package Exercícios;
import java.util.Scanner;


public class Exercicioparenteses {

    public static String[] quebrador(String parenteses){

        String[] quebra = parenteses.split("");

        return quebra;

    }

    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        String seletor;
        int j;
        boolean valido = true;
        System.out.println("Digite a sequência de parênteses: ");
        seletor = select.nextLine();
        j = seletor.length() -1;
        String[] receptor = quebrador(seletor);
        for(int i=0;i<=j;i++){
            if(seletor.length() % 2 != 0){
                valido = false;
            }
            if(receptor[i].equals("(") && receptor[j].equals(")")){
                j--;
            }
            else if(receptor[i].equals("[") && receptor[j].equals("]")){
                j--;
            }
            else if(receptor[i].equals("{") && receptor[j].equals("}")){
                j--;
            }
            else{
                valido = false;
                break;
            }

        }
        if(valido){
            System.out.println("A sequência de parênteses: "+ seletor + " segue a regra");
        }
        else{
                System.out.println("A sequência de parênteses: "+ seletor + " não segue a regra");
        }
    }
}
