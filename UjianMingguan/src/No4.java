import java.util.Scanner;

public class No4 {
	
	public static void main(String[]args) {
		double sisa, jarakPerLiter;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan sisa BBM dalam tangki (liter) = ");
		sisa = in.nextDouble();
		
		System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) =  ");
		jarakPerLiter = in.nextDouble();
		
		System.out.println("Kendaraan anda dapat menempuh jarak "+hitungSisaJarak(sisa, jarakPerLiter)
		+" kilometer dengan sisa BBM yang ada di tangki");
		}
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}

}
