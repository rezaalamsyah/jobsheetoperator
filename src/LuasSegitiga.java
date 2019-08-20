
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santuy
 */
public class LuasSegitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas,tinggi;
                
        
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
       
        //input
        System.out.println("== Program hitung luas Segitiga==");
        System.out.print("input alas:" );
        alas = baca.nextInt();
        System.out.print("Input tinggi:");
        tinggi = baca.nextInt();
        
        //proses 
        luas = Double.valueOf((alas * tinggi) / 2);
        
        //output
        System.out.println("luas =" + luas);
    }
    
}
