package queen.missisipi.OlaMundo.introducao;

/**
 * int = para numeros inteiros(4 bytes)
 * long = para numeros inteiros(8 bytes)
 * double = para numeros decimais(8 bytes)
 * float = para numeros decimais(4 bytes)
 * byte = para valores inteiros (1 byte, -128 - 127)
 * short = para valores inteiros (2 bytes, -32768 - 32767)
 * boolean = para verificar se uma condição é verdadeira ou falsa.
 * char = traduz um valor decimal para um numérico da tabela ASCII, e vice-versa.
 * obs: char tbm utiliza valores da tabela unicode atraves do comamdo: \Uxxxx, obs2: U minúsculo.
 *
 */

public class Aula02VariaveisPrimitivas {
    public static void main(String[] args) {
        System.out.println("Peba");

        //int,double,float,char,byte,short,long e boolean
        int age = 10;
        long bigNumber = 100000;
        double paymentDouble = 2500.0;
        float paymentFloat = 2500.0F;
        byte ageByte =   10;
        short ageShort = 10;
        boolean trully = true;
        boolean fake = false;
        char character = 85;
        System.out.println("The age is: "+age+ " years");
        System.out.println("The age is: "+character+ " years");

    }
}