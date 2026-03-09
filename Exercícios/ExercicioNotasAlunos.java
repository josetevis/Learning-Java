package Exercícios;

public class ExercicioNotasAlunos {
    public static void main(String[] args) {

       double maiorMedia =0;
       int melhorAluno =0;
        double alunos[][] = {{6,8,5,4},{7,8,8,9},{10,2,10,10},{5,8,5,10}};

        for(int i=0; i<alunos.length; i++){
            double soma =0;
              for(int j=0; j<alunos[i].length; j++){
                  soma += alunos[i][j];


              }
            double divisao = soma/4;
            if(divisao >= 7){
                System.out.println("Aluno "+ i + " Media: "+divisao+ " Situação: Aprovado");


            }
            else{
                System.out.println("Aluno "+ i + " Média: "+divisao+ " Situação: Reprovado");
        }

            if(divisao > maiorMedia){
                maiorMedia = divisao;
                melhorAluno = i;

            }
        }
        System.out.println("Maior nota pertence ao aluno: "+melhorAluno+" com média de: "+maiorMedia);

    }

}
