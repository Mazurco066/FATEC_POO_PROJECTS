package fatec_prjesfera;

import java.util.Scanner;

public class ProjetoEsfera {

    public static void main(String[] args) {
        
        //Instanciando Objetos
        Scanner sc = new Scanner(System.in);
        Esfera E = new Esfera();
        
        //Colhendo Dados do usuário
        System.out.print("Entre com o valor do raio para ser calculado: ");
        E.setRaio(sc.nextDouble());
        
        //Retornando dados para usuário
        System.out.println("O Volume da Esfera Especificada é de: " + E.calcularVolume());
        System.out.println("A Área da Esfera Especificada é de: " + E.calcularArea());
    }
    
}
