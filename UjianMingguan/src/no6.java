import java.util.Scanner;

class BebasException extends RuntimeException {
	public BebasException(String s) {
		super(s);
	}	
}


public class no6 {
	public static void main(String[] args) {
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut gunakan catch
		
		Scanner input = new Scanner(System.in);
		System.out.print("Jenis Kelamin anda : ");
		String jenisKelamin=input.nextLine();
		System.out.print("Status anda : ");
		String status=input.nextLine();
		if (jenisKelamin.equalsIgnoreCase("Pria")) {
			if (status.equalsIgnoreCase("belum  menikah")) {
				System.out.println("Pajak anda 10%");
			} else if(status.equalsIgnoreCase("menikah")){
				System.out.println("Pajak anda 5%");
			} else {
				try {
					throw new BebasException("Input status tidak valid");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else if(jenisKelamin.equalsIgnoreCase("Wanita")) {
			if (status.equalsIgnoreCase("belum  menikah")) {
				System.out.println("Pajak anda 7%");
			} else if(status.equalsIgnoreCase("menikah")){
				System.out.println("Pajak anda 3%");
			} else {
				try {
					throw new BebasException("Input status tidak valid");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			throw new BebasException("Input jenis kelamin tidak valid ");
		}
	}
}
