// SRP: StrukPrinter HANYA bertugas mencetak ke layar
public class StrukPrinter {
    // Lebar garis struk (jumlah karakter per baris garis)
    private static final int LEBAR = 41;

    // Method untuk mencetak isi keranjang beserta total belanjanya
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        // Mencetak judul di tengah garis "=", contoh: "=========== KERANJANG PERTAMA ==========="
        System.out.println(judulTengah(judul, "="));
        // Perulangan untuk setiap buku di keranjang
        for (Buku buku : keranjang.getIsi()) {
            // Mencetak judul buku dan penulisnya, contoh: "Pemrograman Java (John Doe)"
            System.out.println(buku.getJudul() + " (" + buku.getPenulis() + ")");
            // Mencetak harga dasar buku
            System.out.printf("  %-11s : %s%n", "Harga", Buku.formatRupiah(buku.getHarga()));
            // Mencetak keterangan buku (berbeda tiap jenis buku)
            System.out.printf("  %-11s : %s%n", "Keterangan", buku.keterangan());
            // Mencetak harga akhir buku
            System.out.printf("  %-11s : %s%n", "Harga akhir", Buku.formatRupiah(buku.hargaAkhir()));
            // Penutup perulangan for
        }
        // Mencetak garis pemisah sepanjang LEBAR
        System.out.println("-".repeat(LEBAR));
        // Mencetak total belanja dari keranjang
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
        // Penutup method cetakKeranjang
    }

    // Method untuk mencetak semua pilihan metode pembayaran
    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        // Mencetak judul bagian pembayaran di tengah garis "-"
        System.out.println(judulTengah("PEMBAYARAN", "-"));
        // Perulangan untuk setiap metode bayar (TANPA switch/if per metode)
        for (MetodeBayar metode : pilihan) {
            // Polimorfisme: nama() dan totalBayar() otomatis memanggil versi milik class aslinya
            System.out.printf("%-20s : %s%n", metode.nama(), Buku.formatRupiah(metode.totalBayar(totalBelanja)));
            // Penutup perulangan for
        }
        // Mencetak baris kosong sebagai pemisah antar keranjang
        System.out.println();
        // Penutup method cetakPembayaran
    }

    // Method bantu: menaruh teks di tengah garis, contoh "-------------- PEMBAYARAN ---------------"
    private String judulTengah(String teks, String simbol) {
        // Sisa tempat untuk simbol = lebar - panjang teks - 2 spasi
        int sisa = LEBAR - teks.length() - 2;
        // Jumlah simbol di kiri (setengah dari sisa)
        int kiri = sisa / 2;
        // Jumlah simbol di kanan (sisanya)
        int kanan = sisa - kiri;
        // Menggabungkan simbol kiri + teks + simbol kanan
        return simbol.repeat(kiri) + " " + teks + " " + simbol.repeat(kanan);
        // Penutup method judulTengah
    }
// Penutup class StrukPrinter
}