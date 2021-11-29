import java.util.Scanner;
public class aula1 {
    public static void main(String args[]) {

        int local=0,viagem_estilo=0,inda_n=400, ida_e_volta_n=740, ida_ND=345, ida_e_volta_ND=655, ida_CO=448, ida_e_volta_CO=807;
        
        System.out.println("Digite que tipo de viagem desesa: 1 ida ou 2 ida e volta");
        Scanner s = new Scanner (System.in);
        viagem_estilo=s.nextInt();
        System.out.println("você escolheu :"+viagem_estilo);
        
        System.out.println("escolha 1-norte, 2-nordeste ou 3-Centro Oeste");
        local=s.nextInt();
        
        System.out.println("Confirme para que região vai");
        String região=s.next();
        System.out.println("você escolheu região :"+região);
        
        
        if(local==1){
            if(viagem_estilo==1){
                System.out.println("Opção ida norte, valor R$:"+inda_n);
            }else{
                System.out.println("Opção de ida e volta norte, valor R$:"+ida_e_volta_n);
            }
        }
        if(local==2){
            if(viagem_estilo==1){
                System.out.println("Opção ida nordeste,valor R$:"+ida_ND);
            }else{
                System.out.println("Opção de ida e volta nordeste, valor R$:"+ida_e_volta_ND);
            }
        }
        if(local==3){
            if(viagem_estilo==1){
                System.out.println("Opção ida Centro Oeste, valor R$:"+ida_CO);
            }else{
                System.out.println("Opção de ida e volta Centro Oeste, valor R$:"+ida_e_volta_CO);
            }
        }
      }

}
