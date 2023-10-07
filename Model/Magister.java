package Model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {    
    private String judulTesis;
    private ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<MatkulAmbil>();    

    public Magister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            String judulTesis, ArrayList<MatkulAmbil> listMatkulAmbil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulTesis = judulTesis;
        this.listMatkulAmbil = listMatkulAmbil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil(ArrayList<MatkulAmbil> listMatkulAmbil) {
        this.listMatkulAmbil = listMatkulAmbil;
    }

    @Override
    public String toString() {
        return super.toString() + "Judul Tesis" + judulTesis + "\n";
    }
}
