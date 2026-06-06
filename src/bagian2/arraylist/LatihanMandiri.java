
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri {

    public static void main(String[] args) {
        
        // Bagian 1
        System.out.println("=== DAFTAR BELANJA ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Tambah 4 item
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula Pasir");
        daftarBelanja.add("Telur Ayam");
        
        // Hapus item ke-2 (index 1, karena index ArrayList dimulai dari 0)
        // Dalam contoh ini, "Beras" akan dihapus
        daftarBelanja.remove(1);
        
        // Tampilkan isi list
        System.out.println("Isi daftar belanja saat ini:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }
        // Tampilkan jumlah akhir
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println();


        // Bagian 2
        System.out.println("=== MENCARI NILAI TERBESAR ===");
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        
        // Isi 5 angka secara acak
        daftarAngka.add(25);
        daftarAngka.add(78);
        daftarAngka.add(12);
        daftarAngka.add(93);
        daftarAngka.add(45);
        
        System.out.println("Daftar angka: " + daftarAngka);
        
        // Menelusuri elemen untuk mencari nilai terbesar
        int nilaiTerbesar = daftarAngka.get(0); // Set awal ke elemen pertama
        for (int i = 1; i < daftarAngka.size(); i++) {
            if (daftarAngka.get(i) > nilaiTerbesar) {
                nilaiTerbesar = daftarAngka.get(i);
            }
        }
        
        // Tampilkan nilai terbesar
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
        System.out.println();


        // Bagian 3
        System.out.println("=== FILTER NAMA AWALAN 'A' ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Tambah 6 nama
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ahmad");
        daftarNama.add("Citra");
        daftarNama.add("Anisa");
        daftarNama.add("Dedi");
        
        System.out.println("Semua nama: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");
        
        // Cetak hanya nama yang diawali huruf A
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}
