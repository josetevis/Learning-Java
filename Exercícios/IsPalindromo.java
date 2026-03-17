package Exercícios;
import java.util.Locale;
import java.util.Scanner;
import java.text.Normalizer;
public class IsPalindromo {

    public static String normalizador(String normal){
          String normalizada = Normalizer.normalize(normal, Normalizer.Form.NFD)
        .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

          normalizada = normalizada.toLowerCase()
                  .replaceAll("[^a-z0-9]", "");
      return normalizada;
    }

    public static boolean verificador(String word){
        int j=word.length() -1 ;
        boolean trueOrFalse = true;
        char[] letra = word.toCharArray();
        for(int i=0;i<j;i++){
            if(letra[i] != (letra[j])){
                trueOrFalse = false;
                break;
            }
            j--;
        }
        return trueOrFalse;
    }

    public static void main(String[] args) {
       Scanner select = new Scanner(System.in);
       String palavra;
        System.out.println("Digite o número ou letra que você deseja verificar se é palíndromo: ");
        palavra = select.nextLine();
        String text = normalizador(palavra);
        if(verificador(text)){
            System.out.println("A palavra ou número "+ palavra+ " é palíndromo");
        }
        else{
            System.out.println("A palavra ou número "+ palavra+ " não é palíndromo");
        }
    }
}
