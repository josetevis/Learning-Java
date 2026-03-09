package queen.missisipi.OlaMundo.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double payment = 4000;
        String messageDonate = "vou doar 500";
        String messageNoDonate = "Não irei doar";
        String nada = "nothing";
        String messageResult = payment > 5000 ? messageDonate : payment == 5000 ? messageNoDonate : nada ;


        System.out.println(messageResult);
    }
}
