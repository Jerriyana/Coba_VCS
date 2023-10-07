package Model;

import java.util.ArrayList;

public class MatkulAjar {
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();
    private ArrayList<Matkul> listMatkul = new ArrayList<Matkul>();

    public MatkulAjar(ArrayList<PresensiStaff> listPresensiStaff, ArrayList<Matkul> listMatkul) {
        this.listPresensiStaff = listPresensiStaff;
        this.listMatkul = listMatkul;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    public ArrayList<Matkul> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<Matkul> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return "NULL";
    }
}
