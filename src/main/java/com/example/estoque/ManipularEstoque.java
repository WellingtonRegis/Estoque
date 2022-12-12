package com.example.estoque;

public class ManipularEstoque {

    public Integer checarEstoque(Produto produto){
        System.out.println("Checandoo estoque");

        Integer checar = produto.getQuantidade();
        System.out.println(checar);
        return checar ;
    }


    public String verificarProduto(Produto produto){

        String nomeDoProduto = produto.getNomeDoProduto();
        System.out.println("O produto é: " + nomeDoProduto);
        return nomeDoProduto;
    }

    public String verificarCategoria(Produto produto){

        String categoriaDoProduto = produto.getCategoria();
        System.out.println("A categoria é: " + categoriaDoProduto);
        return categoriaDoProduto;
    }






}
