import java.util.Scanner;

public class soma_de_matris_impar_professor {
public static void main(String[] args) {
    int[][] m = new int[3][3];
    int soma = 0;
    Scanner s = new Scanner (System.in);
    for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
        System.out.println("digite o elemento da " + (i+1) + "ª     linha e "+ (j+1) + "ª coluna:");
        m[i][j] = s.nextInt();
         }
    }
    for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
        if ( j%2==0 )
             soma = soma + m[i][j];
         }
    }
    System.out.println("Soma = "+soma);
}
}

