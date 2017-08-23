package model.bean;

/**
 * @author Mazurco066
 */
public class Funcionario {
    
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;
    
    //Construtor padrão
    public Funcionario(){
        //Padrão não inicializara nada
    }
    
    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
    
    //Métodos de Classe
    public void bonificar(double aumento){
        this.salario += aumento;
    }
    
    public void show(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("RG: " + rg);
        if (estaNaEmpresa){
            
            System.out.println("Esta na Empresa!");
        }
        else{
            
            System.out.println("Não esta na Empresa!");
        }
    }
    
}
