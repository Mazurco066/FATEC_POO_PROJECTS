package fatec_prjfuncionarios;

import java.util.Scanner;
import model.bean.Funcionario;

/**
 * @author Mazurco066
 */
public class PrincipalFuncionarios {
    
    
    
    //Definindo atributos
    public final int T = 10;   //Constante para definir tamanho do vetor
    public Funcionario[] F = new Funcionario[T];   //Vetor do tipo Funcionario
    static int indice = 0;  //Indice Estatico para definir posição do vetor
    public static boolean cadastrou = false;    //Para verificar se usuário foi cadastrardo
    public static boolean sair = false;    //Variável para saída do programa
    public static PrincipalFuncionarios p = new PrincipalFuncionarios();
    
    
    //Métodos de Classe Main
    void execBonificacao(){
        
        if (cadastrou){ //Verifica se ja foi cadastrado algum usuário
            
            //Lendo Indice
            Scanner sc = new Scanner(System.in);
            int pos;
            
            System.out.print("Entre com o indice a ser pesquisado: ");
            pos = Integer.parseInt(sc.nextLine());
            
            if (pos < 0 || pos >= indice){
                
                System.out.println("Indice inexistente!");
            }
            else{
                
                System.out.print("Entre com o valor da bonificação: ");
                double boni = Double.parseDouble(sc.nextLine());
                F[pos].bonificar(boni);
                System.out.println("Salario Atual = " + F[pos].getSalario());
            }
            
        }
        
    }
    
    void execConsulta(){ 
        
        if (cadastrou){ //Verifica se ja foi cadastrado algum funcionário
            
            //Lendo Indice
            Scanner sc = new Scanner(System.in);
            int pos;
            
            System.out.print("Entre com o indice a ser pesquisado: ");
            pos = Integer.parseInt(sc.nextLine());
            
            if (pos < 0 || pos >= indice){
                
                System.out.println("Indice inexistente!");
            }
            else{
                
                System.out.println("Funcionário Encontrado");
                F[pos].show();
            }
            
        }
        else{
            
            System.out.println("Cadastre um funcionário primeiro!");
        }
        
    }
    
    void execCadastro(){
        
        //Criando objeto na posição do indice
        F[indice] = new Funcionario();
        Scanner sc = new Scanner(System.in);
        
        //Inserindo dados
        System.out.print("Entre com nome: ");
        F[indice].setNome(sc.nextLine());
        System.out.print("Entre com departamento: ");
        F[indice].setDepartamento(sc.nextLine());
        System.out.print("Entre com RG: ");
        F[indice].setRg(sc.nextLine());
        System.out.print("Esta na empresa? Sim/Não");
        if ("Sim".equals(sc.nextLine())){
            F[indice].setEstaNaEmpresa(true);
        }
        else{
            F[indice].setEstaNaEmpresa(false);
        }
        cadastrou = true;
        indice++;
    }
    
    public void menu(){
        
        //Variáveis e Objetos de uso geral
        int opc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU DO SISTEMA");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Consultar Funcionário");
        System.out.println("3 - Bonificar Funcionário");
        System.out.println("4 - Sair");
        System.out.print("Faça uma Escolha: ");
        opc = Integer.parseInt(sc.nextLine());
        
        switch (opc){
            
            case 1:
                //Chama o método de cadastrar funcionário
                p.execCadastro();
            break;
            
            case 2:
                //Chama o método de consultar funcionário
                p.execConsulta();
            break;
            
            case 3:
                //Chama o método de bonificar funcionário
                p.execBonificacao();
            break;
            
            case 4:
                //Define Atributo estatico que poderá sair do sistema
                sair = true;
            break;
            
            default:
                //Opção inválida!
                System.out.println("Opção Inválida!");
            break;
        }
    }
    
    //Método principal main
    public static void main(String[] args) {
        
        //Iniciando método main
        do{
            p.menu();
        }while(!sair);
    }
    
}
