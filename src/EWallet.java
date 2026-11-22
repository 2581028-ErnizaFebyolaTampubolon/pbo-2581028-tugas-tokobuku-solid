// EWallet adalah salah satu implementasi MetodeBayar
public class EWallet implements MetodeBayar {

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Mengembalikan nama metode
    public String nama() {
        // Nama yang tampil di struk
        return "E-Wallet (diskon 2%)";
        // Penutup method nama
    }

    // Menandakan method ini mengisi kontrak dari interface
    @Override
    // Menghitung total yang harus dibayar lewat e-wallet
    public int totalBayar(int totalBelanja) {
        // E-Wallet: diskon 2%, yaitu dikali 98 lalu dibagi 100 (pakai int, bukan 0.98)
        return totalBelanja * 98 / 100;
        // Penutup method totalBayar
    }
// Penutup class EWallet
}