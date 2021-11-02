/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class TebakAngka {
    int angka;
    int tebak;
    int i;
        
    void tebak(){    
        angka = (int)(Math.random() * 100);
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        Scanner masukan = new Scanner(System.in);
        
        i = 0;
        do {
            i ++;
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();
            
            if (tebak > angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if (tebak < angka) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.print("Yeeee… Bilangan tebakan anda BENAR :-)");
            }
        } while (tebak != angka);
    
    }
        
}
