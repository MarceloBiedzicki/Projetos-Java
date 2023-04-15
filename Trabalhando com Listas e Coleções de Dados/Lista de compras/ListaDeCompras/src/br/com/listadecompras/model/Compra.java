package br.com.listadecompras.model;

public class Compra implements Comparable<Compra>{
    private String item;
    private double valor;

    public Compra(String item,double valor){
        this.item = item;
        this.valor = valor;
    }

    @Override
    public int compareTo(Compra compra) {
        return Double.compare(this.valor,compra.valor);
    }

    @Override
    public String toString() {
        return String.format("Item: %s |         Valor: %.2f",item,valor);
    }
}
