/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Pythagoras {
    double angka;
    
    Scanner data = new Scanner(System.in);
   
    
    void input(){
        System.out.print("Pilih menu (Masukkan angka) : ");
        
        int menu = data.nextInt();
        
        switch(menu){
            case 1:
                System.out.print("Masukkan sisi a: ");
                int a1 = data.nextInt();
                
                System.out.print("Masukkan sisi b: ");
                int b1 = data.nextInt();
                
                System.out.print("Masukkan sisi c: ");
                int c1 = data.nextInt();
                
                double c = Math.sqrt(Math.pow(a1,2) + Math.pow(b1,2));
                
                if (c1 == c){
                    System.out.println("Angka-angka tersebut merupakan pythagoras");
                } else {
                    System.out.println("Angka-angka tersebut bukan merupakan pythagoras");
                }
                
                break;
            case 2:
                System.out.print("Masukkan sisi a: ");
                int a2 = data.nextInt();
                
                System.out.print("Masukkan sisi b: ");
                int b2 = data.nextInt();
                
                double c2 = Math.sqrt(Math.pow(a2,2) + Math.pow(b2,2));
                System.out.println(c2);
                break;
            case 3:
                System.out.print("Masukkan sisi a: ");
                int a3 = data.nextInt();
                
                System.out.print("Masukkan sisi c: ");
                int c3 = data.nextInt();
                
                double b3 = Math.sqrt(Math.pow(c3,2) - Math.pow(a3,2));
                System.out.println(b3);
                break;
            case 4:
                System.out.println("Exit...");
                System.exit(0);
        }
    }
}
