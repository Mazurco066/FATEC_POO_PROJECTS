package fatec_revisao.exercicio01;

/**
 * @author Mazurco066
 */
public class Funcionario {
    
    private int idFunc;
    private String nomeFunc;
    private String depto;
    private String dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;
    
    //Construtor padrão
    public Funcionario(){
        
        this.ativo= true;
    }

    //Métodos getter and setter
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    //Métodos de Classe
    
    /**
     * Método de impressão da classe.
     * 
     * @return
     *      - Retorna uma String ja formatada com os dados da classe
     *      já pronta para realizar a impressão.
     */
    @Override
    public String toString(){
        //Constroi e retorna uma string com os dados do objeto
        StringBuilder texto = new StringBuilder();
        texto.append("ID do funcionário: ").append(this.idFunc).append("\n");
        texto.append("Nome do funcionário: ").append(this.nomeFunc).append("\n");
        texto.append("Departamento do funcionário: ").append(this.depto).append("\n");
        texto.append("Documento do funcionário: ").append(this.documento).append("\n");
        texto.append("Data de contratação do funcionário: ").append(this.dataContratacao).append("\n");
        texto.append("Salário do funcionário: ").append(this.salario).append("\n");   
        if (this.ativo){
           texto.append("Situação Atual: ").append("Contratado").append("\n"); 
        }
        else{
            texto.append("Situação Atual: ").append("Demitido").append("\n");
        }
        return texto.toString();
    }
    
    /**
     * Método usado para simular a demissão de um dos funcionários.
     */
    public void demiteFuncionario(){
        //Seta ativo para false
        this.ativo = false;
    }
    
    /**
     * Método usado para atualizar salário de um dos funcionários.
     * 
     * @param valor
     *      - Recebe o valor do aumento de salário do funcionário
     */
    public void atualizaSalario(double valor){
        
        if (valor > 0){
        
            this.salario += valor;
        }
    }
    
}
