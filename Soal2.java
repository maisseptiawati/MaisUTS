package uts2;
import java.util.Scanner;
public class Soal2 {

 
   
    public static void main(String[] args) {
       
       Soal2 soal2 = new Soal2();
       int N, nilai, i, min = 999, max = 1, jmlMuncul = 0 ;
       Scanner input = new Scanner (System.in);
       char pil;
       
       N = input.nextInt();
       pil = input.next().charAt(0);
       
       if (pil =='A'){
            for (i = 0; i<N; i++){
                 nilai = input.nextInt(); 
                if (nilai < min )
                    min = nilai;
                        if ( nilai == min){
                            jmlMuncul++;
                }
            }       
            System.out.println("Nilai Minimalnya adalah : " +min);
            System.out.println("Jumlah kemunculannya adalah :" +jmlMuncul);
       } else if (pil == 'B'){
        for (i = 0; i<N; i++){
                 nilai = input.nextInt(); 
                if (nilai >= max )
                    max = nilai;
                        if ( nilai == max){
                            jmlMuncul++;
                }
            }       
            System.out.println("Nilai maksimalnya adalah :" +max);
            System.out.println("Jumlah kemunculannya adalah :" +jmlMuncul); 
       }
    }
    private void pilihanA(){
   
    }
    private void pilihanB(){
        
    }
}
