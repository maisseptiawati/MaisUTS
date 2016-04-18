package utsmais;

import java.util.Scanner;
import java.io.*;

public class UTSMais {
    float X, min, max;
    public static double rata;
    public static int jumlahLulus = 0 ;
    public static int jumlahTidakLulus = 0;
    double[] nilai = new double [100];
    
    int isWithinRange(float X, float min, float max){
             if (X <= 4.00 && X >= 0){
            return 1;
        }else{
         return 0;   
        }
        }
    
    public void HitungRata(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jml = input.nextDouble();
        
        double sum = 0;
        for (int i = 1; i <= jml; i++) {
            
            
                System.out.println("Nilai IPK " + i + ": " );
                nilai[i] = input.nextDouble();
                
                sum += nilai[i];
                
            }
        
        rata = sum / jml;
        int jmls = (int) (jml);
        
        System.out.println("Total nilai: " + " " + sum);
        System.out.println("IP:" + rata);
        
        if (rata >= 2.75 && rata <= 4.00)
            System.out.println("Lulus");
        else    
            System.out.println("Data IP tidak valid");
               
    }
    
    public void NilaiAkhir() {
        for (int i = 1; i <=rata; i++) {
            if (rata >= 2.75 && rata <= 4.00) {
                jumlahLulus = jumlahLulus + 1;
                               
            } else {
                jumlahTidakLulus = jumlahTidakLulus + 1;
                               
            }
        }
            
        }
   public void Panggil (){
       System.out.println("Jumlah Yang Lulus : " + jumlahLulus );
       System.out.println("Jumlah Yang Tidak Lulus : " + jumlahTidakLulus );
   }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int valid = 0;
        double min = 2.75;
        int max, X, jml;
        double ip, N;
        
        UTSMais range = new UTSMais();

        ip = input.nextDouble();
        while (ip != -999){
            ip = input.nextDouble(); 
            if (range.isWithinRange(3, 0, 4) == 1){
                valid++;
            }
            else if (ip <= min){
                ip = 0;
            }  
        }
        
        UTSMais proses = new UTSMais();
        proses.HitungRata();
        proses.NilaiAkhir();
        proses.Panggil();
    }
}
