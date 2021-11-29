import java.util.Scanner;
public class testes {
    

     public static void main(String[] args)  {
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o texto a ser criptografado: ");
		String texto = entrada.nextLine();
		System.out.print("Informe a chave de deslocamento: ");
		int chave = entrada.nextInt();

	
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = texto.length();
		int letraCifradaASCII;

		
		for(int c=0; c < tamanhoTexto; c++){
			
			int letranormal = ((int) texto.charAt(c));
			
			if (letranormal != 32)
				letraCifradaASCII = ((int) texto.charAt(c)) + chave;
			else
				letraCifradaASCII = ((int) texto.charAt(c));
		
		
			
			while(letraCifradaASCII > 126)  {
				letraCifradaASCII -= 94;
			}
			
			textoCifrado.append( (char)letraCifradaASCII );
		}
		
	
		
		System.out.println("\n\nTEXTO CRIPTOGRAFADO   : " + textoCifrado);
		
			
	}

}

