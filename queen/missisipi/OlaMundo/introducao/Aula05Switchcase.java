package queen.missisipi.OlaMundo.introducao;

public class Aula05Switchcase {
    public static void main(String[] args) {
        //imprima o dia da semana considerando 1 como domingo

    /*    byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'm':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'f':
                System.out.println("feminino");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }*/

        //Exercício de switch:Dado os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo.

        byte day1 = 1;

        switch (day1) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }


    }

}
