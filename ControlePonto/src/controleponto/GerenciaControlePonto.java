package controleponto;

/** @author Mazurco066 */
public class GerenciaControlePonto {

    public static void main(String[] args) throws InterruptedException {
        
        //Instanciando o controlador de pontos
        ControlePonto cp = new ControlePonto();
        
        //Instanciando os funcionários
        Gerente g = new Gerente();
        g.setIdFunc(1);
        g.setNome("juvenilson");
        g.setEmail("juvenilson@gmail.com");
        g.setDocumento("123456789");
        g.setLogin("juvs");
        g.setSenha("123456");
        
        Operador o = new Operador();
        o.setIdFunc(2);
        o.setNome("Josevaldo");
        o.setEmail("josevaldo@gmail.com");
        o.setDocumento("987654321");
        o.setValorHora(5000);
        
        Secretaria s = new Secretaria();
        s.setIdFunc(3);
        s.setNome("Claudinha");
        s.setEmail("claudia@gmail.com");
        s.setDocumento("123459876");
        s.setRamal("4567");
        s.setTelefone("12347658");
        
        //Instanciando os registros de ponto
        RegistroPonto gerente = new RegistroPonto();
        gerente.setFunc(g);
        
        RegistroPonto operador = new RegistroPonto();
        operador.setFunc(o);
        
        RegistroPonto secretaria = new RegistroPonto();
        secretaria.setFunc(s);
        
        //Registrando Entradas
        System.out.println(cp.registraEntrada(gerente));
        Thread.sleep(2000);
        
        System.out.println(cp.registraEntrada(operador));
        Thread.sleep(2000);
        
        System.out.println(cp.registraEntrada(secretaria));
        Thread.sleep(2000);
        
        //Registrando Saídas
        System.out.println(cp.registraSaida(gerente));
        Thread.sleep(2000);
        
        System.out.println(cp.registraSaida(operador));
        Thread.sleep(2000);
        
        System.out.println(cp.registraSaida(secretaria));
        Thread.sleep(2000);
        
    }
    
}
