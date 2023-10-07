package Model;

public class MatkulPilihan extends Matkul {
    private int jumlahMhsMin;

    public MatkulPilihan(String kode, int sks, String nama, int jumlahMhsMin) {
        super(kode, sks, nama);
        this.jumlahMhsMin = jumlahMhsMin;
    }

    @Override
    public String toString() {
        return "NULL";
    }

    public int getJumlahMhsMin() {
        return jumlahMhsMin;
    }

    public void setJumlahMhsMin(int jumlahMhsMin) {
        this.jumlahMhsMin = jumlahMhsMin;
    }
}
