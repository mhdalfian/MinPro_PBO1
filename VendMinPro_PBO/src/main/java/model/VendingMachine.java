package model;

import java.util.ArrayList;

public class VendingMachine {
    private static ArrayList<Drink> drinks = new ArrayList<>();

    public VendingMachine() {
        drinks.add(new Drink("Coca-Cola", 8000, 10));
        drinks.add(new Drink("Pepsi", 8000, 8));
        drinks.add(new Drink("Fanta", 7000, 5));
        drinks.add(new Drink("Sprite", 9000, 20));
        drinks.add(new Drink("Aqua", 3000, 20));
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        System.out.println("Minuman berhasil ditambahkan.");
    }

    public void removeDrink(int index) {
        if (index >= 0 && index < drinks.size()) {
            drinks.remove(index);
            System.out.println("Minuman berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void updateDrink(int index, String name, double price, int stock) {
        if (index >= 0 && index < drinks.size()) {
            Drink drink = drinks.get(index);
            drink.setName(name);
            drink.setPrice(price);
            drink.setStock(stock);
            System.out.println("Minuman berhasil diupdate.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void showDrinks() {
        if (drinks.isEmpty()) {
            System.out.println("Tidak ada minuman tersedia.");
        } else {
            System.out.println("Daftar Minuman di Vending Machine:");
            for (Drink drink : drinks) {
                System.out.println(drink);
            }
        }
    }
}
