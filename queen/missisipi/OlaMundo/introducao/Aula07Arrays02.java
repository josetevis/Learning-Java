package queen.missisipi.OlaMundo.introducao;

public class Aula07Arrays02 {
    // byte, short, long, int, double e float 0
    // char '\u0000' ' '
    // boolean false
    //String null
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Sofia";
        nomes[1] = "Tévis";
        nomes[2] = "João";
        for(int i = 0; i< nomes.length;i++) {
            System.out.println(nomes[i]);
        }
     // a linha de baixo limpa o array, e os valores adicionados anteriormente não podem ser recuperados.
        nomes = new String[3];
        nomes[0] = "Annita";
        nomes[1] = "Pedro";
        nomes[2] = "Willian";

        for(int t = 0; t< nomes.length;t++) {
            System.out.println(nomes[t]);
        }
        }



}
