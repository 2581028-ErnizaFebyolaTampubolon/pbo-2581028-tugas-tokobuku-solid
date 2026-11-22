// BukuDigital turunan dari Buku dan bisa diunduh
public class BukuDigital extends Buku implements BisaDiunduh {
    // Atribut khusus buku digital: ukuran file dalam MB
    private double ukuranMB;

    // Constructor BukuDigital menerima data buku + ukuran file
    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        // Memanggil constructor Buku untuk mengisi judul, penulis, harga
        super(judul, penulis, harga);
        // Mengisi atribut ukuranMB
        this.ukuranMB = ukuranMB;
        // Penutup constructor
    }

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Keterangan buku digital: ukuran file dan diskon
    public String keterangan() {
        // Contoh hasil: "12.5 MB, diskon 20%"
        return ukuranMB + " MB, diskon 20%";
        // Penutup method keterangan
    }

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Harga akhir buku digital = harga dikurangi diskon 20%
    public int hargaAkhir() {
        // Dikali 80 lalu dibagi 100 (sisa 80% dari harga)
        return getHarga() * 80 / 100;
        // Penutup method hargaAkhir
    }

    // Menandakan method ini mengisi kontrak dari interface BisaDiunduh
    @Override
    // Implementasi method getLinkUnduh untuk buku digital
    public String getLinkUnduh() {
        // Mengembalikan link unduhan berformat PDF berdasarkan judul
        return "tokobuku.id/ebook/" + getJudul() + ".pdf";
        // Penutup method getLinkUnduh
    }
// Penutup class BukuDigital
}