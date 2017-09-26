package fatec_desafio02;

public class Banco {
 
    private Cliente[] clientes;
    private int Cont = 0;
    
    //Construtor
    public Banco(){
        
        this.clientes = new Cliente[5];
    }

    //Getter e Setter
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    //Métodos de Classe
    public void addCliente(Cliente c){
        
        if (this.Cont >= 0 && this.Cont < 5){
            
            this.clientes[this.Cont] = new Cliente();
            this.clientes[this.Cont] = c;
            this.Cont++;
        }
    }
    
    public String VerificaCredito(){
        
        StringBuilder texto = new StringBuilder();
        
        for (Cliente C: this.clientes){
            
            if (C != null){
                
                double SM = C.getSaldoMedio();
                
                if (SM <= 200){
                    
                    texto.append("Cliente ").append(C.getNome()).append("Não Recebeu Credito\n");
                }
                else if(SM <= 400){
                    
                    double credito = SM * 0.20;
                    texto.append("Cliente ").append(C.getNome()).append("Recebeu ").append(credito).append(" (20%) de Crédito\n");
                }
                else if(SM <= 600){
                    
                    double credito = SM * 0.30;
                    texto.append("Cliente ").append(C.getNome()).append("Recebeu ").append(credito).append(" (30%) de Crédito\n");
                }
                else if(SM > 600){
                    
                    double credito = SM * 0.40;
                    texto.append("Cliente ").append(C.getNome()).append("Recebeu ").append(credito).append(" (40%) de Crédito\n");
                }
                
            }
            
        }
        
        return texto.toString();
    }
}
