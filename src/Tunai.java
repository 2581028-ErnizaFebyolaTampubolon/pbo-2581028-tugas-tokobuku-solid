// Tunai adalah salah satu implementasi MetodeBayar
public class Tunai implements MetodeBayar {

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Mengembalikan nama metode
    public String nama() {
        // Nama yang tampil di struk
        return "Tunai";
        // Penutup method nama
    }

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Menghitung total yang harus dibayar secara tunai
    public int totalBayar(int totalBelanja) {
        // Tunai: tetap, tidak ada tambahan atau potongan
        return totalBelanja;
        // Penutup method totalBayar
    }
// Penutup class Tunai
}