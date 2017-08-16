package fatec_prjapolice;

import java.util.Scanner;
import model.bean.Apolice;

/**
 * @author Mazurco066
 */
public class FATEC_prjApolice {

    public static void main(String[] args) {
        
        // Program Start
        System.out.println("Entrada de Dados");
        
        //Iniciando Objetos
        Scanner scanner = new Scanner(System.in);
        Apolice A = new Apolice();
        
        //Entrada dos Dados
        System.out.println("Entre com o nome do Segurado: ");
        A.setNomeSegurado(scanner.nextLine());
        System.out.println("Entre com a idade do Segurado: ");
        A.setIdade(scanner.nextInt());
        System.out.println("Entre com o valor do premio: ");
        A.setValorPremio(scanner.nextFloat());
        
        //Imprimindo os Dados
        System.out.println("IMPRIMINDO OS DADOS!");
        A.imprimir();
    }
    
}
