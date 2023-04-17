package com.br.buscacep.main;

import com.br.buscacep.modelo.Cep;
import com.br.buscacep.servico.EscreveJson;
import com.br.buscacep.servico.JsonLeitura;
import com.br.buscacep.servico.ServicoCep;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Cep> ceps = new ArrayList<>();
        int i = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite o Cep que gostaria de buscar ou \"Sair\" para sair.");
            String busca = scan.next();
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            if (ServicoCep.getJson(busca) != null) {
                Cep cep = new Cep(ServicoCep.getJson(busca));
                ceps.add(cep);
            } else {
                System.out.println("Você digitou um endereço inválido.");
            }
            System.out.println(ceps.get(i));
            i++;

        } while (true);

        File jsonCep = EscreveJson.escreveJson(ceps);

        System.out.println("Sua busca gerou um arquivo.json, Gostaria de lê-lo?   Sim/Nao");
        String opcao = scan.next();

        if (opcao.equalsIgnoreCase("sim")) {

            JsonLeitura leitor = new JsonLeitura();
            leitor.leia(jsonCep);
            System.out.println("""
                    
                    Obrigado por usar o BuscaCep.
                    
                    """);
        } else {
            System.out.println("Obrigado por usar o BuscaCep.");
        }
    }
}
