/**
 * @(#)hadiahteori2buffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.io.*;
public class hadiahteori2buffer {

    public static void main (String[] args) throws IOException {
    	String  nama;
    	int   n_tugas1,n_tugas2,n_tugas3,n_Mid,n_Final;
    	double n_RataTugas,n_akhir;
    	
    	InputStreamReader tg = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(tg);
    	
    	System.out.print("Masukkan nama mahasiswa : ");
    	nama = br.readLine();
    	System.out.print("Masukkan nilai tugas ke-1 = ");
    	n_tugas1 = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan nilai tugas ke-2 = ");
    	n_tugas2 = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan nilai tugas ke-3 = ");
    	n_tugas3 = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan nilai mid mahasiswa = ");
    	n_Mid = Integer.parseInt(br.readLine());
    	System.out.print("Masukkan nilai final mahasiswa = ");
    	n_Final = Integer.parseInt(br.readLine());
    	
    	System.out.println();
    	n_RataTugas = (n_tugas1 + n_tugas2+ n_tugas3) / 3;
    	n_akhir = (n_RataTugas * 0.3) + (n_Mid * 0.3) + (n_Final * 0.4);
    	System.out.println("Nilai Akhir Mahasiswa adalah " +n_akhir);
    	System.out.println("Nama Mahasiswa adalah " +nama);
    	
    	char grade;	
    	if (n_akhir >= 80)
    		grade = 'A';
    	
    	else if (n_akhir <=79 || n_akhir >= 60)
    		grade = 'B';
    	
    	else if (n_akhir <= 59 || n_akhir >= 50)
    		grade = 'C';
    	
    	else if (n_akhir <= 49 || n_akhir >= 40)
    		grade = 'D';
    
    	else 
    		grade = 'E';
    			System.out.println("Huruf berdasarkan nilai akhir mahasiswa =  " + grade);
    
    }
    
    
}