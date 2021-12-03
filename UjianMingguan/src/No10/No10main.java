package No10;

import java.util.ArrayList;
import java.util.List;

public class No10main {
	
	public static void main(String[] args) {
		
		List<Sekolah> sekolah = new ArrayList<Sekolah>();
		sekolah.add(new SMA());
		sekolah.add(new SMK());
		
		for (Sekolah i : sekolah) {
			System.out.println("Nama Sekolah \t: "+i.nama());
			System.out.println("Alamat Sekolah \t: "+i.alamat());
			System.out.println("Jenjang \t: "+i.jenjang());
		}
	}

}
