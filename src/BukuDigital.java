// BukuDigital turunan dari "Buku" dan bisa diunduh
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

    // Getter untuk mengambil ukuran file
    public double getUkuranMB() {
        // Mengembalikan nilai ukuranMB
        return ukuranMB;
        // Penutup method getUkuranMB
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