package com.example.estoque;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Estoque{



    public String checarEstoque(Produto produto){
        File file = new File("wellington:\\Documents\\aut.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if (scan != null){
                scan.close();
            }
        }
        return checarEstoque(produto);

    }





}
