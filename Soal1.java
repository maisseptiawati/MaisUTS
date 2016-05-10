package uts;
import java.util.Scanner;
public class Soal1 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       float ip, totalIP = 0, nilaiRata = 0;
       Soal1 soal1 = new Soal1();
       int jmlMhs = 0, jmlMhsLls = 0, jmlMhsTdls = 0;
       
       // input dan soal 1 sebagai aspek OO
       ip = input.nextFloat();
       while (ip != -999){
           if(soal1.isWithinRange(ip, 0, 4)== 1) {
               jmlMhs++;
               if (soal1.isWithinRange(ip, 2.75, 4)== 1){
                   jmlMhsLls++;
               }else {
                   jmlMhsTdls++;
               }
               totalIP = totalIP + ip;
               nilaiRata = totalIP / jmlMhs;
           }
           ip = input.nextFloat();
            
       }
       System.out.println("Jumlah Mahasiswanya adalah:" +' '+ jmlMhs);
       System.out.println("Jumlah Mahasiswa yang Lulus adalah :" +' '+ jmlMhsLls);
       System.out.println("Jumlah Mahasiswa yang Tidak Lulus adalah :" +' '+ jmlMhsTdls);
       System.out.println("Total nilai adalah :" +' '+totalIP);
       System.out.println("Rata-rata Nilai adalah :" +' '+ nilaiRata);
       
    }
    //isWithin Range sebagai aspek OO
    int isWithinRange(float X, double min, float max){//fungsi yang independen yakni bisa digunakan oleh apapun
            if (X <= max && X >= min){
        return 1;
    }else {
    return 0;
}
}
}