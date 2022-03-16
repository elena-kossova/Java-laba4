import java.util.ArrayList;
import java.util.List;
/** @author Elena
 *  */
public class main_Mensch {
    public static void main(String[] args) {
        readFile file = new readFile("foreign_names.csv");
        List<Mensch> ListOfMensch = new ArrayList<>(file.madeList());
        for (int i = 0; i < 6; i++) {
            System.out.println(i+1 +")" + ListOfMensch.get(i));
        }
    }
}