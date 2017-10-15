package controleponto;

/** @author Mazurco66 */
public class Gerente extends Funcionario{
    
    private String login;
    private String senha;
    
    //Métodos Construtores
    public Gerente(){
        
        super();
        this.login = "";
        this.senha = "";
    }
    
    //Métodos Getter e Setter
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
