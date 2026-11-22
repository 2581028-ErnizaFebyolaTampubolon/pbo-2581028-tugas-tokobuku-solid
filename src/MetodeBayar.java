// OCP: interface untuk semua metode pembayaran
// Metode baru cukup dibuat class baru yang implements interface ini, tanpa mengubah class lain
public interface MetodeBayar {
    // Kontrak: mengembalikan nama metode pembayaran untuk ditampilkan di struk
    String nama();

    // KONTRAK totalBayar (LSP):
    // - menerima totalBelanja (>= 0)
    // - hasilnya TIDAK PERNAH NEGATIF (minimal 0)
    // Semua class yang implements MetodeBayar wajib mematuhi kontrak ini
    int totalBayar(int totalBelanja);
// Penutup interface MetodeBayar
}