package org.example.n1exercici1;


import org.example.n1exercici1.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sales {
    private final ArrayList<Product> products;
    private double totalPrice;

    public Sales() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public Sales(ArrayList<Product> products) {
        this.products = products;
        totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            for (int i = 0; i < products.size(); i++) {
                totalPrice += products.get(i).getPrice();
            }
        }
    }

    public void causeError() throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
    }


    @Override
    public String toString() {
        return "Sales{" +
                "products = " + products +
                ", totalPrice = " + totalPrice +
                '}';
    }
}
