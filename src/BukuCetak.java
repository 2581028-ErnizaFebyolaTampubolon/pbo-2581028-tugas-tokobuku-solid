// BukuCetak adalah turunan (subclass) dari Buku
public class BukuCetak extends Buku {
    // Atribut khusus buku cetak: berat buku dalam gram
    private int berat;

    // Constructor BukuCetak menerima data buku + berat
    public BukuCetak(String judul, String penulis, int harga, int berat) {
        // Memanggil constructor Buku untuk mengisi judul, penulis, harga
        super(judul, penulis, harga);
        // Mengisi atribut berat
        this.berat = berat;
        // Penutup constructor
    }

    // Getter untuk mengambil berat buku
    public int getBerat() {
        // Mengembalikan nilai berat
        return berat;
        // Penutup method getBerat
    }
// Penutup class BukuCetak
}