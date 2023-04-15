package br.com.listadecompras.main;

import br.com.listadecompras.model.CartaoDeCredito;
import br.com.listadecompras.model.Compra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scan.nextDouble();
        scan.nextLine();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        boolean entradaValida;
        int i = 0;
        List<Compra> compras = new ArrayList<>();

        do{
            entradaValida = false;
            System.out.printf("Limite disponivel: %.2f R$%n",cartao.getLimite());
            System.out.println("Digite a descrição do item ");
            String item = scan.nextLine();
            System.out.println("Qual o valor de " + item + ".");
            double valor = scan.nextDouble();

            if(valor <= cartao.getLimite()){
                cartao.compra(valor);
                Compra compra = new Compra(item,valor);
                compras.add(compra);
            }else {
                System.out.println("Limite do cartão excedido, termine a compra ou tente comprar outro item.");
            }

            while (!entradaValida) {
                try {
                    System.out.println("Digite 1 para continuar ou 0 para sair.");
                    i = scan.nextInt();
                    scan.nextLine();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida, use 1 para continuar ou 0 para sair.");
                    scan.nextLine();
                }
            }
        }while ( i == 1);
        System.out.println("""
                **-----------------------**
                Abaixo sua lista de compras
                **-----------------------**
                """);
        compras.sort(Compra::compareTo);
        compras.forEach(System.out::println);
        System.out.println("     -----------------------------------------------     ");
        System.out.println("O total da compra foi de: " + cartao.getTotal() + " reais.");
    }
}
