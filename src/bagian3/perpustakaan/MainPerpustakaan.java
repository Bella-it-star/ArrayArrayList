package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981));

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        System.out.println("== Proses Pengembalian Buku ==");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.kembalikanBuku("Laskar Pelangi");
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("Tere Liye");
    }
}