// Interface untuk buku yang bisa diunduh (dipakai BukuDigital dan BukuAudio)
public interface BisaDiunduh {
    // Kontrak: setiap class yang implements wajib menyediakan link unduhan
    String getLinkUnduh();
// Penutup interface BisaDiunduh
}