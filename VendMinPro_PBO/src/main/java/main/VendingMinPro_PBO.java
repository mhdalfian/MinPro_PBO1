/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import model.Drink;
import model.VendingMachine;
import java.util.Scanner;


/**
 *
 * @author ideapadGAMING
 */
public class VendingMinPro_PBO {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("== Vending Machine Minuman Sederhana ==");
            System.out.println("1. Tampilkan Minuman");
            System.out.println("2. Tambah Minuman");
            System.out.println("3. Hapus Minuman");
            System.out.println("4. Update Minuman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    vendingMachine.showDrinks();
                    break;
                case 2:
                    System.out.print("Masukkan nama minuman: ");
                    String name = scanner.next();
                    System.out.print("Masukkan harga minuman: ");
                    double price = scanner.nextDouble();
                    System.out.print("Masukkan stok minuman: ");
                    int stock = scanner.nextInt();
                    vendingMachine.addDrink(new Drink(name, price, stock));
                    break;
                case 3:
                    System.out.print("Masukkan index minuman yang ingin dihapus: ");
                    int indexToRemove = scanner.nextInt();
                    vendingMachine.removeDrink(indexToRemove);
                    break;
                case 4:
                    System.out.print("Masukkan index minuman yang ingin diupdate: ");
                    int indexToUpdate = scanner.nextInt();
                    System.out.print("Masukkan nama baru: ");
                    String newName = scanner.next();
                    System.out.print("Masukkan harga baru: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Masukkan stok baru: ");
                    int newStock = scanner.nextInt();
                    vendingMachine.updateDrink(indexToUpdate, newName, newPrice, newStock);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Vending Machine.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}