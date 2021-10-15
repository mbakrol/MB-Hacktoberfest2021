/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MANGGAR-LAPTOP
 */
public class LatihanArray2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // scanner
       // int masuk[]=new int[2];
        
        System.out.println("Proses Input data dengan nilai genap");
        System.out.println("Masukkan berapa angka diinginkan->");
        int n=sc.nextInt();
        
        //Deklarasi Array
        int ad[]=new int[n];
        
        // perulangan isi angka
        for(int i=0; i<ad.length; i++){
            System.out.print("Isi angka ["+(i+1)+"] -> ");
            ad [i]=sc.nextInt();
            
        }
            System.out.println();
                // Perulangan dengan mengambil nilai genap saja
            System.out.println("Angka dengan bilangan genap  :  ");
        for (int i = 0; i < ad.length; i++){
            if (ad [i] % 2 == 0) {
                // menampilkan angka dengan nilai genap
                System.out.println("Hasil angka ["+((i+1))+"] -> "+ad[i]);
                
            }
        }
    }
}
