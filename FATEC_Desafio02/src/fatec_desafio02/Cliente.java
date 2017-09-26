package fatec_desafio02;

public class Cliente {
    
    private int id;
    private String nome;
    private Conta conta;
    
    public Cliente(){
        
        this.conta = new Conta();
    }
    
    public Cliente(int id, String nome){
        
        this.id = id;
        this.nome = nome;
        this.conta = new Conta();
    }
    
    //Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    //Métodos de Classe
    public double getSaldoMedio(){
        
        return this.conta.getSaldoMedio();
    }
    
    public void setSaldoMedio(double valor){
        
        this.conta.setSaldoMedio(valor);
    }
    
}
