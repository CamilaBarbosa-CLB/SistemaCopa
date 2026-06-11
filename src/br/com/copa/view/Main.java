package br.com.copa.view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== SISTEMA COPA DO MUNDO =====");
            System.out.println("1 - Cadastrar Seleção");
            System.out.println("2 - Listar Seleções");
            System.out.println("3 - Cadastrar Jogo");
            System.out.println("4 - Listar Jogos");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

            case 1:
                System.out.println("Cadastrar Seleção");
                break;

            case 2:
                System.out.println("Listar Seleções");
                break;

            case 3:
                System.out.println("Cadastrar Jogo");
                break;

            case 4:
                System.out.println("Listar Jogos");
                break;

            case 0:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
