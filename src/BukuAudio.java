// BukuAudio turunan dari Buku dan bisa diunduh
public class BukuAudio extends Buku implements BisaDiunduh {
    // Atribut khusus buku audio: durasi dalam menit
    private int durasiMenit;

    // Constructor BukuAudio menerima data buku + durasi
    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        // Memanggil constructor Buku untuk mengisi judul, penulis, harga
        super(judul, penulis, harga);
        // Mengisi atribut durasiMenit
        this.durasiMenit = durasiMenit;
        // Penutup constructor
    }

    // Getter untuk mengambil durasi audio
    public int getDurasiMenit() {
        // Mengembalikan nilai durasiMenit
        return durasiMenit;
        // Penutup method getDurasiMenit
    }

    // Menandakan method ini mengisi kontrak dari interface BisaDiunduh
    @Override
    // Implementasi method getLinkUnduh untuk buku audio
    public String getLinkUnduh() {
        // Mengembalikan link unduhan berformat MP3 berdasarkan judul
        return "tokobuku.id/audio/" + getJudul() + ".mp3";
        // Penutup method getLinkUnduh
    }
// Penutup class BukuAudio
}