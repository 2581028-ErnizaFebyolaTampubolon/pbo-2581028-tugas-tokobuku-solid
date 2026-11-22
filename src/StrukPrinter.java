// Mengimpor Locale agar angka diformat gaya Indonesia (pakai titik: 348.000)
import java.util.Locale;

// SRP: StrukPrinter HANYA bertugas mencetak ke layar
public class StrukPrinter {

    // Method untuk mencetak isi keranjang beserta totalnya
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        // Mencetak judul keranjang, misalnya "=== Keranjang 1 ==="
        System.out.println("=== " + judul + " ===");
        // Perulangan untuk setiap buku di keranjang
        for (Buku buku : keranjang.getIsi()) {
            // Mencetak judul (rata kiri 20 karakter) dan harga buku
            System.out.printf("%-20s : %s%n", buku.getJudul(), rupiah(buku.getHarga()));
            // Penutup perulangan for
        }
        // Mencetak total belanja dari keranjang
        System.out.printf("%-20s : %s%n", "Total Belanja", rupiah(keranjang.hitungTotal()));
        // Penutup method cetakKeranjang
    }

    // Method untuk mencetak semua pilihan metode pembayaran
    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        // Mencetak judul bagian pembayaran
        System.out.println("--- Pilihan Pembayaran ---");
        // Perulangan untuk setiap metode bayar (TANPA switch/if per metode)
        for (MetodeBayar metode : pilihan) {
            // Polimorfisme: nama() dan totalBayar() otomatis memanggil versi milik class aslinya
            System.out.printf("%-20s : %s%n", metode.nama(), rupiah(metode.totalBayar(totalBelanja)));
            // Penutup perulangan for
        }
        // Mencetak baris kosong sebagai pemisah
        System.out.println();
        // Penutup method cetakPembayaran
    }

    // Method bantu untuk mengubah angka menjadi teks rupiah, misal 348000 -> "Rp348.000"
    private String rupiah(int angka) {
        // %,d memberi pemisah ribuan; Locale Indonesia membuat pemisahnya titik
        return String.format(Locale.forLanguageTag("id-ID"), "Rp%,d", angka);
        // Penutup method rupiah
    }
// Penutup class StrukPrinter
}