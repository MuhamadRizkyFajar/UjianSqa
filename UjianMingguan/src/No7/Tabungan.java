package No7;

public class Tabungan {
	private String nama = null;
	private int nomor=0;
	private int saldo=0;
	public Tabungan (String nama,int nomor, int saldo) {
		this.nama=nama;
		this.nomor=nomor;
		this.saldo=saldo;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getNomor() {
		return nomor;
	}
	
	public void setNomor(int nomor) {
		this.nomor = nomor;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void cekSaldo() {
		this.saldo=saldo;
		System.out.println("Saldo anda saat ini adalah "+saldo);
	}
	public void setor(int penambahan) {
		this.saldo=saldo;
		saldo +=penambahan;
		System.out.println("Setoran anda sebesar "+penambahan
				+" berhasil dilakukan, saldo anda sekarang "+saldo);
	}
	
	public void tarik(int pengurangan) {
		this.saldo=saldo;
		if (saldo>=pengurangan) {
			saldo-=pengurangan;
			System.out.println("Penarikan sebesar "+pengurangan+" berhasil dilakukan "
					+ "saldo anda sekarang "+saldo);
		} else {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		}
	}
	
}
