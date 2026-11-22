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

    // Method untuk menghitung ongkos kirim: Rp5.000 per 500 gram (dibulatkan ke atas)
    public int ongkir() {
        // 400 gram -> 1 x 5000 = Rp5.000, 750 gram -> 2 x 5000 = Rp10.000
        return (berat + 499) / 500 * 5000;
        // Penutup method ongkir
    }

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Keterangan buku cetak: berat dan ongkir
    public String keterangan() {
        // Contoh hasil: "750 gram, ongkir Rp10.000"
        return berat + " gram, ongkir " + formatRupiah(ongkir());
        // Penutup method keterangan
    }

    // Menandakan method ini menimpa method abstract dari Buku
    @Override
    // Harga akhir buku cetak = harga + ongkir
    public int hargaAkhir() {
        // Menjumlahkan harga dasar dengan ongkos kirim
        return getHarga() + ongkir();
        // Penutup method hargaAkhir
    }
// Penutup class BukuCetak
}