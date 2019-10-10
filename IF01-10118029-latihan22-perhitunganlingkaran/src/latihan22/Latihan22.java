/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan22;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program perhitungan lingkaran
 */
public class Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("------Perhitungan Lingkaran-----");
        System.out.print("Masukan nilai diameter lingkaran : ");
        double diameter = 0;
        while(!input.hasNextDouble()){
            System.out.println("NIlai diameter harus angka");
            System.out.print("Masukan nilai diameter lingkaran : ");
            input.next();
            
        }
        diameter = input.nextDouble();
        System.out.println("Hasil perhitungan lingkaran");
        System.out.println("Jari-jari lingkaran = " +(diameter/2)+"cm");
        System.out.println("luas lingkaran = "+ (3.14 * (diameter/2) * (diameter/2))+"cm");
        System.out.println("kelilinglingkaran = " +(3.14 * diameter));
        
    }
    
}
