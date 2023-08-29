package SuporteTecnico;

import java.util.Scanner;

public class CallCenter {
    public static void main (String[] args){
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora();
        Scanner input = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        String problema;

        System.out.println("Bem-vindo ao suporte técnico");
        System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
        String sair = opcao.nextLine();
        while(!(sair.equals("sair"))){
            System.out.println("Digite o seu problema.");
            problema = input.nextLine();
            System.out.println(suporte.pesquisaSolucao(interpretadora.separarPalavras(problema)));
            System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
            sair = opcao.nextLine();
        }
        System.out.println("Obrigado por utilizar o programa.");
    }
}
