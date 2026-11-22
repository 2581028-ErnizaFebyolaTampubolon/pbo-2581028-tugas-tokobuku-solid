// Class utama yang berisi method main (titik awal program)
public class TokoBukuSolid {

    // Method main: program mulai berjalan dari sini
    public static void main(String[] args) {
        // Membuat buku cetak "Belajar OOP" seharga Rp64.000
        Buku belajarOop = new BukuCetak("Belajar OOP", "Budi Santoso", 64000, 350);
        // Membuat buku cetak "Java Dasar" seharga Rp120.000
        Buku javaDasar = new BukuCetak("Java Dasar", "Rina Wati", 120000, 500);
        // Membuat buku digital "Struktur Data" seharga Rp85.000
        Buku strukturData = new BukuDigital("Struktur Data", "Andi Wijaya", 85000, 12.5);
        // Membuat buku audio "Algoritma" seharga Rp79.000
        Buku algoritma = new BukuAudio("Algoritma", "Sari Dewi", 79000, 180);

        // Membuat keranjang pertama
        Keranjang keranjang1 = new Keranjang();
        // Memasukkan buku pertama ke keranjang 1
        keranjang1.tambah(belajarOop);
        // Memasukkan buku kedua ke keranjang 1
        keranjang1.tambah(javaDasar);
        // Memasukkan buku ketiga ke keranjang 1
        keranjang1.tambah(strukturData);
        // Memasukkan buku keempat ke keranjang 1 (total Rp348.000)
        keranjang1.tambah(algoritma);

        // Membuat keranjang kedua
        Keranjang keranjang2 = new Keranjang();
        // Keranjang 2 hanya berisi Belajar OOP (total Rp64.000)
        keranjang2.tambah(belajarOop);

        // Array berisi semua pilihan metode pembayaran (polimorfisme lewat interface)
        MetodeBayar[] pilihan = { new Tunai(), new Transfer(), new EWallet(), new Voucher(100000) };

        // Membuat objek printer untuk mencetak struk
        StrukPrinter printer = new StrukPrinter();

        // Mencetak isi keranjang 1
        printer.cetakKeranjang("Keranjang 1", keranjang1);
        // Mencetak semua pilihan pembayaran untuk total keranjang 1
        printer.cetakPembayaran(keranjang1.hitungTotal(), pilihan);

        // Mencetak isi keranjang 2
        printer.cetakKeranjang("Keranjang 2", keranjang2);
        // Mencetak semua pilihan pembayaran untuk total keranjang 2
        printer.cetakPembayaran(keranjang2.hitungTotal(), pilihan);
        // Penutup method main
    }
// Penutup class TokoBukuSolid
}