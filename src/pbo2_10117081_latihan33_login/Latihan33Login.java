/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan33_login;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program yang digunakan user untuk masuk ke akun yang dimiliki
 */
public class Latihan33Login {

    private String usName;
    private String passWord;


    
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        Latihan33Login user = new Latihan33Login();

        System.out.print("Masukkan Username = ");
        user.usName = baca.next();
        System.out.print("Masukkan Password = ");
        user.passWord = baca.next();

        User login = new User();
        login.pengecekanLogin(user.usName, user.passWord);

        System.out.println("");
        
    }
    
}
