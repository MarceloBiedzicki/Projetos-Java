package com.br.buscacep.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonLeitura {


    public void leia(File arquivo) throws FileNotFoundException {
        Scanner scanJson = new Scanner(arquivo);
        while (scanJson.hasNextLine()) {
            String linha = scanJson.nextLine();
            System.out.println(linha);
        }
    }
}
