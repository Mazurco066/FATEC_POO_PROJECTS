package fatec_prjlivraria;

import Bean.Livro;
import Bean.CD;
import Bean.DVD;
import java.util.Scanner;

/** @author Mazurco066 */

public class prjLivraria {

    public static void main(String[] args) {
        
        //Instanciando objeto do tipo Scanner para entrada de dados 
        Scanner sc = new Scanner(System.in);
        
        //Criando um Livro
        Livro livro = new Livro();
        livro.setDescricao("Criei um livro uau");
        livro.setEdicao("N. 1");
        livro.setAutor("Jailson Mendes");
        livro.setEditora("OcoBooks");
        livro.setGenero("Programação");
        livro.setEstoqueDisponivel(10);
        livro.setPrecoCusto(23.50);
        
        //Criando um DVD
        DVD dvd = new DVD();
        dvd.setDescricao("Criei um DVD uau");
        dvd.setCensura("14 anos");
        dvd.setDiretor("Paulo Guina");
        dvd.setDuracao("120 minutos");
        dvd.setEstoqueDisponivel(5);
        dvd.setGenero("Drama");
        dvd.setPrecoCusto(68.98);
        
        //Criando um CD
        CD cd = new CD();
        cd.setDescricao("Criei um CD uau");
        cd.setGravadora("OcoStudios");
        cd.setPaisOrigem("Brasil");
        cd.setArtista("Jailson Mendes & Paulo Guina");
        cd.setEstoqueDisponivel(5);
        cd.setGenero("MPB");
        cd.setPrecoCusto(14.99);
        
        //Menu de Escolhas
        int opc = 0;
        while (opc != 7){
            System.out.println("Escolha Opção: ");
            System.out.println("1--> Comprar mais exemplares de livro");
            System.out.println("2--> Vender exemplares de Livro");
            System.out.println("3--> Comprar mais um título de DVD");
            System.out.println("4--> Vender um título de DVD");
            System.out.println("5--> Comprar CD");
            System.out.println("6--> Vender CD");
            System.out.println("7--> Sair");
            opc = sc.nextInt();
            
            switch (opc){
                
                case 1:
                    System.out.println("Quantidade a se comprar do livro..: " + livro.getDescricao());
                    livro.comprar(sc.nextInt());
                    break;
                    
                case 2:
                    System.out.println("Quantidade a se vender do livro..: " + livro.getDescricao());
                    livro.vender(sc.nextInt());
                    break;
                    
                case 3:
                    System.out.println("Quantidade a se comprar do DVD..: " + dvd.getDescricao());
                    dvd.comprar(sc.nextInt());
                    break;
                    
                case 4:
                    System.out.println("Quantidade a se vender do DVD..: " + dvd.getDescricao());
                    dvd.vender(sc.nextInt());
                    break;
                    
                case 5:
                    System.out.println("Quantidade a se comprar do CD..: " + cd.getDescricao());
                    cd.comprar(sc.nextInt());
                    break;
                    
                case 6:
                    System.out.println("Quantidade a se vender do CD..: " + cd.getDescricao());
                    cd.vender(sc.nextInt());
                    break;
                
                case 7:
                    break;
                    
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        
        System.out.println();
        System.out.println("DADOS DOS PRODUTOS CADASTRADOS....");
        System.out.println(livro.listarProduto());
        System.out.println(dvd.listarProduto());
        System.out.println(cd.listarProduto());
    }
    
}
