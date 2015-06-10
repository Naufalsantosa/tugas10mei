package TugasOOP;

/**
 * Created by user on 10/06/2015.
 */
public class testyamaha {
    public static void main(String[] args) {
        pabrik pabrikbaru = new pabrik("Naufal", "30", 'L');
        yamaha yamahabaru =new yamaha("AZ234", "Silver", pabrikbaru);

        System.out.println(yamahabaru.toString());
    }
}
