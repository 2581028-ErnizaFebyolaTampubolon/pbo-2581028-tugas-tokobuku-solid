// Mengimpor ArrayList (list yang ukurannya bisa bertambah)
import java.util.ArrayList;

// SRP: Keranjang HANYA bertugas menyimpan buku dan menjumlah total
public class Keranjang {
    // List untuk menampung buku-buku yang dibeli
    private ArrayList<Buku> isi = new ArrayList<>();

    // Method untuk memasukkan satu buku ke keranjang
    public void tambah(Buku buku) {
        // Menambahkan buku ke dalam list isi
        isi.add(buku);
        // Penutup method tambah
    }

    // Method untuk mengambil semua buku di keranjang (dipakai StrukPrinter)
    public ArrayList<Buku> getIsi() {
        // Mengembalikan list isi
        return isi;
        // Penutup method getIsi
    }

    // Method untuk menghitung total harga semua buku
    public int hitungTotal() {
        // Variabel penampung total, dimulai dari 0
        int total = 0;
        // Perulangan untuk setiap buku di dalam keranjang
        for (Buku buku : isi) {
            // Menambahkan harga buku ke total
            total += buku.getHarga();
            // Penutup perulangan for
        }
        // Mengembalikan hasil total
        return total;
        // Penutup method hitungTotal
    }
// Penutup class Keranjang
}