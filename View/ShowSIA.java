package View;
import javax.swing.JOptionPane;
import Model.*;

public class ShowSIA {
    public ShowSIA(){
        show();
    }
    
    public void show(){
        Boolean menu = true;
        while(menu){
            // Tampilan Pilihan Menu
            int select = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Select: \n"
            + "1. Print User Data\n"
            + "2. Print Nilai Akhir\n"
            + "3. Print Rata-Rata NA Seluruh Mahasiswa\n"
            + "4. Print Mahasiswa Tidak Lulus matkul\n" 
            + "5. Print Matkul Ambil Untuk Mahasiswa\n"
            + "6. Print Jam Dosen Mengajar\n" 
            + "7. Pring Gaji Staff\n"
            + "8. Exit"
            , "Sistem Informasi Akademik", 
            JOptionPane.INFORMATION_MESSAGE));

            // Imput Menu Oleh User
            switch(select){
                case 1: new UserDataView();
                    break;
                case 2: new NilaiAkhirView();
                    break;
            }
        }
    }

}

