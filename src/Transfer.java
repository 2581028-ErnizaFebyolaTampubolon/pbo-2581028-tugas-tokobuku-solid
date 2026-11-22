// Transfer adalah salah satu implementasi MetodeBayar
public class Transfer implements MetodeBayar {

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Mengembalikan nama metode
    public String nama() {
        // Nama yang tampil di struk
        return "Transfer (+Rp2.500)";
        // Penutup method nama
    }

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Menghitung total yang harus dibayar lewat transfer
    public int totalBayar(int totalBelanja) {
        // Transfer: ditambah biaya admin Rp2.500
        return totalBelanja + 2500;
        // Penutup method totalBayar
    }
// Penutup class Transfer
}