package queen.missisipi.OlaMundo.introducao;

public class Aula06EstruturasdeRepetiçãoBreak {
    public static void main(String[] args) {
/*int i;
int valorMax=50;

for(i=0; i<=valorMax;i++){

    System.out.println(i);
    if(i == 25){

        break;
    }
}*/

        //Exercício: dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //condição: valor da parcela >=1000;

      /*  int value = 68500;
        int parcela = 1500;
        int resultado = value / parcela;
        double quebrado = value % parcela;
        if (quebrado != 0) {

            System.out.println(resultado + " parcelas de " + parcela + " e mais uma parcela de: " + quebrado);
        } else {

            System.out.println(resultado + " parcelas de " + parcela);
        }*/

        //outra forma:

        double valor = 45800;
        int quantidadeDeParcelas;

        for (quantidadeDeParcelas = 1; quantidadeDeParcelas <valor ; quantidadeDeParcelas++) {

            double valorParcela = valor/quantidadeDeParcelas;
            if(valorParcela>=1000){
                System.out.println("Parcela "+quantidadeDeParcelas+" R$ "+valorParcela);

            }
            else{
                break;
            }
        }

    }


}

