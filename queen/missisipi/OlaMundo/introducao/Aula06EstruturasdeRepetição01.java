package queen.missisipi.OlaMundo.introducao;

public class Aula06EstruturasdeRepetição01 {

    public static void main(String[] args) {
        //while, do while e for

        int count =12;
        while(count<=10){
            System.out.println(count);
            count++;



        }
      // count =0;
        do{
            System.out.println("dentro do do-while "+ count++);
        }
        while(count <=10);


        for(int i=0; i<count;i++){

            System.out.println("Valor de i: "+i);

        }

    }
}
