package Main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.*;
import Controller.*;
import View.*;

public class Main {
    public static ArrayList<User> listUser = new ArrayList<>();
    public static ArrayList<Matkul> listMatkul = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();

        // Presensi
        Presensi presen1 = new Presensi("06-10-2023", StatusPresensi.HADIR);
        Presensi presen2 = new Presensi("05-10-2023", StatusPresensi.ALPHA);
        Presensi presen3 = new Presensi("04-10-2023", StatusPresensi.HADIR);
        listPresensi.add(presen1);
        listPresensi.add(presen2);
        listPresensi.add(presen3);

        // Preseni Staff
        PresensiStaff presenStaff1 = new PresensiStaff("9-19-2023", StatusPresensi.HADIR, 3);
        PresensiStaff presenStaff2 = new PresensiStaff("9-20-2023", StatusPresensi.HADIR, 2);
        PresensiStaff presenStaff3 = new PresensiStaff("9-21-2023", StatusPresensi.HADIR, 4);
        listPresensiStaff.add(presenStaff1);
        listPresensiStaff.add(presenStaff2);
        listPresensiStaff.add(presenStaff3);

        // Mata Kuliah
        Matkul mk1 = new Matkul("IF2-01", 2, "Sisber");
        Matkul mk2 = new Matkul("IF2-02", 3, "Praktikum Basdat");
        Matkul mk3 = new Matkul("IF2-03", 1, "Basdat");
        listMatkul.add(mk1);
        listMatkul.add(mk2);
        listMatkul.add(mk3);

        // List Mata Kuliah Ambil
        listMatkulAmbil.add(new MatkulAmbil(listPresensi, listMatkul, 80.5f, 83.6f, 77.0f));
        listMatkulAmbil.add(new MatkulAmbil(listPresensi, listMatkul, 65.0f, 66.7f, 89.9f));
        listMatkulAmbil.add(new MatkulAmbil(listPresensi, listMatkul, 87.3f, 75.5f, 80.9f));

        // Mahasiswa Sarjana
        Sarjana sarjana1 = new Sarjana("Biore", "Baleendah", "Bandung 10 Januari 2004", "082101230456", "1122001",
                "Informatika", listMatkulAmbil);
        Sarjana sarjana2 = new Sarjana("Detol", "Dipatiukur", "Bandung 15 Januari 2004", "082101230457", "1122002",
                "SCM", listMatkulAmbil);
        Sarjana sarjana3 = new Sarjana("Nuvo", "Bojong Soang", "Bandung 20 Januari 2004", "082101230458", "1122003",
                "Teknik Industri", listMatkulAmbil);

        // Mahasiswa Magister
        Magister magister1 = new Magister("Honda", "Dayeuhkolot", "Bandung 25 Januari 2000", "082101230459", "8122001",
                "Managemen", "Tesis 1", listMatkulAmbil);
        Magister magister2 = new Magister("Vario", "Dipatiukur", "Bandung 30 Januari 2000", "082101230460", "8122002",
                "Managemen", "Tesis 2", listMatkulAmbil);
        Magister magister3 = new Magister("Beat", "Soekarno Hatta", "Bandung 5 Februari 2000", "082101230461",
                "8122003", "Managemen", "Tesis 3", listMatkulAmbil);

        // Mahasiswa Doktor
        Doktor doktor1 = new Doktor("Dedo", "Cijeurah", "Bandung 10 Februari 1995", "082101230462", "9122001",
                "Ilmu Komputer", "Disertasi1", 70, 80, 90);
        Doktor doktor2 = new Doktor("Dodi", "Cibereum", "Bandung 15 Februari 1995", "082101230463", "9122002",
                "Ilmu Komputer", "Disertasi2", 75, 80, 85);
        Doktor doktor3 = new Doktor("Pedro", "Margaasih", "Bandung 20 Februari 1995", "082101230464", "9122003",
                "Ilmu Komputer", "Disertasi3", 80, 75, 89);

        // List User
        listUser.add(sarjana1);
        listUser.add(sarjana2);
        listUser.add(sarjana3);
        listUser.add(magister1);
        listUser.add(magister2);
        listUser.add(magister3);
        listUser.add(doktor1);
        listUser.add(doktor2);
        listUser.add(doktor3);
        
        new ShowSIA();                
    }
}
