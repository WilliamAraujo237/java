import java.util.Scanner;
public class matris_2x2 {
    public static void main(String[] args) {
        int[ ][ ] quant = new int[ 4 ][ 5 ];
        int soma = 0;
         Scanner s = new Scanner(System.in);
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[ i ].length; j++) {
                 System.out.println("informe o valor do "+(i+1) + "º trimestre e " + (j+1) + "º região. " );
                 quant[ i ][ j ] = s.nextInt();
            }
        }
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[ i ].length; j++) 
                 soma = soma + quant[ i ][ j ];
        }
        System.out.println("O total de quantidades vendidas é:" + soma);   }
}
