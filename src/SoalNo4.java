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
public class SoalNo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kata = sc.nextLine();
        
        String balik = new StringBuffer(kata).reverse().toString();
        System.out.println(balik);
    }
}
