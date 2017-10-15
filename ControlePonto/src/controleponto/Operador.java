package controleponto;

/** @author Mazurc0066 */
public class Operador extends Funcionario{
    
    private double valorHora;
    
    //Método construtor
    public Operador(){
        
        super();
        this.valorHora = 0.0;
    }
    
    //Métodos Getter e Setter
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }  
    
}
