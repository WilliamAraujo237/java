import java.awt.Dimension;
import java.awt.Toolkit;
public class Curso_em_Video_exercicio_02 {
    public static void main(String[] args) {
        Toolkit tamanho = Toolkit.getDefaultToolkit();
        Dimension tamanho2= tamanho.getScreenSize();
        System.out.print("o tamanho da sua tela é de "+tamanho2.width);
        System.out.print(" x "+ tamanho2.height);
    }
}
