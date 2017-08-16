package fatec_prjlaboratório1;

import java.util.Scanner;
import model.bean.contaCorrente;

/**
 *
 * @author Mazurco066
 */
public class PrincipalContasCorrentes {
    
    //Atributos Publicos
    public static boolean cadastrou = false;
    public static int Tamanho = 3;
    public int index = 0;
    contaCorrente[] conta = new contaCorrente[Tamanho];

    public static void main(String[] args) {
        // TODO code application logic here
        int opt;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        PrincipalContasCorrentes obj = new PrincipalContasCorrentes();
        
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
                    obj.execSaque();
                    break;
                }
                
                //Realizar Deposito
                case 2:{
                    obj.execDeposito();
                    break;
                }
                
                //Realizar Consulta
                case 3:{
                    obj.execConsulta();
                    break;
                }
                
                //Realizar Cadastro
                case 4:{
                    obj.execCadastrar();
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
    
    public void execSaque(){
        //Função que retira dinheiro da conta do cliente
        if (cadastrou){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Entre com o indice da conta[0, 1 ou 2]: ");
            int pos = Integer.parseInt(sc.nextLine());
            if (pos >= 0 || pos < this.index){
                
                System.out.print("Entre com o valor do saque: ");
            
                if (this.conta[pos].sacar(sc.nextDouble()) == 1){
                    System.out.println("Saque Efetuado com Sucesso!");
                }
                else{
                    System.out.println("Você não tem dinheiro para efetuar o saque! Deposite dinheiro!");
                }
            }
            else{
                
                System.out.println("Conta não Encontrada!");
            }
        }
        else{
            System.out.println("Efetue o Cadastro Primeiro!");
        }
    }
    
    public void execDeposito(){ //OK
        //Função que deposita deinheiro na conta do cliente
        if (cadastrou){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Entre com o indice da conta[0, 1 ou 2]: ");
            int pos = Integer.parseInt(sc.nextLine());
            if (pos >= 0 || pos < this.index){
                System.out.print("Entre com o valor do deposito: ");
                this.conta[pos].depositar(sc.nextDouble());
                System.out.println("Deposito Efetuado com Sucesso!");
            }
            else{
                System.out.println("Conta não encontrada!");
            }
        }
        else{
            System.out.println(" Efetue o Cadastro Primeiro!");
        }
        
    }
    
    public void execConsulta(){ //OK parcial
        //Função que imprime os dados da conta atual
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição da conta[0, 1 ou 2]");
        int pos = Integer.parseInt(sc.nextLine());
        if(pos < 0 || pos >= this.index){
            
            System.out.println("OPS.... Essa conta não existe");
        }
        else{
            
            this.conta[pos].imprimir();
        }
    }
    
    public void execCadastrar(){    //OK
        //Função para entrda de dados cadastrais do cliente
        if (index == Tamanho){
            
            System.out.println("OPS... Não é possivel realizar cadastro pos todos as vagas estão cheias!");
        }
        else{
            Scanner sc = new Scanner(System.in);
            this.conta[index] = new contaCorrente();
            System.out.print("Entre com seu Nome: ");
            this.conta[index].setNomeCliente(sc.nextLine());
            System.out.print("Entre com numero de sua Conta: ");
            this.conta[index].setConta(sc.nextLine());
            System.out.print("Entre com sua Agência: ");
            this.conta[index].setAgencia(sc.nextLine());
            index++;
            cadastrou = true;
        }
    }
    
}

