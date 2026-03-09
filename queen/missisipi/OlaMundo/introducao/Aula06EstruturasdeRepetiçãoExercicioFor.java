package queen.missisipi.OlaMundo.introducao;

public class Aula06EstruturasdeRepetiçãoExercicioFor {

    public static void main(String[] args) {

        int i;

        System.out.println("Número par: ");
        for(i=0; i<=100; i++){
            int divisor = i%2;

            if(divisor == 0){

                System.out.println(i);
            }

        }

    }

}
