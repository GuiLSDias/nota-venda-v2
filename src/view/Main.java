package view;

import model.Sale;

public class Main {
    public static void main(String[] args) {
            Sale sale = new Sale();

            sale.addProduct("Arroz", 30, 2);
            sale.addProduct("Feijao", 20, 1);
            sale.addProduct("Pasta", 15, 6);

            sale.getItems().forEach(System.out::println);
            System.out.println("Total: " + sale.getTotal());
        }
}