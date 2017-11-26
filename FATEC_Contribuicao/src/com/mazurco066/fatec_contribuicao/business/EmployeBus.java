package com.mazurco066.fatec_contribuicao.business;

import com.mazurco066.fatec_contribuicao.model.Employe;
import java.util.ArrayList;
import java.util.List;

/** @author MAZURCO066 */
public class EmployeBus {
    
    //Atributos
    private final List<Employe> lista;
    
    //Construtor Padrão
    public EmployeBus(){
        
        lista = new ArrayList<>();
    }
    
    //Métodos de Negócio
    public void addEmploye(Employe e){
        
        if (e != null) lista.add(e);
    }
    
    public void removeEmploye(Employe e){
        
        if (e != null) lista.remove(e);
    }
    
    public List<Employe> readAll(){
        
        return lista;
    }
    
    public boolean exists(Employe e){
        
        return lista.contains(e);
    }
    
}
