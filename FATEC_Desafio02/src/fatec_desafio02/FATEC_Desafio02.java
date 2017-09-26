package fatec_desafio02;

public class FATEC_Desafio02 {

    public static void main(String[] args) {
        
        //Definindo Contas e Clientes
        Cliente c1 = new Cliente(1, "Maria");
        c1.setSaldoMedio(250.00);
        Cliente c2 = new Cliente(2, "Jose");
        c2.setSaldoMedio(150.00);
        Cliente c3 = new Cliente(3, "Lucas");
        c3.setSaldoMedio(400.00);
        Cliente c4 = new Cliente(4, "Creusa");
        c4.setSaldoMedio(410.00);
        Cliente c5 = new Cliente(5, "Tadeu");
        c5.setSaldoMedio(650.00);
        
        //Instanciando Classe Banco
        Banco banco = new Banco();
        
        //Adicionando os Clientes
        banco.addCliente(c1);
        banco.addCliente(c2);
        banco.addCliente(c3);
        banco.addCliente(c4);
        banco.addCliente(c5);
        
        //Testando Crédito
        System.out.println(banco.VerificaCredito());
    }
    
}
