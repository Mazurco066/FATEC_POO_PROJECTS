package model.bean;

import java.util.Random;

public class Tabuleiro {
    
    //Atributos de classe
    private int tabuleiro[][];
    private int tamanho;
    
    //Construtores
    public Tabuleiro(int Tamanho){
        
        this.tamanho = Tamanho;
        this.tabuleiro = new int[Tamanho][Tamanho];
        
    }
    
    //Métodos Getter and Setter
    public int[][] getTabuleiro() {
        
        return tabuleiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        
        this.tabuleiro = tabuleiro;
    }
    
    //Métodos de Classe
    public void sortearTabuleiro(){
        
        Random sorteio = new Random();
        
        for (int i = 0; i < tamanho; i++){
            
            for (int j = 0; j < tamanho; j++){
                
                this.tabuleiro[i][j] = sorteio.nextInt(101);
                
            }
            
        }
        
    }
    
    public float verificaAcerto(int a, int b){
        
        float retorno;
        int cont = 0;
        
        for (int i = 0; i < tamanho; i++){
            
            for (int j = 0; j < tamanho; j++){
            
                if(this.tabuleiro[i][j] == a || this.tabuleiro[i][j] == b){
                    
                    cont++;
                }
            }
                        
        }
        retorno = cont * 1000;
        return retorno;
    }
    
    @Override
    public String toString(){
        
        StringBuilder texto = new StringBuilder();
        texto.append("\t\t\t\t\tTABULEIRO\n");
        for (int i = 0; i < tamanho; i++){
            
            for (int j = 0; j < tamanho; j++){
                
                texto.append("\t").append(this.tabuleiro[i][j]);
                
            }
            
            texto.append("\n");
            
        }
        return texto.toString();
    }
    
}
