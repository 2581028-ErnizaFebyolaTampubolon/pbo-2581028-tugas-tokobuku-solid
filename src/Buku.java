public class Buku {
    // Atribut judul, private supaya hanya bisa diakses lewat getter (enkapsulasi)
    private String judul;
    // Atribut nama penulis buku
    private String penulis;
    // Atribut harga buku dalam rupiah
    private int harga;

    // Constructor: dijalankan saat objek buku dibuat dengan "new"
    public Buku(String judul, String penulis, int harga) {
        // Mengisi atribut judul dengan nilai dari parameter
        this.judul = judul;
        // Mengisi atribut penulis dengan nilai dari parameter
        this.penulis = penulis;
        // Mengisi atribut harga dengan nilai dari parameter
        this.harga = harga;
        // Penutup constructor
    }

    // Getter untuk mengambil judul buku
    public String getJudul() {
        // Mengembalikan nilai judul
        return judul;
        // Penutup method getJudul
    }

    // Getter BARU untuk mengambil nama penulis (pengganti tampilkanInfo)
    public String getPenulis() {
        // Mengembalikan nilai penulis
        return penulis;
        // Penutup method getPenulis
    }

    // Getter untuk mengambil harga buku
    public int getHarga() {
        // Mengembalikan nilai harga
        return harga;
        // Penutup method getHarga
    }
// Penutup class Buku (tampilkanInfo() sudah dihapus: Buku tidak lagi mencetak dirinya sendiri)
}