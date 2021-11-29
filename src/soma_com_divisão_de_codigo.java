import java.util.Scanner;
public class soma_com_divisão_de_codigo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o primeiro valor");
        int val1=s.nextInt();
        
        System.out.println("digite o segundo valor");
        int val2=s.nextInt();
        
        int resposta= Soma(val1,val2);

        System.out.println("O resultado da soma é de "+resposta);
    }
    public static int Soma (int n1, int n2){
        int soma=0;
        soma = n1+n2;
        return soma;
    }
}
