package fatec_prjcomputadores;

import java.util.Scanner;

/**
 *
 * @author Mazurco066
 */
public class FATEC_principalComputador {

    public static void main(String[] args) {
        
        // Program Start
        System.out.println("Testando a Classe Computador");
        
        //Iniciando os Objetos
        Scanner sc = new Scanner(System.in);
        Computador c = new Computador();
        Computador c2 = new Computador();
        
        //Atribuindo Valores a Computadores para testes
        c.setMarca("HP");
        c.setCor("Branco");
        c.setModelo("HP Prodesk 400");
        c.setNumeroSerie(1005543564);
        c.setPreco(900.00);
        
        //Imprimindo Valores Atuais
        c.imprimir();
        
        //Calculando Valor do Computador e imprimir novamente
        c.calculaValor();
        c.imprimir();
        
        //Atribuindo Valores ao Segundo Computador
        c2.setMarca("IBM");
        c2.setCor("Preto");
        c2.setModelo("IBM 5160");
        c2.setNumeroSerie(1567543564);
        c2.setPreco(500.00);
        
        //Imprimindo Valores Atuais
        c2.imprimir();
        
        //Calculando Valor e imprimir novamente
        c2.calculaValor();
        c2.imprimir();
        
        //Alterando Valor com numero positivo e validando
        if (c2.alteraValor(700.00) == 1){
            
            System.out.println("Valor Alterado com Sucesso!");
        }
        else{
            
            System.out.println("OPS. Valor Negativo, não foi possivel alterar");
        }
        
        //Imprimindo resultado Final dos testes da classe
        c2.imprimir();
        
    }
    
}
