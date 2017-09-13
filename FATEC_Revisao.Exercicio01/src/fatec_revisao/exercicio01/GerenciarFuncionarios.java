package fatec_revisao.exercicio01;

/**
 * @author Mazurco066
 */
public class GerenciarFuncionarios {
    
    //Atributos
    public static int posicao = 0;
    public static final int TAM = 3;
    
    public static void main(String args[]){
        
        Funcionario f1 = new Funcionario();
        f1.setIdFunc(1);
        f1.setNomeFunc("Juvenilson");
        f1.setDepto("Compras");
        f1.setDocumento("6966966966");
        f1.setSalario(890.00);
        f1.setDataContratacao("13/09/2017");
        f1.atualizaSalario(100.00);
        
        Funcionario f2 = new Funcionario();
        f2.setIdFunc(2);
        f2.setNomeFunc("Gilda Ferreira");
        f2.setDepto("Vendas");
        f2.setDocumento("1234567899");
        f2.setSalario(670.00);
        f2.setDataContratacao("13/09/2017");
        f2.atualizaSalario(100.00);
        
        Funcionario f3 = new Funcionario();
        f3.setIdFunc(3);
        f3.setNomeFunc("Maria Fernanda");
        f3.setDepto("Administrativo");
        f3.setDocumento("9876543211");
        f3.setSalario(789.00);
        f3.setDataContratacao("13/09/2017");
        f3.atualizaSalario(100.00);
        
        //Instanciando um objeto do tipo empresa
        Empresa emp = new Empresa(TAM);
        
        //Regitrando funcionários
        emp.adicionarFunc(f1, posicao);
        posicao++;
        emp.adicionarFunc(f2, posicao);
        posicao++;
        emp.adicionarFunc(f3, posicao);
        posicao++;
        
        System.out.println(emp.mostrarFuncionarios());
     
        //Testando método contem funcionário
        boolean T= emp.contemFuncionario(f3);
        
        if (T){
            System.out.println("Funcionário pertence a empresa!");
        }
        else{
            System.out.println("Funcionário não pertence a empresa!");
        }
    }
    
}
