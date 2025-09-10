package com.mycompany.pbo_posttest1_rizqy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> daftarMusik = new ArrayList<>();
        int pilihan = 0;

        System.out.println("======================================================");
        System.out.println("Selamat Datang Rizqy di Daftar Musik Hipdut Favoritmu");
        System.out.println("======================================================");

        while (pilihan != 5) {
            System.out.println("\n===== MANAJEMEN DAFTAR MUSIK PRIBADI =====");
            System.out.println("1. Tambah Musik");
            System.out.println("2. Lihat Daftar Musik");
            System.out.println("3. Ubah Musik");
            System.out.println("4. Hapus Musik");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukin musikmu: ");
                    String musikBaru = sc.nextLine().trim();
                    if (!musikBaru.isEmpty()) {
                        daftarMusik.add(musikBaru);
                        System.out.println("Musik \"" + musikBaru + "\" berhasil dimasukin.");
                    } else {
                        System.out.println("Musik tak boleh kosong!");
                    }
                    break;

                case 2:
                    if (daftarMusik.isEmpty()) {
                        System.out.println("Loh kok kosong, cari musik dulu sana!");
                    } else {
                        System.out.println("=== Playlist Hipdut Asik ===");
                        for (int i = 0; i < daftarMusik.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMusik.get(i));
                        }
                    }
                    break;

                case 3:
                    if (daftarMusik.isEmpty()) {
                        System.out.println("Loh kok kosong, cari musik dulu sana!");
                    } else {
                        System.out.println("Pilih nomor musik yang pengen diganti:");
                        for (int i = 0; i < daftarMusik.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMusik.get(i));
                        }
                        System.out.print("Nomor: ");
                        int indexUbah = sc.nextInt();
                        sc.nextLine();

                        if (indexUbah > 0 && indexUbah <= daftarMusik.size()) {
                            System.out.print("Masukin musik baru: ");
                            String musikUbah = sc.nextLine();
                            daftarMusik.set(indexUbah - 1, musikUbah);
                            System.out.println("Musik berhasil berubah");
                        } else {
                            System.out.println("Salah nomor");
                        }
                    }
                    break;

                case 4:
                    if (daftarMusik.isEmpty()) {
                        System.out.println("Loh kok kosong, cari musik dulu sana!");
                    } else {
                        System.out.println("Pilih nomor musik yang ingin dihapus:");
                        for (int i = 0; i < daftarMusik.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMusik.get(i));
                        }
                        System.out.print("Nomor: ");
                        int indexHapus = sc.nextInt();
                        sc.nextLine();

                        if (indexHapus > 0 && indexHapus <= daftarMusik.size()) {
                            daftarMusik.remove(indexHapus - 1);
                            System.out.println("Musik dihapus");
                        } else {
                            System.out.println("Salah nomor");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Bye-bye beb, see you later");
                    break;

                default:
                    System.out.println("Salah pilih");
            }
        }

        sc.close();
    }
}
