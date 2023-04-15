package br.com.listadecompras.model;

public class CartaoDeCredito {
    private double limite;
    private double total;

    public CartaoDeCredito(double limite){
        this.limite = limite;
    }
    public void compra(double valor){
        limite -= valor;
        total += valor;
    }

    public double getLimite() {
        return limite;
    }

    public double getTotal() {
        return total;
    }
}
