/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class Latihan3batman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GCPD gcpd = new GCPD();
        int kesempatan = 3;
        boolean lanjut = true;
        String username = "165150200111126";
        String password = "SEN";
        while (kesempatan > 0 && lanjut) {
            System.out.print("Username  : ");
            String inUsername = in.nextLine();
            System.out.print("Password  : ");
            String inPassword = in.nextLine();
            if (inUsername.equalsIgnoreCase(username)
                    && inPassword.equals(password)) {
                System.out.println("Berhasil login!!");
                System.out.println("");
                System.out.println("Menu : ");
                System.out.println("1. Lihat data penjahat");
                System.out.println("2. Input penjahat");
                System.out.println("0. Keluar");
                System.out.print("Pilihan anda : ");
                int masukan = in.nextInt();
                in.nextLine();
                switch (masukan) {
                    case 0:
                        lanjut = false;
                        System.out.println("Berhasil keluar!!!");
                        break;
                    case 1:
                        System.out.println("Melihat data penjahat :");
                        System.out.println("1. Villains");
                        System.out.println("2. Supervillains");
                        System.out.print("Pilihan : ");
                        int pilihan1 = in.nextInt();
                        in.nextLine();
                        switch (pilihan1) {
                            case 1:
                                System.out.println("Menampilkan data Villains");
                                gcpd.lihatDataPenjahat(0);
                                break;
                            case 2:
                                System.out.println("Menampilkan data Super Villains");
                                gcpd.lihatDataPenjahat(1);
                                break;
                            default:
                                System.out.println("Masukan salah. Pilih menu lagi.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Nama                  : ");
                        String a = in.nextLine();
                        System.out.print("Alias                 : ");
                        String b = in.nextLine();
                        System.out.print("Tinggi                : ");
                        int c = in.nextInt();
                        in.nextLine();
                        System.out.print("Berat                 : ");
                        int d = in.nextInt();
                        in.nextLine();
                        System.out.println("1. Laki-laki . 2. Perempuan");
                        System.out.print("Jenis Kelamin (L/P)   : ");
                        int z = in.nextInt();
                        in.nextLine();
                        char e;
                        switch (z){
                            case 1 :
                               e = 'L';
                               break;
                            case 2 :
                               e = 'P';
                               break;
                            default : e = 'L';
                        }
                        System.out.print("Tingkat Kriminal      : ");
                        String f = in.nextLine();
                        
                        gcpd.inputPenjahat(a, b, c, d, e, f);
                        System.out.println("Sukses!!!");
                        break;
                    default:
                        lanjut = true;
                        System.out.println("Masukan salah!!!");
                        break;
                }

            } else {
                kesempatan--;
                System.out.println("Gagal login. Sisa kesempatan : " + kesempatan);
            }

        }

    }
}

class GCPD {

    ArrayList<Supervillains> supervillains = new ArrayList<Supervillains>();
    ArrayList<Villains> villains = new ArrayList<Villains>();
    String nama;
    String alias;
    int tinggi, berat;
    char jenisKelamin;
    String tingkatKriminal;
    
    public void lihatDataPenjahat(int data){
        if (data==0) { //villains
            for (int i = 0; i < villains.size(); i++) {
                System.out.println("Data penjahat "+(i+1));
                System.out.println("Nama                : " + villains.get(i).getNama());
                System.out.println("Alias               : " + villains.get(i).getAlias());
                System.out.println("Tinggi              : " + villains.get(i).getTinggi());
                System.out.println("Berat               : " + villains.get(i).getBerat());
                System.out.println("Jenis Kelamin       : " + villains.get(i).getJenisKelamin());
                System.out.println("Tingkat Kriminal    : " + villains.get(i).getTingkatKriminal());
                System.out.println("===========================================");
            }
        }else{ //Super villains
            for (int i = 0; i < supervillains.size(); i++) {
                System.out.println("Data penjahat "+(i+1));
                System.out.println("Nama                : " + villains.get(i).getNama());
                System.out.println("Alias               : " + villains.get(i).getAlias());
                System.out.println("Tinggi              : " + villains.get(i).getTinggi());
                System.out.println("Berat               : " + villains.get(i).getBerat());
                System.out.println("Jenis Kelamin       : " + villains.get(i).getJenisKelamin());
                System.out.println("Tingkat Kriminal    : " + villains.get(i).getTingkatKriminal());
                System.out.println("===========================================");
            }
        }
    }

    public void inputPenjahat(String nama, String alias, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")
                || tingkatKriminal.equalsIgnoreCase("E")
                || tingkatKriminal.equalsIgnoreCase("D")) {

            villains.add(new Villains(nama, alias, tinggi, berat, jenisKelamin, tingkatKriminal));

        } else if (tingkatKriminal.equalsIgnoreCase("A")
                || tingkatKriminal.equalsIgnoreCase("B")
                || tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, alias, tinggi, berat, jenisKelamin, tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")
                || tingkatKriminal.equalsIgnoreCase("E")
                || tingkatKriminal.equalsIgnoreCase("D")) {

            villains.add(new Villains(nama, tinggi, berat, jenisKelamin, tingkatKriminal));

        } else if (tingkatKriminal.equalsIgnoreCase("A")
                || tingkatKriminal.equalsIgnoreCase("B")
                || tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, tinggi, berat, jenisKelamin, tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, char jenisKelamin, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")||
                tingkatKriminal.equalsIgnoreCase("E")||
                tingkatKriminal.equalsIgnoreCase("D")) {
            
            villains.add(new Villains(nama,jenisKelamin,tingkatKriminal));
            
        }else if (tingkatKriminal.equalsIgnoreCase("A")||
                tingkatKriminal.equalsIgnoreCase("B")||
                tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, jenisKelamin,tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")||
                tingkatKriminal.equalsIgnoreCase("E")||
                tingkatKriminal.equalsIgnoreCase("D")) {
            
            villains.add(new Villains(nama,tingkatKriminal));
            
        }else if (tingkatKriminal.equalsIgnoreCase("A")||
                tingkatKriminal.equalsIgnoreCase("B")||
                tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama,tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, String alias, char jenisKelamin, String tingkatKriminal) {
if (tingkatKriminal.equalsIgnoreCase("F")||
                tingkatKriminal.equalsIgnoreCase("E")||
                tingkatKriminal.equalsIgnoreCase("D")) {
            
            villains.add(new Villains(nama, alias, jenisKelamin,tingkatKriminal));
            
        }else if (tingkatKriminal.equalsIgnoreCase("A")||
                tingkatKriminal.equalsIgnoreCase("B")||
                tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, alias,jenisKelamin,tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, String alias, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")||
                tingkatKriminal.equalsIgnoreCase("E")||
                tingkatKriminal.equalsIgnoreCase("D")) {
            
            villains.add(new Villains(nama, alias, tingkatKriminal));
            
        }else if (tingkatKriminal.equalsIgnoreCase("A")||
                tingkatKriminal.equalsIgnoreCase("B")||
                tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, alias, tingkatKriminal));
        }
    }

    public void inputPenjahat(String nama, String alias, int tinggi, int berat, String tingkatKriminal) {
        if (tingkatKriminal.equalsIgnoreCase("F")||
                tingkatKriminal.equalsIgnoreCase("E")||
                tingkatKriminal.equalsIgnoreCase("D")) {
            
            villains.add(new Villains(nama, alias, tinggi, berat,tingkatKriminal));
            
        }else if (tingkatKriminal.equalsIgnoreCase("A")||
                tingkatKriminal.equalsIgnoreCase("B")||
                tingkatKriminal.equalsIgnoreCase("C")) {
            supervillains.add(new Supervillains(nama, alias, tinggi, berat,tingkatKriminal));
        }
    }
}

class Villains {

    String nama;
    String alias;
    int tinggi, berat;
    char jenisKelamin;
    String tingkatKriminal;

    public Villains(String nama, String alias, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, String tingkatKriminal) {
        this.nama = nama;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, String alias, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, String alias, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Villains(String nama, String alias, int tinggi, int berat, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tinggi = tinggi;
        this.berat = berat;
        this.tingkatKriminal = tingkatKriminal;
    }

    public String getNama() {
        return nama;
    }

    public String getAlias() {
        return alias;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTingkatKriminal() {
        return tingkatKriminal;
    }
    
    
}

class Supervillains {

    String nama;
    String alias;
    int tinggi, berat;
    char jenisKelamin;
    String tingkatKriminal;

    public Supervillains(String nama, String alias, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, int tinggi, int berat, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, String tingkatKriminal) {
        this.nama = nama;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, String alias, char jenisKelamin, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.jenisKelamin = jenisKelamin;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, String alias, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tingkatKriminal = tingkatKriminal;
    }

    public Supervillains(String nama, String alias, int tinggi, int berat, String tingkatKriminal) {
        this.nama = nama;
        this.alias = alias;
        this.tinggi = tinggi;
        this.berat = berat;
        this.tingkatKriminal = tingkatKriminal;
    }

    public String getNama() {
        return nama;
    }

    public String getAlias() {
        return alias;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTingkatKriminal() {
        return tingkatKriminal;
    }
    
}
