package fatec_desafio01;

import java.util.ArrayList;

public class Estatistica {
    
    ArrayList<Pessoa> pessoas = new ArrayList();
    
    //Construtores
    public Estatistica(){
        
    }
    
    //Métodos
    public void addPessoa(Pessoa p){
        
        if (p != null){
            
            pessoas.add(p);
        }
    }
    
    public int calcMaiorIdade(){
        
        int maior = 0;
        
        for (Pessoa p : pessoas){
            
            if (p.idade != -1){
                
                if (p.idade > maior){
                
                maior = p.idade;
                
                }
                
            }
        }
        
        return maior;
        
    }
    
    public float calcPorcentFem(){
        
        float porcent;
        int qtd = 0;
        int total = 0;
        
        for (Pessoa p : pessoas){
            
            if (p.getIdade() > -1){
                
                if (p.getSexo().equals("F") && p.getIdade() > 18 && p.getIdade() < 35 && p.getCabelo().equals("Loiros") && p.getOlho().equals("Verdes")){
                    
                    qtd++;
                }
                total++;
            }
            
        }

        porcent = (float)qtd / (float)total;
        
        return porcent;
    }
}
