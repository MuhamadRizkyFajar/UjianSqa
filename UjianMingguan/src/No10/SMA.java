package No10;

public class SMA implements Sekolah {
	private String nama = "SMA NEGERI 4 Kota Tangerang Selatan";
	private String alamat = "Pondok Ranji - Ciputat Timur";
	private String jenjang = "Menengah Atas";
	
	public SMA() {
		this.nama=nama;
		this.alamat=alamat;
		this.jenjang=jenjang;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJenjang() {
		return jenjang;
	}
	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}
	@Override
	public String nama() {
		// TODO Auto-generated method stub
		return this.nama;
	}
	@Override
	public String alamat() {
		// TODO Auto-generated method stub
		return this.alamat;
	}
	@Override
	public String jenjang() {
		// TODO Auto-generated method stub
		return this.jenjang;
	}
	
	
}
