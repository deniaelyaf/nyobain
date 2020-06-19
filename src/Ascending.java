/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author deniaelyaf
 */
public class Ascending {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Angka Pertama");
        a = input.nextInt();
        System.out.println("Masukan Angka Kedua");
        b = input.nextInt();
        System.out.println("Masukan Angka Ketiga");
        c = input.nextInt();
        System.out.println(a+" | "+b+" | "+c);
        
        if (a > b){
            d = a;
            a = b;
            b = d;
        System.out.println(a+" | "+b+" | "+c);
        }
        else if (a > c){
            d = a;
            a = c;
            c = d;
        System.out.println(a+" | "+b+" | "+c);
        }
        if (b > c){
            d = b;
            b = c;
            c = d;
        System.out.println(a+" | "+b+" | "+c);    
        }
        System.out.println ("Hasil Pengurutan Angka");
        System.out.println(a+" | "+b+" | "+c);
        
    }
    
}
