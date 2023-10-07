package Model;

public class Presensi {
    private String tanggal;
    private StatusPresensi status;

    public Presensi(String tanggal, StatusPresensi status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public StatusPresensi getStatus() {
        return status;
    }

    public void setStatus(StatusPresensi status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + ", Status: " + status;
    }
}
