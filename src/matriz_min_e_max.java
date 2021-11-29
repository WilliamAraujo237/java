import java.util.Scanner;

public class matriz_min_e_max{
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int maior = 0, linha = 0, minimax = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m[i].length; j++) {
            System.out.println("digite o valor");
            m[i][j] = s.nextInt();
             }
        }
        maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m[i].length; j++) {
                 if (maior < m[i][j])  {
                maior = m[i][j];
                linha = i;
                 }
             }
        }
        minimax = m[linha][0];
    for (int j = 0; j < m[linha].length; j++) {
             if (m[linha][j] < minimax)
                 minimax = m[linha][j];
        }
        System.out.println("O elemento minimax encontra-se na "+(linha+1)+ "ª linha da matriz e vale "+minimax );
    }
}
