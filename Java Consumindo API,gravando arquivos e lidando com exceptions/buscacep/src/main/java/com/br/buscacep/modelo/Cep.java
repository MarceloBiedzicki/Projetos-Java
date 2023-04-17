package com.br.buscacep.modelo;

public class Cep {
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;

    public Cep(CepFromJson cep){
        this.bairro = cep.bairro();
        this.uf = cep.uf();
        this.cidade = cep.localidade();
        this.rua = cep.logradouro();
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.cidade = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Estado: " + uf + ".\n" + "Cidade: " + cidade + ".\n"
                + "Bairro: " + bairro + ".\n" + "Rua: " + rua + ".\n";
    }
}
