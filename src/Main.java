import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int form, n, nim;
        String nama;
        char menu;
        float tesTulis, tesCoding, tesWawancara, tesMicro, tesJaringan;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=====MENU FORM PENDAFATARAN=====");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Pilih Form: ");
            try {
                form = input.nextInt();
                switch (form) {
                    case 1:
                        System.out.println("=====FORM PENDAFATARAN ASISTEN=====");
                        System.out.print("Banyak data yang akan dimasukkan: ");
                        n = input.nextInt();
                        Perhitungan[] hasil = new Perhitungan[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println();
                            System.out.print("NIM     : ");
                            nim = input.nextInt();
                            System.out.print("Nama    : ");
                            nama = input.nextLine();
                            input.nextLine();
                            System.out.print("Nilai Tes Tulis       : ");
                            tesTulis = input.nextFloat();
                            System.out.print("Nilai Tes Coding      : ");
                            tesCoding = input.nextFloat();
                            System.out.print("Nilai Tes Wawancara   : ");
                            tesWawancara = input.nextFloat();
                            System.out.print("Nilai Tes Microteaching: ");
                            tesMicro = input.nextFloat();
                            hasil[i] = new Perhitungan(nim, nama, tesTulis, tesCoding, tesWawancara, tesMicro);
                            hasil[i].nilaiAkhir();
                            hasil[i].keterangan();
                            System.out.println("sebagai Asisten Lab");
                        }

                        break;
                    case 2:
                        System.out.println("=====FORM PENDAFATARAN ADMIN=====");
                        System.out.print("Banyak data yang akan dimasukkan: ");
                        n = input.nextInt();
                        Perhitungan[] hasil2 = new Perhitungan[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println();
                            System.out.print("NIM     : ");
                            nim = input.nextInt();
                            System.out.print("Nama    : ");
                            nama = input.nextLine();
                            input.nextLine();
                            System.out.print("Nilai Tes Tulis       : ");
                            tesTulis = input.nextFloat();
                            System.out.print("Nilai Tes Coding      : ");
                            tesCoding = input.nextFloat();
                            System.out.print("Nilai Tes Wawancara   : ");
                            tesWawancara = input.nextFloat();
                            System.out.print("Nilai Tes Jaringan    : ");
                            tesJaringan = input.nextFloat();
                            hasil2[i] = new Perhitungan(nim, nama, tesTulis, tesCoding, tesWawancara, tesJaringan);
                            hasil2[i].nilaiAkhir();
                            hasil2[i].keterangan();
                            System.out.println("sebagai Admin Lab");
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Input harus bilangan bulat");
                input.nextLine();
            }
            System.out.println();
            System.out.print("Kembali ke menu?(y/n) : ");
            menu = input.next().charAt(0);
        }
        while (menu == 'y' || menu == 'Y');
    }
}
