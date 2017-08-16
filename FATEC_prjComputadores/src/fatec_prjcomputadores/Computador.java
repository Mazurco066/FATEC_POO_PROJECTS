package fatec_prjcomputadores;

/**
 *
 * @author Mazurco066
 */
public class Computador {
    
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    //Métodos Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void imprimir(){
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numero de Série: " + this.numeroSerie);
        System.out.println("Preço: " + this.preco);
    }
    
    public void calculaValor(){
        
        if (this.marca.equals("HP")){
            
            this.preco *= 1.3;
        }
        else if (this.marca.equals("IBM")){
            
            this.preco *= 1.5;
        }
    }
    
    int alteraValor(double valor){
        
        if (valor > 0){
            this.preco = valor;
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
