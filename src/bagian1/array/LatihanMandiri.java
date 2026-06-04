package bagian1.array;
public class LatihanMandiri {
    public static void main(String[] args) {
        //1.Buat array berisi 6 suhu harian (bertipe double). Tampilkan suhu tertinggi dan terendah.
        // 1. Membuat array berisi 6 suhu harian (tipe double)
        double[] suhuHarian = {32.5, 28.0, 34.2, 27.5, 30.1, 31.8};

        // 2. Menginisialisasi variabel untuk suhu tertinggi dan terendah
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];

        // 3. Melakukan perulangan untuk mengecek setiap suhu di dalam array
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }

        // 4. Menampilkan hasil ke layar (Simbol ° diganti menjadi C biasa agar tidak error)
        System.out.println("Bagian 1");
        System.out.println("Data Suhu Harian:");
        for (double suhu : suhuHarian) {
            System.out.print(suhu + " C  ");
        }
        
        System.out.println("Suhu Tertinggi : " + suhuTertinggi + " C");
        System.out.println("Suhu Terendah  : " + suhuTerendah + " C");
        System.out.println("\n\n-----------------------------");
        
        //bagian 2
        // 1. Membuat array String berisi 5 nama hari
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("Bagian 2");
        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");
        
        // 2. Perulangan untuk mengecek panjang huruf setiap hari
        for (int i = 0; i < namaHari.length; i++) {
            // Memeriksa apakah jumlah huruf lebih dari 5
            if (namaHari[i].length() > 5) {
                System.out.println("- " + namaHari[i] + " (" + namaHari[i].length() + " huruf)");
                System.out.println("\n\n-----------------------------");
            }
        }
        
        //bagian 3
        // 1. Inisialisasi array angka sesuai soal
        int[] angka = {4, 8, 15, 16, 23, 42};
        
        // Variable counter untuk menghitung jumlah angka genap
        int jumlahGenap = 0;

        // 2. Perulangan untuk mengecek setiap elemen array
        for (int i = 0; i < angka.length; i++) {
            // Jika angka habis dibagi 2, berarti genap
            if (angka[i] % 2 == 0) {
                jumlahGenap++; // Tambah 1 ke counter jika ketemu angka genap
            }
        }

        // 3. Tampilkan hasil
        System.out.println("Bagian 3");
        System.out.println("Data Angka: {4, 8, 15, 16, 23, 42}");
        System.out.println("Banyak angka genap di dalamnya: " + jumlahGenap);
    }
}
  
