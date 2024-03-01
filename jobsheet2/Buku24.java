package jobsheet2;

public class Buku24 {
    
    String namapengarang, judul;
int halaman,stok,harga;

public Buku24() {
}
public Buku24 (String jud, String pg, int hal, int stok, int har) {
    judul = jud;
    namapengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
}
    void tampilInformasi() {
        System.out.println("Judul \t\t : " + judul);
        System.out.println("Pengarang \t : " + namapengarang);
        System.out.println("Jumlah halaman \t : " + halaman);
        System.out.println("Sisa stok \t : " + stok);
        System.out.println("Harga Rp \t : " + harga);
        }
        void terjual(int jml) {
        stok -= jml;
        }
        void restock(int jml) {
        stok += jml;
        }
        void gantiHarga (int hrg) {
        harga = hrg;

        
        } 

    }