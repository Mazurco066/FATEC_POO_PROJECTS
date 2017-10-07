package Bean;

/** @author Mazurco066 */

public class Produto {
    
    //Atributos com acesso (private)
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
    
    //Método construtor sem parâmetros
    public Produto(){
        this.descricao = "";
        this.estoqueDisponivel = 0;
        this.genero = "";
        this.precoCusto = 0.0;
    }
    
    //Métodos modificadores de Acesso aos Campos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    //Métodos específicos de classe
    public void comprar(int quantidade){
     
        StringBuilder text = new StringBuilder();
        
        if (quantidade > 0){
            
            text.append("<---ESTOQUE--->\n");
            text.append("Estoque do Produto ").append(this.descricao).append("\n");
            text.append("Quantidade Antiga: ").append(this.estoqueDisponivel).append("\n");
            this.estoqueDisponivel += quantidade;
            text.append("Quantidade Atual: ").append(this.estoqueDisponivel).append("\n");
        }
        else{
            
            text.append("Erro: Quantidade Inválida!"); 
        }
        
        System.out.println(text);
           
    }
    
    public void vender(int quantidade){
        
        StringBuilder text = new StringBuilder();
        
        if (quantidade < this.estoqueDisponivel && quantidade > 0){
            
            text.append("<---ESTOQUE--->\n");
            text.append("Estoque do Produto ").append(this.descricao).append("\n");
            text.append("Quantidade Antiga: ").append(this.estoqueDisponivel).append("\n");
            this.estoqueDisponivel -= quantidade;
            text.append("Quantidade Atual: ").append(this.estoqueDisponivel).append("\n");
        }
        else{
            
            text.append("Você não possúi essa quantidade em estoque para vender!"); 
        }
        
        System.out.println(text);
    }
    
}
