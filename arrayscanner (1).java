/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MANGGAR-LAPTOP
 */
public class LatihanArray1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // scanner
       // int masuk[]=new int[2];
        
        System.out.println("Proses Sortir Data");
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
        
            //perulangan sortir angka
        for(int i=0; i<ad.length-1; i++){
            int temp = ad[i];
            ad[i] = ad[ad.length - i - 1];
            ad[ad.length - i - 1] = temp;
        }
        
        // perulangan setelah sortir angka
        System.out.println("Hasil Data setelah disortir-> ");
        for(int i=0; i<ad.length; i++ ){
            System.out.println("Hasil angka ["+((i+1))+"] -> "+ad[i]);
        }
    }
}
