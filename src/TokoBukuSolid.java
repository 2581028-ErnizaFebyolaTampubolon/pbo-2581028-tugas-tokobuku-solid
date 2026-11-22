// Class utama yang berisi method main (titik awal program)
public class TokoBukuSolid {

    // Method main: program mulai berjalan dari sini
    public static void main(String[] args) {
        // Membuat buku cetak: harga Rp120.000, berat 750 gram
        Buku pemrogramanJava = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        // Membuat buku cetak: harga Rp95.000, berat 400 gram
        Buku algoritmaDasar = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        // Membuat buku digital: harga Rp80.000, ukuran 12.5 MB
        Buku belajarOop = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        // Membuat buku audio: harga Rp60.000, durasi 240 menit
        Buku kisahProgrammer = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        // Membuat keranjang pertama
        Keranjang keranjang1 = new Keranjang();
        // Memasukkan buku pertama ke keranjang 1
        keranjang1.tambah(pemrogramanJava);
        // Memasukkan buku kedua ke keranjang 1
        keranjang1.tambah(algoritmaDasar);
        // Memasukkan buku ketiga ke keranjang 1
        keranjang1.tambah(belajarOop);
        // Memasukkan buku keempat ke keranjang 1 (total Rp348.000)
        keranjang1.tambah(kisahProgrammer);

        // Membuat keranjang kedua
        Keranjang keranjang2 = new Keranjang();
        // Keranjang 2 hanya berisi Belajar OOP (total Rp64.000)
        keranjang2.tambah(belajarOop);

        // Array berisi semua pilihan metode pembayaran (polimorfisme lewat interface)
        MetodeBayar[] pilihan = { new Tunai(), new Transfer(), new EWallet(), new Voucher(100000) };

        // Membuat objek printer untuk mencetak struk
        StrukPrinter printer = new StrukPrinter();

        // Mencetak isi keranjang pertama
        printer.cetakKeranjang("KERANJANG PERTAMA", keranjang1);
        // Mencetak semua pilihan pembayaran untuk total keranjang pertama
        printer.cetakPembayaran(keranjang1.hitungTotal(), pilihan);

        // Mencetak isi keranjang kedua
        printer.cetakKeranjang("KERANJANG KEDUA", keranjang2);
        // Mencetak semua pilihan pembayaran untuk total keranjang kedua
        printer.cetakPembayaran(keranjang2.hitungTotal(), pilihan);
        // Penutup method main
    }
// Penutup class TokoBukuSolid
}