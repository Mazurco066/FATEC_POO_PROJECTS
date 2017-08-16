package model.bean;

public class Acampamento {
    
    private String nome;
    private char equipe;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void imprimir(){
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Equipe: " + this.equipe);
        System.out.println("Idade: " + this.idade);
    }
    
    public void separarGrupo(){
        
        if (this.idade >= 6 && this.idade <= 10){
            
            this.equipe = 'A';
        }
        else if(this.idade >= 11 && this.idade <=20){
            
            this.equipe = 'B';
        }
        else if(this.idade > 20){
            
            this.equipe = 'C';
        }
        else{
            
            System.out.println("Dados Inválidos. . Não foi possivel atribuir a equipe!");
        }
        
    }
    
}
