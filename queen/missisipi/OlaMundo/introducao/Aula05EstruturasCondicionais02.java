package queen.missisipi.OlaMundo.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        int age =17;
        String categoria;
        if(age < 15){
            categoria = "Categoria infantil";
        }else if(age >=15 && age < 18){
            categoria = "categoria juvenil";
        }else{
            categoria = "categoria adulta";
        }
        System.out.println(categoria);
    }
}
