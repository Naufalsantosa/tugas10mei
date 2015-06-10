package TugasOOP;

/**
 * Created by user on 10/06/2015.
 */
public class pabrik {
    private String penemu;
    private String usia;
    private char jeniskelamin;

    public pabrik(String penemu, String usia, char jeniskelamin) {
        this.penemu = penemu;
        this.usia = usia;
        this.jeniskelamin = jeniskelamin;
    }

    public String getPenemu() {
        return penemu;
    }

    public void setPenemu(String penemu) {
        this.penemu = penemu;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public char getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    @Override
    public String toString() {
        return "pabrik{" +
                "penemu='" + penemu + '\'' +
                ", usia='" + usia + '\'' +
                ", jeniskelamin=" + jeniskelamin +
                '}';
    }
}
