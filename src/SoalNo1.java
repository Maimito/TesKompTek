/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SoalNo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        if (angka % 3 == 0){
            if (angka % 5 == 0){
                System.out.println("Hello World");
            } else {
                System.out.println("Hello");
            }            
        } else if (angka % 5 == 0){
            System.out.println("World");
        } else {
            System.out.println("");
        }
    }
}
