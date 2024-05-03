package org.example;

import org.example.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Product product = new Product("Pantalon", 23.9);
        Product product1 = new Product("Camiseta", 11.9);
        Product product2 = new Product("Chaqueta", 20.9);

        ArrayList<Product> products = new ArrayList<>();

        products.add(product);
        products.add(product1);
        products.add(product2);

        Sales sales = new Sales(products);
        Sales emptySales = new Sales();

        try {
            emptySales.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

       try {
           sales.causeError();
       } catch (RuntimeException e){
           System.out.println("Provocando error ArrayIndexOutOfBoundsException");
       }
    }
}