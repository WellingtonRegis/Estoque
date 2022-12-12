package com.example.estoque;

import java.util.Scanner;

public class MenuPrincipal<Produto> {

    public String menu(Produto produto) {
        int opcao = 4;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das opções a baixo ");
        System.out.println("Estoque = 1");
        System.out.println("Saida/venda = 2");
        System.out.println("Cadastro/entrada =3");
        System.out.println("sair do programa = 4");

        opcao = scan.nextInt();

        if (opcao == 1) {


        }
        else {
            System.out.println("Saindo do programa!");
        }
        return menu(produto);
    }







}
