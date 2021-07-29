/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Lenovo
 */
public class SoalNo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alamat email : ");
        String email = sc.nextLine();
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9+_.-]{1,20}@(.co.id)$");
        Pattern p2 = Pattern.compile("^[A-Za-z0-9+_.-]{1,20}@(.id)$");
        Matcher m1 = p1.matcher(email);
        Matcher m2 = p2.matcher(email);
        
        if (m1.find()){
            System.out.println("email valid");
        } else if (m2.find()){
            System.out.println("email valid");
        } else {
            System.out.println("email invalid");
        }
    }
}
