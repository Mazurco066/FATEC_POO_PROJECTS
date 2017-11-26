package com.mazurco066.fatec_contribuicao.model;

import com.mazurco066.fatec_contribuicao.rules.Contribuivel;
import com.mazurco066.fatec_contribuicao.rules.ParametroINSS;

/** @author MAZURCO066 */
public class Employe implements Contribuivel {
    
    //Definindo Atributos
    private int ID;
    private String nome;
    private String setor;
    private double salario;
    private double recinss;
    
    //Construtor Padrão
    public Employe(){
        ID = 0;
        nome = "";
        setor = "";
        salario = 0.0;
        recinss = 0.0;
    }

    //Métodos Getter and Setter
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getRecinss() {
        return recinss;
    }

    public void setRecinss(double recinss) {
        this.recinss = recinss;
    }

    //Implementando Métodos abstratos
    @Override
    public void calcularINSS() {
        
        //Instanciando Objeto para recuperar faixas de contribuição
        for (int i = 0; i < ParametroINSS.LIMITEFAIXA.length; i++){
            
            if (salario < ParametroINSS.LIMITEFAIXA[i]){
                
                recinss = ParametroINSS.FAIXA[i] * salario;
                break;
            }
        }
        
        // If Salário maior que teto
        if (salario > ParametroINSS.LIMITEFAIXA[2]){
            
            recinss = ParametroINSS.TETO * salario;
        }
    }

    //Métodos Equals e Hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        return this.ID == other.ID;
    }
    
}
