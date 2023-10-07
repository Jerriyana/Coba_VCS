package Controller;

import java.util.ArrayList;
import Model.*;

public class Controller {
    // No 1. Print User Data
    public String printUserData(String nama, ArrayList<User> listUser) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getNama().equalsIgnoreCase(nama)) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            String status = "";
            if (listUser.get(index) instanceof Sarjana) {
                status = "Mahasiswa Sarjana";
            } else if (listUser.get(index) instanceof Magister) {
                status = "Mahasiswa Magister";
            } else if (listUser.get(index) instanceof Doktor) {
                status = "Mahasiswa Doktor";
            } else if (listUser.get(index) instanceof DosenTetap) {
                status = "Dosen Tetap";
            } else if (listUser.get(index) instanceof DosenHonorer) {
                status = "Dosen Honorer";
            } else if (listUser.get(index) instanceof Karyawan) {
                status = "Karyawan";
            }
            return listUser.get(index).getNama() + "\n" + status;
        } else {
            return "User tidak ditemukan";
        }
    }

    // No 2. Print Nilai Akhir (NA)
    /* // equalsIgnoreCase tidak jalan
    public Double printNilaiAkhir(String nim, String kode, ArrayList<User> list) {
            int index = 0;
            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof Mahasiswa) {
                    Mahasiswa temp = (Mahasiswa) list.get(i);
                    if (temp.getNim() == nim) {
                        index = i;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                return null;
            } else {
                double na = 0;
                Mahasiswa temp = (Mahasiswa) list.get(index);
                if (temp instanceof Sarjana) {
                    Sarjana hitung = (Sarjana) temp;
                    for (int i = 0; i < hitung.getListMatkulAmbil().size(); i++) {                        
                        if (hitung.getListMatkulAmbil().get(i).getListMatkul().equalsIgnoreCase(kode)) {
                            na = (hitung.getListMatkulAmbil().get(i).getN1() +
                                    hitung.getListMatkulAmbil().get(i).getN2() +
                                    hitung.getListMatkulAmbil().get(i).getN3()) / 3;
                            return na;
                        }
                    }
                } else if (temp instanceof Magister) {
                    Magister hitung = (Magister) temp;
                    for (int i = 0; i < hitung.getListMatkulAmbil().size(); i++) {
                        if (hitung.getListMatkulAmbil().get(i).getListMatkul().equalsIgnoreCase(kode)) {
                            na = (hitung.getListMatkulAmbil().get(i).getN1() +
                                    hitung.getListMatkulAmbil().get(i).getN2() +
                                    hitung.getListMatkulAmbil().get(i).getN3()) / 3;
                            return na;
                        }
                    }
                } else if (temp instanceof Doktor) {
                    Doktor hitung = (Doktor) temp;
                    na = (hitung.getNilaiSidang1() + output.getNilaiSidang2() + output.getNilaiSidang3()) / 3;
                    return na;
                }
                return null;
            }
    */

    // No 3. Print Rata Rata Nilai Akhir (NR)
    /* // NA nya belum dapet
    public String printRataRataNilaiAkhir(String kodeMK, ArrayList<User> list) {
        double nr = 0;
        int count = 0;
    
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                double nilaiAkhir = printNilaiAkhir(mahasiswa.getNim(), kodeMK, list);
                nr += nilaiAkhir;
                count++;
            }
        }
    
        if (count == 0) {
            return "Tidak ada Mahasiswa yang terdaftar untuk mata kuliah " + kodeMK;
        }
    
        nr = nr / count;
        return "Nilai rata-rata untuk " + kodeMK + " adalah " + nr;
    }
    */

    // No 4. Jumlah Mahasiswa yang Tidak Lulus
    
    // No 5. Print Matkul Ambil 

    // No 6. Total Jam Mengajar

    // No 7. Hitung Gaji Staff
}
