package prjtabuleirodasorte;

import java.util.Scanner;
import model.bean.Tabuleiro;

/**
 * @author Mazurco066
 */
public class TabuleiroDaSorte {

    public static void main(String[] args) {
        
        //Váriaveis de uso local
        int n1, n2;
        float premio;
        
        //Instanciando Objetos
        Scanner sc = new Scanner(System.in);
        Tabuleiro T = new Tabuleiro(10);
        
        //Coletando 2 números do usuário
        System.out.print("Entre com seu primeiro palpite: ");
        n1 = sc.nextInt();
        System.out.print("Entre com seu segundo palpite: ");
        n2 = sc.nextInt();
        
        //Calculando Premio
        T.sortearTabuleiro();
        premio = T.verificaAcerto(n1, n2);
        System.out.println(T.toString());
        if (premio != 0){
            
            System.out.println("Parabens seu premio foi de " + premio);
        }
        else{
            
            System.out.println("Infelizmente você não ganhou nada... Tente novamente!");
        }
    }
    
}
