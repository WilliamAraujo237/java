import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o fatorial");
        int fato = s.nextInt();
        int resposta = calculo (fato);
        System.out.println("o valor do fatorial de "+fato+" é "+resposta);
    }
    public static int calculo(int n1) {
        int calculo=1;
        for(int i=n1;i> 0 ;i--){
            calculo= calculo*i;
        }
        return calculo;
    }
    
}


