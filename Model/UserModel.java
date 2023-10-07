package Model;

import java.util.ArrayList;

public class UserModel {
    private ArrayList<User> userList; // Inisialisasi dengan data pengguna

    public UserModel() {
        // Inisialisasi userList dengan data pengguna
        userList = new ArrayList<>();
        userList.add(new Mahasiswa("Gregorius Jerriyana", "Graha Rancamanyar", "Bandung 10 Mei 2004", "087611112222", "1122037", "Informatika"));                
        // Tambahkan objek pengguna lainnya ke dalam userList sesuai dengan jenisnya.
    }

    public User getUserDataByNama(String nama) {
        // Implementasikan logika untuk mencari data pengguna berdasarkan nama di sini.
        for (User user : userList) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                return user;
            }
        }
        return null; // Return null jika data tidak ditemukan
    }
}
