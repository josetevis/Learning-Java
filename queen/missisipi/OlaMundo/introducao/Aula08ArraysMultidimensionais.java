package queen.missisipi.OlaMundo.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30,31 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

       /* for(int i=0; i< dias.length;i++){

            for(int j=0;j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }*/
        //abaixo como fazer com foreach
        for(int[]arrayBase: dias){

            for(int num:arrayBase){
                System.out.println(num);
            }
        }

    }
}
