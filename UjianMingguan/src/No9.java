import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No9 {
	
	public static void main(String[] args) {
		
		No9 main = new No9();
		
		Scanner input= new Scanner(System.in);
		int nilai[]= new int[5];
		
		for (int i = 0; i < nilai.length; i++) {
			System.out.println("Masukkan nilai ke "+(i+1)+" : ");
			nilai[i]=input.nextInt();
		}
		
		int hasil=main.jumlahArray(nilai);
		int ukuran=nilai.length;
		boolean keterangan=main.cariNilai(nilai, hasil);
		System.out.println(keterangan);
	}
	
	public int jumlahArray(int[] nilai) {
		int sum = 0;
		for (int i = 0; i<nilai.length; i++) {
			sum += nilai[i];
		}
		return sum;
	}
	public boolean cariNilai(int[] arr, int nilai) {
		for (int x = 0; x<arr.length; x++) {
			if (arr[x] == nilai) 
				return true;
			
		}
		return false;
	}

	
}
