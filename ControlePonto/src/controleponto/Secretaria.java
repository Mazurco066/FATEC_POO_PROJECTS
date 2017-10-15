package controleponto;

/** @author Mazurco066 */
public class Secretaria extends Funcionario{
    
    private String telefone;
    private String ramal;
    
    //Métodos Construtores
    public Secretaria(){
        
        super();
        this.telefone = "";
        this.ramal = "";
    }
    
    //Métodos Getter e Setter
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    } 
    
}
