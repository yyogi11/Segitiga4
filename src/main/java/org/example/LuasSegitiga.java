package org.example;
import java.util.Scanner;

/**
 * Program sederhana untuk menghitung luas segitiga berdasarkan panjang alas dan tingginya.
 */
public class LuasSegitiga {

    /**
     * Metode utama untuk menghitung luas segitiga.
     *
     * @param args Argumen baris perintah. Tidak digunakan dalam program ini.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alas, tinggi;
        System.out.println("selamat pecah");
        System.out.print("Masukkan panjang alas segitiga: ");
        alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = scanner.nextDouble();

        double luas = (alas * tinggi) / 2;

        System.out.println("Luas segitiga adalah: " + luas);
    }
}