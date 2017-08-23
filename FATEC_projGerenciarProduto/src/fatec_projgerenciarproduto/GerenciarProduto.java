package fatec_projgerenciarproduto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mazurco066
 */
public class GerenciarProduto {
    
    //Definindo atributos a serem usados
    static final int TAMANHO = 10; 
    static ArrayList<Produto> Produtos = new ArrayList(TAMANHO);
    static boolean cadastrou = false;
    
    static void  execCadastrar(){
        
        //Definindo Objetos
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        
        //Recuperando dados do usuário
        System.out.print("Digite Código do Produto: ");
        p.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite Descrição do Produto: ");
        p.setDescricao(sc.nextLine());
        System.out.print("Digite o Valor do Produto: ");
        p.setValor(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a Quantidade em Estoque do Produto: ");
        p.setQtdEstoque(Integer.parseInt(sc.nextLine()));
        p.setEstaDisponivel(true);  //por padrão novo produto esta disponivel
        
        //Adicionando Produto ao Vetor
        Produtos.add(p);
        
        //Finalmente setando atributos de controle
        cadastrou = true;
        
        //Retornando mensagem ao usuário
        System.out.println("Produto inserido com Sucesso!");
        
    
    }
    
    static void execRegistrarEntrada(){
        
        //Definindo e inicializando objetos
        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        boolean encontrado = false;
        
        //Recuperando código do produto e quantidade a ser acrescentada
        System.out.print("Digite o Código do Produto que deverá ser Registrado a Entrada: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Qual a Quantidade de produtos a ser acrescentada?: ");
        quantidade = Integer.parseInt(sc.nextLine());
        
        //Realizando a Busca pelo produto
        Produtos.forEach((Produto p) -> {
            
            if (p.getCodigo() == codigo){
                
                System.out.println("O Produto de Código " + p.getCodigo() + " agora poossui " + p.entrada(quantidade) + " em estoque!");
            }
            
        });
        
    }
    
    static void execRegistrarSaida(){
        
        //Definindo Objetos e os incializando
        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        boolean encontrado = false;
        
        //Recuperando código do produto e quantidade a ser acrescentada
        System.out.print("Digite o Código do Produto que deverá ser Registrado a Saída: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Qual a Quantidade de produtos a ser retirada?: ");
        quantidade = Integer.parseInt(sc.nextLine());
        
        //Realizando a Busca pelo produto
        Produtos.forEach((Produto p) -> {
            
            if (p.getCodigo() == codigo){
                
                System.out.println("O Produto de Código " + p.getCodigo() + " agora poossui " + p.saida(quantidade) + " em estoque!");
            }
            
        });
        
    }
    
    static void execConsulta(){
        
        //Definindo Objetos e os incializando
        Scanner sc = new Scanner(System.in);
        int codigo;
        boolean encontrado = false;
        
        //Recuperando código do produto e quantidade a ser acrescentada
        System.out.print("Digite o Código do Produto que deverá ser buscado: ");
        codigo = Integer.parseInt(sc.nextLine());
        
        //Realizando a Busca pelo produto
        Produtos.forEach((Produto p) -> {
            
            if (p.getCodigo() == codigo){
                
                p.show();
            }
            
        });
        
    }
    
    static void execInativar(){
        
        //Definindo Objetos e os incializando
        Scanner sc = new Scanner(System.in);
        int codigo;
        boolean encontrado = false;
        
        //Recuperando código do produto e quantidade a ser acrescentada
        System.out.print("Digite o Código do Produto que deverá ser Inativado: ");
        codigo = Integer.parseInt(sc.nextLine());
        
        //Realizando a Busca pelo produto
        Produtos.forEach((Produto p) -> {
            
            if (p.getCodigo() == codigo){
                
                p.indisponibilizar();
            }
            
        });
        
    }
    
    public static void main(String[] args) {
    
        int opc;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Menu Principal");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Registrar Entrada");
            System.out.println("3 - Registrar Saída");
            System.out.println("4 - Consultar Produto");
            System.out.println("5 - Inativar Produto");
            System.out.println("6 - Sair do Programa");
            System.out.print("Escolha: ");
            opc = Integer.parseInt(sc.nextLine());
            
            switch (opc){
                
                case 1:
                    //Cadastrar Produto
                    execCadastrar();
                break;
                
                case 2:
                    //Registra Entrada
                    execRegistrarEntrada();
                break;
                
                case 3:
                    //Registra Saída
                    execRegistrarSaida();
                break;
                
                case 4:
                    //Consulta produto
                    execConsulta();
                break;
                
                case 5:
                    //Inativa produto
                    execInativar();
                break;
                
                case 6:
                    //Saída padrão do programa
                    System.out.println("Saiu do programa!");
                break;
            }
        
        } while (opc != 6);
    }
    
}
