package jobsheet2;

public class BukuMain24 {
    public static void main(String[] args) {
            Buku24 bk1 = new Buku24();
            bk1.judul = "semoga lelah ini lillah";
            bk1.namapengarang = "Yuma Akhunza Kausar P";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;
    
            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();

            Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
            bk2.terjual(11);
            bk2.tampilInformasi();

            Buku24 bk3 = new Buku24("Anak Haram", "Joko", 168, 29, 65000);
            bk3.terjual(4);
            bk3.tampilInformasi();
    }
}

