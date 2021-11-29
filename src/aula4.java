import java.util.Scanner;
public class aula4 {
    public static void main(String[] args) throws Exception {
    
        Scanner s= new Scanner(System.in);
        System.out.println("digite a frase que quer cripitografar");
        String resultado=s.next();
        

        System.out.println("digite a chave");
        int chave=s.nextInt();
        

        for(int i=0; i<resultado.length(); i++){
            System.out.println(resultado.charAt(i)+chave);
        }
       

    }
}
