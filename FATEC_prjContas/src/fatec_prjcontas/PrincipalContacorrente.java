package fatec_prjcontas;

import java.util.Scanner;
import model.bean.contaCorrente;

/**
 *
 * @author Mazurco066
 */
public class PrincipalContacorrente {
    
    //Atributos Publicos
    public static contaCorrente conta = new contaCorrente();
    public static boolean cadastrou = false;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opt;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        
        //Menu Implementation
        do{
            System.out.println("MENU");
            System.out.println("Opção 1 - Saque");
            System.out.println("Opção 2 - Deposito");
            System.out.println("Opcao 3 - Consulta");
            System.out.println("Opcao 4 - Cadastrar");
            System.out.println("Opção 5 - Sair");
            System.out.print("Escolha: ");
            opt = Integer.parseInt(sc.nextLine());
            
            //Condition System
            switch (opt){
                
                //Realizar Saque
                case 1:{
                    execSaque();
                    break;
                }
                
                //Realizar Deposito
                case 2:{
                    execDeposito();
                    break;
                }
                
                //Realizar Consulta
                case 3:{
                    execConsulta();
                    break;
                }
                
                //Realizar Cadastro
                case 4:{
                    execCadastrar();
                    break;
                }
                
                //Sair
                case 5:{
                    exit = true;
                    break;
                }
                
                //Inválido
                default:{
                    System.out.println("Opção Inválida!");
                    break;
                }
            }
            
        }while(!exit);
        
    }
    
    public static void execSaque(){
        //Função que retira dinheiro da conta do cliente
        if (cadastrou){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Entre com o valor do saque: ");
            
            if (conta.sacar(sc.nextDouble()) == 1){
                System.out.println("Saque Efetuado com Sucesso!");
            }
            else{
                System.out.println("Você não tem dinheiro para efetuar o saque! Deposite dinheiro!");
            }
        }
        else{
            System.out.println(" Efetue o Cadastro Primeiro!");
        }
    }
    
    public static void execDeposito(){
        //Função que deposita deinheiro na conta do cliente
        if (cadastrou){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Entre com o valor do deposito: ");
            conta.depositar(sc.nextDouble());
            System.out.println("Deposito Efetuado com Sucesso!");
        }
        else{
            System.out.println(" Efetue o Cadastro Primeiro!");
        }
        
    }
    
    public static void execConsulta(){
        //Função que imprime os dados da conta atual
        conta.imprimir();
    }
    
    public static void execCadastrar(){
        //Função para entrda de dados cadastrais do cliente
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com seu Nome: ");
        conta.setNomeCliente(sc.nextLine());
        System.out.print("Entre com numero de sua Conta: ");
        conta.setConta(sc.nextLine());
        System.out.print("Entre com sua Agência: ");
        conta.setAgencia(sc.nextLine());
        cadastrou = true;
    }
    
}
