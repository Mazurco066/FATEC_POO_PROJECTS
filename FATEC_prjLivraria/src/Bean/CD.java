package Bean;

/** @author Mazurco066 */

public class CD extends Produto{
    
    //Atributos de acesso (private)
    private String artista;
    private String gravadora;
    private String paisOrigem;
    
    //Método construtor padrão
    public CD(){
        
        this.artista = "";
        this.gravadora = "";
        this.paisOrigem = "";
    }
    
    //Métodos de modificação de Acesso aos Campos
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    //Métodos específicos da Classe
    public String listarProduto(){
        
        StringBuilder text = new StringBuilder();
        text.append("<---DADOS DO PRODUTO--->\n");
        text.append("Descrição......: ").append(this.getDescricao()).append("\n");
        text.append("Gênero.........: ").append(this.getGenero()).append("\n");
        text.append("Estoque........: ").append(this.getEstoqueDisponivel()).append("\n"); 
        text.append("Preço..........: ").append(this.getPrecoCusto()).append("\n");
        text.append("Artista........: ").append(this.getArtista()).append("\n");
        text.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        return text.toString();
    }
    
}
