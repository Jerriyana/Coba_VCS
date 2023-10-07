package Model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private double honorPerSks;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen,
            ArrayList<MatkulAjar> listMatkulDiajar, double honorPerSks) {
        super(nama, alamat, ttl, telepon, nik, departemen, listMatkulDiajar);
        this.honorPerSks = honorPerSks;
    }

    public double getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(double honorPerSks) {
        this.honorPerSks = honorPerSks;
    }     
    
    @Override
    public String toString(){
        return super.toString() + "Honor Per SKS : " + honorPerSks + "\n";
    }
}
