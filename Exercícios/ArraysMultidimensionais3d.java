package Exercícios;

public class ArraysMultidimensionais3d {

    public static void main(String[] args) {
        int[][][] cinema = new int[2][][];
        cinema[0] = new int[3][5];
        cinema[1] = new int[2][7];
        for(int i=0;i< cinema.length;i++){
            for(int j=0; j<cinema[i].length;j++){
                for (int k=0; k< cinema[i][j].length;k++){
                    cinema[i][j][k] =1;
                    System.out.println("\n-------");
                    System.out.println(cinema[i][j][k]);
                }
            }
        }


    }
}
