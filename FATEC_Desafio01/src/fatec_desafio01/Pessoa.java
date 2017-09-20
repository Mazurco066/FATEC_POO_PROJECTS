package fatec_desafio01;

public class Pessoa {
    
    private int id;
    private String Sexo;
    private String cabelo;
    private String olho;
    int idade;
    
    //Construtores
    public Pessoa(){
        
    }
    
    public Pessoa(int ID, String Secsu, String Cab, String Ol, int idade){
        
        this.id = ID;
        this.Sexo = Secsu;
        this.cabelo = Cab;
        this.olho = Ol;
        this.idade = idade;
    }

    //Métodos Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getOlho() {
        return olho;
    }

    public void setOlho(String olho) {
        this.olho = olho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
