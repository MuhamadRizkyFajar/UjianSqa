import java.util.Iterator;
import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan nilai maksimal deret : ");
		int batas = in.nextInt();
		cetakFibonacci(batas);

	}

	static void cetakFibonacci(int batas) {
		int deret[] = new int[batas];
		deret[0] = 0;
		deret[1] = 1;

		for (int i = 2; i < deret.length; i++) {
			deret[i] = deret[i - 1] + deret[i - 2];
		}

		for (int i = 1; i < deret.length; i++) {
			System.out.print(deret[i] + " ");
		}
	}

}
