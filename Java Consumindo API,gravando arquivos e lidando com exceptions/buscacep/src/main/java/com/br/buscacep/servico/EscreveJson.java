package com.br.buscacep.servico;

import com.br.buscacep.modelo.Cep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreveJson {

    public static File escreveJson(ArrayList<Cep> ceps) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        File arquivo = new File("Ceps.json");
        FileWriter escreveJson = new FileWriter(arquivo);
        escreveJson .write(gson.toJson(ceps));
        escreveJson.close();
        return arquivo;
    }
}
