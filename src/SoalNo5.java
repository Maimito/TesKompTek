/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class SoalNo5 {
    static boolean palindrom(String kata, String balik){
        if (kata.equalsIgnoreCase(balik)){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kata = sc.nextLine();
        String balik = new StringBuilder(kata).reverse().toString();
        
        if (palindrom(kata, balik)){
            System.out.println("True. "+kata+" adalah palindrom");
        } else {
            System.out.println("False. "+kata+" bukan palindrom");
        }
        
    }
}
