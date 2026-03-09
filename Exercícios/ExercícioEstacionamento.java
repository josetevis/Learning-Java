package Exercícios;
import java.util.Scanner;

public class ExercícioEstacionamento {
    public static void mostrarestacionamento(String[][] args) {

    }

    public static void main(String[] args) {
        String[][] vagas = new String[5][6];
        Scanner select = new Scanner(System.in);

        int opcao = 0;
        int linhas = 0;
        int colunas = 0;
        int vagasselect =0;
        int vagasLivres =0;
        int posicao =0;


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

                    if(posicao == 1){
                        linhas = 0;
                        colunas =0;

                    }
                    if(posicao == 2){
                        linhas = 0;
                        colunas =1;

                    }
                    if(posicao == 3){
                        linhas = 0;
                        colunas =2;

                    }
                    if(posicao == 4){
                        linhas = 0;
                        colunas =3;

                    }
                    if(posicao == 5){
                        linhas = 0;
                        colunas =4;

                    }
                    if(posicao == 6){
                        linhas = 0;
                        colunas =5;

                    }
                    if(posicao == 7){
                        linhas = 1;
                        colunas =0;

                    }
                    if(posicao == 8){
                        linhas = 1;
                        colunas =1;

                    }
                    if(posicao == 9){
                        linhas = 1;
                        colunas =2;

                    }
                    if(posicao == 10){
                        linhas = 1;
                        colunas =3;

                    }
                    if(posicao == 11){
                        linhas = 1;
                        colunas =4;

                    }
                    if(posicao == 12){
                        linhas = 1;
                        colunas =5;

                    }
                    if(posicao == 13){
                        linhas = 2;
                        colunas =0;

                    }
                    if(posicao == 14){
                        linhas = 2;
                        colunas =1;

                    }
                    if(posicao == 15){
                        linhas = 2;
                        colunas =2;

                    }
                    if(posicao == 16){
                        linhas = 2;
                        colunas =3;

                    }
                    if(posicao == 17){
                        linhas = 2;
                        colunas =4;

                    }
                    if(posicao == 18){
                        linhas = 2;
                        colunas =5;

                    }
                    if(posicao == 9){
                        linhas = 3;
                        colunas =0;

                    }
                    if(posicao == 20){
                        linhas = 3;
                        colunas =1;

                    }
                    if(posicao == 21){
                        linhas = 3;
                        colunas =2;

                    }
                    if(posicao == 22){
                        linhas = 3;
                        colunas =3;

                    }
                    if(posicao == 23){
                        linhas = 3;
                        colunas =4;

                    }
                    if(posicao == 24){
                        linhas = 3;
                        colunas =5;

                    }
                    if(posicao == 25){
                        linhas = 4;
                        colunas =0;

                    }
                    if(posicao == 26){
                        linhas = 4;
                        colunas =1;

                    }
                    if(posicao == 27){
                        linhas = 4;
                        colunas =2;

                    }
                    if(posicao == 28){
                        linhas = 4;
                        colunas =3;

                    }
                    if(posicao == 29){
                        linhas = 4;
                        colunas =4;

                    }
                    if(posicao == 30){
                        linhas = 4;
                        colunas =5;

                    }
                    if(posicao < 0 || posicao > 30){
                        System.out.println("Vaga inexistente");
                    }

                    if(vagas[linhas][colunas] == "O"){

                        System.out.println("Vaga já ocupada");
                    }
                    vagas[linhas][colunas] = "O";
                    vagasselect++;


                }
                break;
                case 3:{
                    System.out.print("em qual posição está seu carro para que possamos retirá-lo?: ");
                    posicao = select.nextInt();
                    if(posicao == 1){
                        linhas = 0;
                        colunas =0;

                    }
                    if(posicao == 2){
                        linhas = 0;
                        colunas =1;

                    }
                    if(posicao == 3){
                        linhas = 0;
                        colunas =2;

                    }
                    if(posicao == 4){
                        linhas = 0;
                        colunas =3;

                    }
                    if(posicao == 5){
                        linhas = 0;
                        colunas =4;

                    }
                    if(posicao == 6){
                        linhas = 0;
                        colunas =5;

                    }
                    if(posicao == 7){
                        linhas = 1;
                        colunas =0;

                    }
                    if(posicao == 8){
                        linhas = 1;
                        colunas =1;

                    }
                    if(posicao == 9){
                        linhas = 1;
                        colunas =2;

                    }
                    if(posicao == 10){
                        linhas = 1;
                        colunas =3;

                    }
                    if(posicao == 11){
                        linhas = 1;
                        colunas =4;

                    }
                    if(posicao == 12){
                        linhas = 1;
                        colunas =5;

                    }
                    if(posicao == 13){
                        linhas = 2;
                        colunas =0;

                    }
                    if(posicao == 14){
                        linhas = 2;
                        colunas =1;

                    }
                    if(posicao == 15){
                        linhas = 2;
                        colunas =2;

                    }
                    if(posicao == 16){
                        linhas = 2;
                        colunas =3;

                    }
                    if(posicao == 17){
                        linhas = 2;
                        colunas =4;

                    }
                    if(posicao == 18){
                        linhas = 2;
                        colunas =5;

                    }
                    if(posicao == 9){
                        linhas = 3;
                        colunas =0;

                    }
                    if(posicao == 20){
                        linhas = 3;
                        colunas =1;

                    }
                    if(posicao == 21){
                        linhas = 3;
                        colunas =2;

                    }
                    if(posicao == 22){
                        linhas = 3;
                        colunas =3;

                    }
                    if(posicao == 23){
                        linhas = 3;
                        colunas =4;

                    }
                    if(posicao == 24){
                        linhas = 3;
                        colunas =5;

                    }
                    if(posicao == 25){
                        linhas = 4;
                        colunas =0;

                    }
                    if(posicao == 26){
                        linhas = 4;
                        colunas =1;

                    }
                    if(posicao == 27){
                        linhas = 4;
                        colunas =2;

                    }
                    if(posicao == 28){
                        linhas = 4;
                        colunas =3;

                    }
                    if(posicao == 29){
                        linhas = 4;
                        colunas =4;

                    }
                    if(posicao == 30){
                        linhas = 4;
                        colunas =5;

                    }

                      if(posicao < 0 || posicao > 30){
                          System.out.println("Vaga inexistente");
                      }
                    if(vagas[linhas][colunas] == "L"){
                        System.out.println("Essa vaga já se encontra livre");
                    }
                    vagas[linhas][colunas] = "L";
                    vagasselect--;


                }
                break;
                case 4:{

                             vagasLivres = 30 - vagasselect;

                    System.out.println(vagasLivres + " Vagas livres");
                }
                break;
                case 5:{

                }
                break;

            }
        }
    }
}

