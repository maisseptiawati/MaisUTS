/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package minmax;
/**
*
* @author Ma'is
*/
import java.util.Scanner;
public class MinMax {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);
int bil1, bil2, bil3;
System.out.println("Program Menjumlahkan Dua Bilangan");
System.out.print("Masukan bilangan 1 = ");
bil1 = masukan.nextInt();
System.out.print("Masukan bilangan 2 = ");
bil2 = masukan.nextInt();
System.out.print("Masukan bilangan 3 = ");
bil3 = masukan.nextInt();
System.out.println();
System.out.println("Jumlah bil1+bil2 = "+(jumlah(bil1,bil2)));
System.out.println("Jumlah bil2+bil3 = "+(jumlah(bil2,bil3)));
System.out.println("Jumlah bil1+bil3 = "+(jumlah(bil1,bil3)));
String max="";
String min="";
max = (jumlah(bil1,bil2))>=(jumlah(bil2,bil3))?""+(jumlah(bil1,bil2)):(jumlah(bil2,bil3)>=bil3)?""+(jumlah(bil2,bil3)):""+(jumlah(bil1,bil3));
min = (jumlah(bil1,bil2))<=(jumlah(bil2,bil3))?""+(jumlah(bil1,bil2)):(jumlah(bil2,bil3)<=bil3)?""+(jumlah(bil2,bil3)):""+(jumlah(bil1,bil3));
System.out.println();
System.out.println("Mencari Nilai Terbesar");
System.out.println("Bilangan 1 = "+(jumlah(bil1,bil2)));
System.out.println("Bilangan 2 = "+(jumlah(bil2,bil3)));
System.out.println("Bilangan 3 = "+(jumlah(bil1,bil3)));
System.out.println();
System.out.println("Nilai Max adalah = "+max);
System.out.println("Nilai Min adalah = "+min);
}
private static int jumlah(int a, int b) {
int hasil = a + b;
return hasil;
}
}