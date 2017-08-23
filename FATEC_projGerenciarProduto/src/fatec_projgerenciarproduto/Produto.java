package fatec_projgerenciarproduto;

/**
 * @author Mazurco066
 */
public class Produto {
    
    private int codigo;
    private String descricao;
    private double valor;
    private int qtdEstoque;
    private boolean estaDisponivel;
    
    //Construtor padrão
    public Produto(){
        
    }

    //Métodos Getter e Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }

    //Métodos de Classe
    public void show(){
        
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Quantidade em Estoque: " + this.qtdEstoque);
        if (this.estaDisponivel){
            
            System.out.println("Está disponivel");
        }
        else{
            
            System.out.println("Não esta disponivel");
        }
        
    }
    
    public int entrada(int qtd){
        
        if (!estaDisponivel){
            
            System.out.println("O produto esta inativo e não pode registrar Entradas até que esteja Ativo!");
        }
        else{
        
            this.qtdEstoque += qtd;
        }
        
        return qtdEstoque;
    }
    
    public int saida(int qtd){
        
        if(qtd > qtdEstoque || estaDisponivel == false){
            
            System.out.println("Voce não pode realizar saída... produto inativo ou quantidade solicitada é maior que disponivel!");
        }
        else{
            
            this.qtdEstoque -= qtd;
        }
        
        return qtdEstoque;
    }
    
    public void indisponibilizar(){
        
        if (!this.estaDisponivel){
            
            System.out.println("Esse produto ja esta inativado");
        }
        else{
            
            System.out.println("Produto Indisponibilizado com Sucesso!");
            this.estaDisponivel = false;
        }
        
    }
    
}
