
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
public class KonversiSuhu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        double celcius , fahrenheit ; 
        
        //membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //input 
        System.out.println("==program konversi suhu celcius ke fahrenheit==");
        System.out.print("input celcius:");
        celcius = baca.nextDouble();
        
        //proses
        fahrenheit = (1.8 * celcius + 32);
        
        //output
        System.out.println("fahrenheit=" + fahrenheit );
        
        
    }
    
}
