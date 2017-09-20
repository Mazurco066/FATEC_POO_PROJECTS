package fatec_desafio01;

public class Desafio01 {

    public static void main(String[] args) {
        
        //Definindo Pessoas.
        Pessoa p1 = new Pessoa(1, "M", "Pretos", "Azuis", 24);
        Pessoa p2 = new Pessoa(2, "F", "Loiros", "Verdes", 27);
        Pessoa p3 = new Pessoa(3, "F", "Loiros", "Verdes", 29);
        Pessoa p4 = new Pessoa(4, "F", "Castanhos", "Castanhos", 11);
        Pessoa p5 = new Pessoa(5, "M", "Castanhos", "Verdes", 19);
        Pessoa p6 = new Pessoa(6, "M", "Pretos", "Castanhos", 24);
        Pessoa p7 = new Pessoa(7, "M", "Loiros", "Verdes", 23);
        Pessoa p8 = new Pessoa(8, "M", "Pretos", "Castanhos", 46);
        Pessoa p9 = new Pessoa(9, "M", "Pretos", "Azuis", 22);
        Pessoa p10 = new Pessoa(10, "M", "Loiros", "Verdes", 50);
        Pessoa p11 = new Pessoa(12, "F", "Loiros", "Verdes", 29);
        Pessoa p12 = new Pessoa();
        p12.setIdade(-1);
        
        //Definindo Classe de Calculos Estatisticos
        Estatistica E = new Estatistica();
        
        //Colocando as pessoas na lista
        E.addPessoa(p1);
        E.addPessoa(p2);
        E.addPessoa(p3);
        E.addPessoa(p4);
        E.addPessoa(p5);
        E.addPessoa(p6);
        E.addPessoa(p7);
        E.addPessoa(p8);
        E.addPessoa(p9);
        E.addPessoa(p10);
        E.addPessoa(p11);
        E.addPessoa(p12);
        
        //Imprimindo Resultado das pesquisas
        System.out.println("Maior Idade entre a população: " + E.calcMaiorIdade());
        System.out.println("Porcentagem de Mulheres entre 18 e 35 com cabelos Loiros e Olhos Verdes é de: " + E.calcPorcentFem()*100 + "%");
    }
    
}
