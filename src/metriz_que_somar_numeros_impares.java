import java.util.Scanner;
public class metriz_que_somar_numeros_impares {
public static void main(String[] args) {
    int[][] matriz= new int [5][5];
    int soma=0;
    Scanner s = new Scanner(System.in);
    for (int i=0; i < matriz[i].length; i++){
        for(int j=0; j <matriz[j].length; j++){
            System.out.println("informe o valor de "+(i+1)+ " informe o valor de "+(j+1));
            matriz[i][j]=s.nextInt();
        }
    }
    for(int i=0; i<matriz[i].length; i++){
        for(int j=0; j<matriz[j].length;i++){
            if (j%2==0) {
                soma= soma + matriz[i][j];
            }
        }
    }
    System.out.println("o valor total é de"+ soma);
}
}