
package fatec_prjesfera;

/**
 * @author Mazurco066
 */
public class Esfera {
   
    //Atributos de Classe
    double raio;
    double diametro;
    
    //Construtores
    public Esfera(){
        //Padrão
    }
    
    public Esfera(double Raio){
        
        this.raio = Raio;
    }
    
    public Esfera(double Raio, double Diametro){
        
        this.raio = Raio;
        this.diametro = Diametro;
    }
    
    //Metodos Getter and Setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    //Métodos de Classe
    public double calcularArea(){
        
        return Math.PI * Math.pow(raio, (double)2);
    }
    
    public double calcularVolume(){
        
        return (4 * (Math.PI * Math.pow(raio, (double)3)))/3;
    }
    
    
}
