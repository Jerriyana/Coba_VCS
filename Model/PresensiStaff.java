package Model;

public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(String tanggal, StatusPresensi status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "NULL";
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

}
