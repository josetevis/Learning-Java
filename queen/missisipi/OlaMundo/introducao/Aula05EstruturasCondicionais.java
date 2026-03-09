package queen.missisipi.OlaMundo.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
     int idade =17;
     boolean isAutorizedbuydrink = idade >= 20;
     String resultado;
     String pode = "usuário pode comprar bebida alcólica";
     String nPode = "usuário não pode comprar bebida alcólica";
     if(isAutorizedbuydrink){
         resultado = pode;
     }else{
       resultado = nPode;
     }
        System.out.println(resultado);
    }
}
