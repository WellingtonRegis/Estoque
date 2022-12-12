package com.example.estoque;

public class SaidaProduto  {
    private String nomeDoProduto;

    public Integer saidaEstoque(Produto produto){
        System.out.println("Vefificando venda ");

        Integer quantidade = produto.getQuantidade();
        System.out.println("Quantidade que esta vendendo/saindo2: " + quantidade);


        return quantidade;
    }
    public String saidaProduto(Produto produto){

        String nomeDoProduto = produto.getNomeDoProduto();
        System.out.println("O produto a venda é: " + nomeDoProduto);
        return nomeDoProduto;
    }


}
