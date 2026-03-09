    package queen.missisipi.OlaMundo.introducao;

    public class Aula06EstruturasDeRepetiçãoContinue {

        public static void main(String[] args) {

            double valor = 45800;
            int quantidadeDeParcelas;

            for (quantidadeDeParcelas = (int) valor ; quantidadeDeParcelas >= 1 ; quantidadeDeParcelas--) {

                double valorParcela = valor/quantidadeDeParcelas;

                if(valorParcela<1000){

                    continue;
                }
                System.out.println("Parcela "+ quantidadeDeParcelas+" R$ "+valorParcela);
            }
        }

    }
