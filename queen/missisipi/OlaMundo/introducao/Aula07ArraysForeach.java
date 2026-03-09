package queen.missisipi.OlaMundo.introducao;

public class Aula07ArraysForeach {

    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5, 6};

        /*for (int i=numeros2.length - 1; i >=0; i--){
            System.out.println(numeros2[i]);
        }*/
     //o comando abaixo é o foreach. utilizado para facilitar se sua intenção é somente percorrer o array.
        for (int i:numeros2){
            System.out.println(i);
        }
    }
}
