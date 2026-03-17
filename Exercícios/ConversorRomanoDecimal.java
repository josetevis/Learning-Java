package Exercícios;
import java.util.Scanner;

public class ConversorRomanoDecimal {

    public static String[] quebrador(String romanNumber){

         String[]  quebra = romanNumber.split("");
         for(int i=0;i<quebra.length;i++){
             if(quebra[i] == "0" || quebra[i] == "1" || quebra[i] == "2"
                     || quebra[i] == "3" || quebra[i] == "4" || quebra[i] == "5"
                     || quebra[i] == "6" || quebra[i] == "7"
                     || quebra[i] == "8" || quebra[i] == "9")
                 break;
         }
             return quebra;

    }

    public static String[] conversor (String valor){
        String[] converter = quebrador(valor);
        String[] resultado = new String[valor.length()];
        for(int i=0;i<valor.length();i++){
            switch (converter[i]){
                case "I":
                    resultado[i] = "1";
                    break;
                case "V":
                    resultado[i] = "5";
                    break;
                case "X":
                    resultado[i] = "10";
                    break;
                case "L":
                    resultado[i] = "50";
                    break;
                case "C":
                    resultado[i] = "100";
                    break;
                case "D":
                    resultado[i] = "500";
                    break;
                case "M":
                    resultado[i] = "1000";
                    break;
            }
        }
     return resultado;
    }

    public static int[] Stoi(String numtoint){
        String[] letraNumero = conversor(numtoint);
        int[] receptaculo = new int[numtoint.length()];
        for(int i=0;i<numtoint.length();i++){
           receptaculo[i] = Integer.parseInt(letraNumero[i]);
        }
        return receptaculo;

    }

    public static int numeroDecimal(String conversorfinal){
        int resultado = 0;
        int[] somador = Stoi(conversorfinal);
        for(int i=0;i<conversorfinal.length();i++){
            if(i < somador.length -1 && somador[i] < somador[i+1]){
                resultado-= somador[i];
            }
            else{
                resultado+= somador[i];
            }

        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.println("Escolha seu número romano: ");
        String scan = select.nextLine();
        int romanNumber = numeroDecimal(scan);

        System.out.println("O número romano "+ scan+ " Em decimal equivale a: "+romanNumber);

    }
}
