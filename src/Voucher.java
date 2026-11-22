// Voucher adalah implementasi MetodeBayar yang memotong harga dengan nilai tertentu
public class Voucher implements MetodeBayar {
    // Atribut nilai potongan voucher (misal 100000)
    private int nilai;

    // Constructor: nilai voucher diberikan saat objek dibuat
    public Voucher(int nilai) {
        // Mengisi atribut nilai dengan nilai dari parameter
        this.nilai = nilai;
        // Penutup constructor
    }

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Mengembalikan nama metode
    public String nama() {
        // Nama yang tampil di struk, contoh: "Voucher 100000"
        return "Voucher " + nilai;
        // Penutup method nama
    }

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Menghitung total setelah dipotong voucher
    public int totalBayar(int totalBelanja) {
        // VERSI SALAH (melanggar LSP):
        // keranjang kedua Rp64.000 - Rp100.000 = Rp-36.000 (negatif)
        // return totalBelanja - nilai;

        // VERSI BENAR (patuh kontrak):
        // Math.max memilih angka terbesar antara 0 dan hasil pengurangan,
        // jadi hasilnya tidak pernah negatif (minimal 0)
        return Math.max(0, totalBelanja - nilai);
        // Penutup method totalBayar
    }
// Penutup class Voucher
}