package queen.missisipi.OlaMundo.introducao;

public class Aula05Exercícios {

    public static void main(String[] args) {
        double salario = 50000;
        double primeiraFaixa = 9.75 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;


        String salario1 = "O valor de imposto a ser pago é de: "+salario*primeiraFaixa;
        String salario2 = "O valor de imposto a ser pago é de: "+salario*segundaFaixa;
        String salario3 = "O valor de imposto a ser pago é de: "+salario*terceiraFaixa;
        String resultado;

        if(salario <= 40000){
            resultado = salario1;
        }
        else if(salario > 40000 && salario < 70000) {

            resultado = salario2;
        }
        else{
            resultado = salario3;
    }
        System.out.println(resultado);
    }
}
