package fatec_projetoacampamentos;

import java.util.Scanner;
import model.bean.Acampamento;

/**
 *
 * @author Mazurco066
 */
public class principalAcampamentos {

    public static void main(String[] args) {
        
        //Program Start
        System.out.println("Entrada de Dados");
        
        //Iniciando os Objetos
        Scanner sc = new Scanner(System.in);
        Acampamento A = new Acampamento();
        
        //Entrada de Dados
        System.out.println("Entre com o nome: ");
        A.setNome(sc.nextLine());
        System.out.println("Entre com a Idade: ");
        A.setIdade(sc.nextInt());
        
        //Testando os Dados
        A.imprimir();
        
        //Atribuindo Grupo e Testando Dados novamente
        A.separarGrupo();
        A.imprimir();
        
    }
    
}
