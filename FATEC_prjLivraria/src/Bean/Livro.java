package Bean;

/** author Mazurco066 */

public class Livro extends Produto{
    
    //Atributos com acesso (private)
    private String autor;
    private String editora;
    private String edicao;
    
    //Construtor padrão
    public Livro(){
        this.autor = "";
        this.editora = "";
        this.edicao = "";
    }
    
    //Métodos de modificação de Acesso aos Campos
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    //Métodos especificos de Classe
    public String listarProduto(){
        
        StringBuilder text = new StringBuilder();
        text.append("<---DADOS DO PRODUTO--->\n");
        text.append("Descrição......: ").append(this.getDescricao()).append("\n");
        text.append("Gênero.........: ").append(this.getGenero()).append("\n");
        text.append("Estoque........: ").append(this.getEstoqueDisponivel()).append("\n"); 
        text.append("Preço..........: ").append(this.getPrecoCusto()).append("\n");
        text.append("Autor..........: ").append(this.getAutor()).append("\n");
        text.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        return text.toString();
    }
    
}
