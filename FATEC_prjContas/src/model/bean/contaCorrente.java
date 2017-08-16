package model.bean;

/**
 *
 * @author Mazurco066
 */
public class contaCorrente {
    
    //Atributos
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    //Metodos Getter e Setter
    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    //Métodos Funcionais
    public int sacar(double valor){
        
        if (this.saldo <= 0){
            
            return 0;
        }
        else{
            
            this.saldo -= valor;
            return 1;
        }
    }
    
    public void depositar(double valor){
        
        this.saldo += valor;
    }
    
    public void imprimir(){
        
        System.out.println("Nome do Cliente: " + this.nomeCliente);
        System.out.println("Numero da Conta: " + this.conta);
        System.out.println("Numero da Agencia: " + this.agencia);
        System.out.println("Saldo Disponivel: " + this.saldo);
    }
    
}
