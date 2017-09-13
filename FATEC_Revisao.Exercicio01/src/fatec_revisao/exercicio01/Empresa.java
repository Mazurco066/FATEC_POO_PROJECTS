package fatec_revisao.exercicio01;

/**
 * @author Mazurco066
 */
public class Empresa {
    
    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Funcionario empregados[];
    
    //Construtor padrão
    public Empresa(int tamanho){
        
        this.empregados = new Funcionario[tamanho];
    }
    
    //Métodos Getter and Setter
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }
    
    //Métodos de Classe
    
    /**
     * Método para adicionarum novo funcionário para empresa.
     * 
     * @param F
     *      - Recebe um objeto do tipo funcionário para inserção
     *      ao vetor de funcionários da empresa.
     * 
     * @param pos
     *      - Recebe a posição atual do vetor. a mesma deve ser
     *      menor que 3 e maior ou igual a 0.
     */
    public void adicionarFunc(Funcionario F, int pos){
        
        if (pos >= 0 && pos < 3){
            
            this.empregados[pos] = F;
            System.out.println(F.getNomeFunc() + "Foi Registrado com Sucesso!");
        }
        else{
            
            System.out.println("Indice Inválido");
        }
        
    }
    
    /**
     * Método de impressão da classe.
     * 
     * @return 
     *      - Retorna uma strng formatada com os dados de cada 
     *      um dos funcionários registrados no vetor de funcionários
     *      desta empresa.
     */
    public String mostrarFuncionarios(){
        //Método para retornar dados sobre cada funcionário dessa empresa
        StringBuilder texto = new StringBuilder();
        for(Funcionario f: empregados){
            
            if (f != null){
                texto.append("------------------------------------------------\n");
                texto.append(f.toString());
            }
        }
        
        return texto.toString();
    }
    
    /**
     * Método de busca de um funcionário especifico no array de funcionários.
     * 
     * @param F
     *      - Recebe um objeto do tipo funcionário para a realização da busca
     * 
     * @return
     *      - Retorna true se encontrou funcionário e false se não encontrouu
     */
    public boolean contemFuncionario(Funcionario F){
        
        for(Funcionario f: empregados){
            
            if (f != null){
                
                if (f.getIdFunc() == F.getIdFunc()){
                    
                    return true;
                }
            }
        }
        return false;
    }
    
}
