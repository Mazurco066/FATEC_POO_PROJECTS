package br.edu.fatecmm.sisacad.business;

import br.edu.fatecmm.sisacad.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/** @author Mazurco066 */
public class AlunoBus {
    
    //Atributos
    private final List<Aluno> lista;
    
    //Método Construtor
    public AlunoBus(){
        
        //Inicializando a lista
        this.lista = new ArrayList();
    }
    
    //Métodos Getter e Setter
    public List<Aluno> getLista() {
        return lista;
    }
    
    //Métodos de Negócio
    public void adicionarAluno(Aluno aluno){
     
        this.lista.add(aluno);
    }

}
