package Exercícios;
import java.util.Scanner;

public class ExercicioEstacionamento {
    public static int[] posicaoVaga(int posicao) {
        int linha = (posicao - 1) / 6;
        int coluna = (posicao - 1) % 6;

        int[] resultado = {linha, coluna};

        return resultado;
    }

    public static void main(String[] args) {
        String[][] vagas = new String[5][6];
        Scanner select = new Scanner(System.in);

        int opcao = 0;
        int linhas = 0;
        int colunas = 0;
        int vagasselect = 0;
        int vagasLivres = 0;
        int posicao = 0;

        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {
                vagas[i][j] = "L";
            }
        }
        while (opcao != 5) {
            System.out.println("1 - Mostrar estacionamento\n" + "2 - Estacionar carro\n" + "3 - Retirar carro\n" + "4 - Contar vagas livres\n" + "5 - Encerrar\n" + " Escolha sua opção: ");
            opcao = select.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < vagas.length; i++) {
                        for (int j = 0; j < vagas[i].length; j++) {
                            System.out.print(vagas[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2: {
                    System.out.print("Escolha em qual posição deseja estacionar seu carro: ");

                    posicao = select.nextInt();

                   int[] coordenadas =  posicaoVaga(posicao);
                   linhas = coordenadas[0];
                   colunas = coordenadas[1];
                    if (posicao < 0 || posicao > 30) {
                        System.out.println("Vaga inexistente");
                    }
                    if (vagas[linhas][colunas].equals("O")) {

                        System.out.println("Vaga já ocupada");
                    }
                    vagas[linhas][colunas] = "O";
                    vagasselect++;
                }
                break;
                case 3: {
                    System.out.print("em qual posição está seu carro para que possamos retirá-lo?: ");
                    posicao = select.nextInt();

                    int[] coodernadas = posicaoVaga(posicao);
                    linhas = coodernadas[0];
                    colunas = coodernadas[1];
                    if (posicao < 0 || posicao > 30) {
                        System.out.println("Vaga inexistente");
                    }
                    if (vagas[linhas][colunas].equals("L")) {
                        System.out.println("Essa vaga já se encontra livre");
                    }
                    vagas[linhas][colunas] = "L";
                    vagasselect--;
                }
                break;
                case 4: {

                    vagasLivres = 30 - vagasselect;

                    System.out.println(vagasLivres + " Vagas livres");
                }
                break;
                case 5: {
                }
                break;
            }
        }
    }
}
