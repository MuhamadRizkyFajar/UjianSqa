import java.util.Scanner;

public class No3 {
	public static void main(String[]args) {
		double jarak, waktu;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan jarak (kilometer) = ");
		jarak = in.nextDouble();
		
		System.out.print("Masukkan waktu (jam) = ");
		waktu = in.nextDouble();
		
		hitungKecepatan(jarak, waktu);
		
		}
		static void hitungKecepatan(double jarak, double waktu) {
			double kecepatan = jarak/waktu;
			System.out.println("Kecepatan rata-rata anda adalah "+kecepatan+" km/jam");
		}

}
