package TugasOOP;

/**
 * Created by user on 10/06/2015.
 */
public class yamaha {
    private String jenisMotor;
    private String Warna;
    private pabrik namapabrik;

    public yamaha(String jenisMotor, String warna, pabrik namapabrik) {
        this.jenisMotor = jenisMotor;
        Warna = warna;
        this.namapabrik = namapabrik;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public pabrik getNamapabrik() {
        return namapabrik;
    }

    public void setNamapabrik(pabrik namapabrik) {
        this.namapabrik = namapabrik;
    }

    @Override
    public String toString() {
        return "yamaha{" +
                "jenisMotor='" + jenisMotor + '\'' +
                ", Warna='" + Warna + '\'' +
                ", namapabrik=" + namapabrik +
                '}';
    }
}
