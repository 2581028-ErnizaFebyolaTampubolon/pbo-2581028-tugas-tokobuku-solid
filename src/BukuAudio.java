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

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Keterangan buku audio: durasi dan diskon
    public String keterangan() {
        // Contoh hasil: "240 menit, diskon 10%"
        return durasiMenit + " menit, diskon 10%";
        // Penutup method keterangan
    }

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Harga akhir buku audio = harga dikurangi diskon 10%
    public int hargaAkhir() {
        // Dikali 90 lalu dibagi 100 (sisa 90% dari harga)
        return getHarga() * 90 / 100;
        // Penutup method hargaAkhir
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