package Exercícios;
import java.util.Scanner;


public class ExercicioEstacionamento {

    public static int contador(int linhas, int coluna, int colunas){

       int count = linhas * colunas + coluna +1;
       return count;



    }

    public static int[] criarVagas(int numero){
        int colunas = (int) Math.sqrt(numero);
        int linhas = (int) Math.ceil((double) numero / colunas);

        return new int[] {linhas, colunas};
    }

    public static int[] posicaoVaga(int posicao, int colunas) {
        int linha = (posicao - 1) / colunas;
        int coluna = (posicao - 1) % colunas;

        return new int[] {linha, coluna};
    }

    public static void main(String[] args) {
        System.out.println("Digite o número de vagas que você deseja que o estacionamento tenha, somente número de vagas pares são aceitos. ");
        Scanner select = new Scanner(System.in);
        int posicao = 0;
        posicao = select.nextInt();
        int[] mapaDeVagas = criarVagas(posicao);
        String[][] vagas = new String[mapaDeVagas[0]][mapaDeVagas[1]];
        int totaldevagas = vagas.length * vagas[1].length;
        int opcao = 0;
        int linhas = 0;
        int colunas = 0;
        int vagasselect = 0;
        int vagasLivres = 0;
        int count =0;

        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {

                count++;
                vagas[i][j] = Integer.toString(count)+ "| ";
            }
        }
        while (opcao != 5) {
            System.out.println("1 - Mostrar estacionamento\n" + "2 - Estacionar carro\n" + "3 - Retirar carro\n" + "4 - Contar vagas livres\n" + "5 - Encerrar\n" + " Escolha sua opção: ");
            opcao = select.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < vagas.length; i++) {
                        for (int j = 0; j < vagas[i].length; j++) {
                            System.out.print(vagas[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 2: {
                    System.out.print("Escolha em qual posição deseja estacionar seu carro: ");

                    posicao = select.nextInt();

                    int[] coordenadas =  posicaoVaga(posicao, mapaDeVagas[1]);
                    linhas = coordenadas[0];
                    colunas = coordenadas[1];
                    if (posicao < 0 || posicao > totaldevagas) {
                        System.out.println("Vaga inexistente");
                    }
                    if (vagas[linhas][colunas].equals("X")) {
                        System.out.println("Vaga já ocupada");
                    }
                    vagas[linhas][colunas] = null;
                    vagas[linhas][colunas] = "X| ";
                    vagasselect++;
                }
                break;
                case 3: {
                    System.out.print("em qual posição está seu carro para que possamos retirá-lo?: ");
                    posicao = select.nextInt();

                    int[] coodernadas = posicaoVaga(posicao, mapaDeVagas[1]);
                    linhas = coodernadas[0];
                    colunas = coodernadas[1];
                    if (posicao < 0 || posicao > totaldevagas) {
                        System.out.println("Vaga inexistente");
                    }
                    if (!vagas[linhas][colunas].equals("X")) {
                        System.out.println("Essa vaga já se encontra livre");
                    }
                    vagas[linhas][colunas] = Integer.toString(contador(linhas, colunas, mapaDeVagas[1])) + "| ";
                    vagasselect--;
                }
                break;
                case 4: {

                    vagasLivres = totaldevagas - vagasselect;

                    System.out.println(vagasLivres + " Vagas livres");
                }
                break;
                case 5: {
                    System.out.println("Volte sempre <3");
                }
                break;
            }
        }
    }
}