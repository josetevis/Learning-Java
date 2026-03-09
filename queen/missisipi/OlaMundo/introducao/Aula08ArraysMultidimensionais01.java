package queen.missisipi.OlaMundo.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];
        for(int[] array: arrayInt2){
            for(int num: array){
                System.out.println(num);
            }
        }


    }
}
