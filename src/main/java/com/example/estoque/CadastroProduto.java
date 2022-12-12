package com.example.estoque;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroProduto  {


    public String cadastrarProduto(Produto produto) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do produto");
        System.out.println("digite a descrição do produto");
        System.out.println("digite a categoria do produto");
        System.out.println("digite a quantidade");
        String[] lines = new String[]{scan.next(), scan.next(), scan.next(), scan.next()};
        String path = "wellington:\\Documents\\aut.txt";
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return path;
    }
    public String entradaProduto(Produto produto){
        System.out.println("Vefificando cadastros de produtos ");

        String nomeDoProduto = produto.getNomeDoProduto();
        System.out.println("Qual produto será cadastrado: " + nomeDoProduto);
        return nomeDoProduto;
    }
    public String entradaDescricao(Produto produto){

        String descricaoDoProduto = produto.getDescricaoDoProduto();
        System.out.println("A descrição do produto para o cadastro: " + descricaoDoProduto);
        return descricaoDoProduto;
    }
    public String entradaCategoria(Produto produto){

        String categoriaDoProduto = produto.getCategoria();
        System.out.println("A categoria do produto para cadastro: " + categoriaDoProduto);
        return categoriaDoProduto;
    }
    public Integer entradaEstoque(Produto produto){

        Integer quantidade = produto.getQuantidade();
        System.out.println("Quantidade que esta entrando no estoque: " + quantidade);
        return quantidade;
    }
}
