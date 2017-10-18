package bean;

public class Caixa {
    
    //Atributos
    private double valor;
    private double saldo;
    
    //Método Construtor
    public Caixa(){
        
        this.valor = 0;
        this.saldo = 0;
    }
    
    //Métodos Getter e Setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Métodos de Classe
    public boolean sacar(double valor){
        
        if (valor <= saldo){
            
            saldo -= valor;
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public boolean depositar(double valor){
        
        if (valor >= 0){
            
            saldo += valor;
            return true;
        }
        else{
            
            return false;
        }
    }
    
}
