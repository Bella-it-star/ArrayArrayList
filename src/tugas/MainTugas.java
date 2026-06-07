// Nama: Halimatussa'diah
// NPM: 2410010269

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // 4. Menyimpan daftar nama mata kuliah dalam array String (ukuran tetap) dan menampilkannya
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Sistem Terdistribusi", "Jaringan Komputer"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // 3. Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 objek Mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Asep", "23100101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "23100102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "23100103", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "23100104", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "23100105", 90.0));

        // Menampilkan data awal mahasiswa
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("... Menambahkan 1 mahasiswa baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "23100106", 65.0));

        // Menampilkan kembali jumlah data terbaru
        System.out.println("Jumlah data mahasiswa terbaru: " + kelas.getJumlahMahasiswa() + " orang.");
        
        // (Opsional) Menampilkan list akhir untuk memastikan data terupdate
        System.out.println("\n=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
    }
}