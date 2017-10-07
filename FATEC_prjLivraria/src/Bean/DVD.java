package Bean;

/** @author Mazurco066 */

public class DVD extends Produto{
    
    //Atributos de acesso (private)
    private String diretor;
    private String duracao;
    private String censura;
    
    //Construtor padrão
    public DVD(){
        
        this.diretor = "";
        this.duracao = "";
        this.censura = "";
    }
    
    //Métodos modificadores de Acesso a Campos
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
    
    //Metodos específicos da Classe
    public String listarProduto(){
        
        StringBuilder text = new StringBuilder();
        text.append("<---DADOS DO PRODUTO--->\n");
        text.append("Descrição......: ").append(this.getDescricao()).append("\n");
        text.append("Gênero.........: ").append(this.getGenero()).append("\n");
        text.append("Estoque........: ").append(this.getEstoqueDisponivel()).append("\n"); 
        text.append("Preço..........: ").append(this.getPrecoCusto()).append("\n");
        text.append("Diretor........: ").append(this.getDiretor()).append("\n");
        text.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        return text.toString();
    }
    
}
