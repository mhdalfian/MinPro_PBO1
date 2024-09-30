# Dokumentasi MinPro PBO Tema Vending Machine Sederhana

## Nama: Muhammad Alfian Adien  
## NIM 2309116034 Sistem Informasi A'23

# Deskripsi Program 
Vending Machine Minuman Sederhana adalah sebuah program simulasi mesin penjual otomatis yang memungkinkan pengguna untuk melihat daftar minuman, menambah minuman baru, menghapus minuman yang ada, serta memperbarui informasi minuman seperti nama, harga, dan stok. Program ini ditulis dalam bahasa pemrograman Java dengan konsep CRUD (Create, Read, Update, Delete) yang diimplementasikan melalui dua kelas utama dan menggunakan struktur ArrayList untuk menyimpan data minuman.

# Fitur
- Tampilkan Daftar Minuman (Read): Menampilkan semua minuman yang tersedia di vending machine beserta harga dan stoknya.
- Tambah Minuman (Create): Menambahkan minuman baru ke dalam vending machine dengan memasukkan nama, harga, dan stok.
- Hapus Minuman (Delete): Menghapus minuman dari vending machine berdasarkan index yang dimasukkan oleh pengguna.
- Update Minuman (Update): Memperbarui informasi minuman seperti nama, harga, dan stok berdasarkan index.
- Validasi Input: Menangani kesalahan input seperti index yang tidak valid atau pilihan menu yang salah.

### Class
Program ini memiliki dua class utama:

1. Drink
   - Deskripsi: Kelas ini merepresentasikan entitas minuman dalam vending machine. Setiap minuman memiliki atribut nama, harga, dan stok.
   - Properties:
     - name: Nama minuman.
     - price: Harga minuman.
     - stock: Jumlah stok minuman yang tersedia.
   - Method:
     - toString: Mengembalikan informasi lengkap tentang minuman dalam format teks.
     - Getters dan Setters untuk properti nama, harga, dan stok.
   - Constructor: Menginisialisasi objek Drink dengan nama, harga, dan stok yang diberikan.

2. VendingMachine
   - Deskripsi: Kelas ini mengelola operasi CRUD terhadap daftar minuman. Menggunakan struktur data ArrayList untuk menyimpan objek Drink.
   - Properties:
     - drinks: ArrayList static yang menyimpan objek Drink.
   - Method:
     - addDrink: Menambahkan minuman baru ke dalam daftar.
     - removeDrink: Menghapus minuman dari daftar berdasarkan index.
     - updateDrink: Memperbarui informasi minuman di posisi tertentu.
     - showDrinks: Menampilkan semua minuman yang ada dalam vending machine.
   - Constructor: Menambahkan beberapa minuman default ketika vending machine dibuat.

### Package
Program ini dibagi ke dalam dua package:

1. main
   - Package ini berisi kelas utama VendingMachineApp, yang merupakan entry point dari program. Di sini pengguna dapat berinteraksi dengan vending machine melalui terminal/console.
   - Class: 
     - VendingMachineApp: Mengelola logika interaksi dengan pengguna, menampilkan menu, serta menangani input pengguna untuk melakukan operasi CRUD pada daftar minuman.

2. model
   - Package ini berisi model data untuk aplikasi, yaitu kelas Drink dan VendingMachine.
   - Class:
     - Drink: Merepresentasikan minuman dalam vending machine.
     - VendingMachine: Mengelola daftar minuman dan menyediakan fitur CRUD untuk objek Drink.
# Alur Output Program

1. Program dimulai dengan menampilkan Menu awal program Vending Machine sederhana yang terdiri dari CRUD(Create, Read, Update, Delete). Jika kita memilih menu 1. Tampilkan Minuman maka akan menampilkan beberapa Nama minuman, harga, dan stok yang tersedia.

Berikut outputnya
![Screenshot 2024-09-30 084002](https://github.com/user-attachments/assets/3cd9e953-1292-43a6-b982-1b075785863b)

2. Jika kita mmemilih menu 2. Tambah Minuman, program akan bertanya Nama minuman baru, harga minuman baru, dan stok minuman baru, dan jika berhasil maka akan keluar output "Minuman berhasil ditambahkan."
   
Berikut gambar output nya
![Screenshot 2024-09-30 084212](https://github.com/user-attachments/assets/183f4a41-95e1-4490-aacb-2b0669020a46)

Berikut gambar output yang menampilkan minuman barunya
![Screenshot 2024-09-30 084236](https://github.com/user-attachments/assets/499ca98b-e30a-4f1b-bb42-41bad4777e91)

3.  Pada Menu 3. Hapus Minuman, pengguna ditanya index berapa yang ingin dihapus, jika berhasil maka akan mengeluarkan output "Minuman berhasil dihapus."

![Screenshot 2024-09-30 084510](https://github.com/user-attachments/assets/e04e466a-7511-435d-913d-7bac4cb82e35)

4. Selanjutnya yaitu opsi menu 4. Update Minuman. Pengguna akan ditanya Minuman dengan index berapa yang ingin diperbarui, nama baru, harga baru, dan stok baru. Jika berhasil akan menampilkan output "Minuman berhasil diupdate."

Berikut gambar outputnya
![Screenshot 2024-09-30 085039](https://github.com/user-attachments/assets/0b1a15ba-2e69-4e43-99ed-ff54242a595b)

Berikut gambar yang menampilkan minuman yang sudah diupdate
![Screenshot 2024-09-30 085148](https://github.com/user-attachments/assets/364f7008-6e4b-4e33-9e17-4b473cdc8240)

5. Terakhir, opsi menu 5. Keluar. Ini akan menghentikan program.

Berikut gambar outputnya
![Screenshot 2024-09-30 085236](https://github.com/user-attachments/assets/ab97e635-4d99-49f2-97da-a6c05f0a45af)

 
