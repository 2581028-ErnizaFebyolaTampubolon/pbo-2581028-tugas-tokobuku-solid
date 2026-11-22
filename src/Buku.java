// Mengimpor Locale agar angka diformat gaya Indonesia (pemisah ribuan pakai titik)
import java.util.Locale;

// Class induk untuk semua jenis buku, abstract karena tiap jenis punya aturan harga sendiri
public abstract class Buku {
    // Atribut judul, private supaya hanya bisa diakses lewat getter (enkapsulasi)
    private String judul;
    // Atribut nama penulis buku
    private String penulis;
    // Atribut harga dasar buku dalam rupiah
    private int harga;

    // Constructor: dijalankan saat objek buku dibuat dengan "new"
    public Buku(String judul, String penulis, int harga) {
        // Mengisi atribut judul dengan nilai dari parameter
        this.judul = judul;
        // Mengisi atribut penulis dengan nilai dari parameter
        this.penulis = penulis;
        // Mengisi atribut harga dengan nilai dari parameter
        this.harga = harga;
        // Penutup constructor
    }

    // Getter untuk mengambil judul buku
    public String getJudul() {
        // Mengembalikan nilai judul
        return judul;
        // Penutup method getJudul
    }

    // Getter BARU untuk mengambil nama penulis (pengganti tampilkanInfo)
    public String getPenulis() {
        // Mengembalikan nilai penulis
        return penulis;
        // Penutup method getPenulis
    }

    // Getter untuk mengambil harga dasar buku
    public int getHarga() {
        // Mengembalikan nilai harga
        return harga;
        // Penutup method getHarga
    }

    // Method abstract: tiap subclass wajib menjelaskan keterangannya sendiri
    public abstract String keterangan();

    // Method abstract: tiap subclass wajib menghitung harga akhirnya sendiri
    public abstract int hargaAkhir();

    // Method bantu: mengubah angka jadi teks rupiah, misal 120000 -> "Rp120.000"
    // protected static: bisa dipanggil Buku.formatRupiah(...) dari class lain di package yang sama
    protected static String formatRupiah(int angka) {
        // %,d memberi pemisah ribuan; Locale Indonesia membuat pemisahnya titik
        return String.format(Locale.forLanguageTag("id-ID"), "Rp%,d", angka);
        // Penutup method formatRupiah
    }
// Penutup class Buku (tampilkanInfo() sudah dihapus: Buku tidak lagi mencetak dirinya sendiri)
}