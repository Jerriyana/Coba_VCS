package Model;

import java.util.ArrayList;

public class MatkulAmbil {
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private ArrayList<Matkul> listMatkul = new ArrayList<Matkul>();
    private float n1;
    private float n2;
    private float n3;

    public MatkulAmbil(ArrayList<Presensi> listPresensi, ArrayList<Matkul> listMatkul, float n1, float n2, float n3) {
        this.listPresensi = listPresensi;
        this.listMatkul = listMatkul;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public ArrayList<Matkul> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<Matkul> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "NULL";
    }
}
