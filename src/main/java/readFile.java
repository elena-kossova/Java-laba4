import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** The class is intended for reading data from a file
 * */
public class readFile {
    /** Field: Name of the file from which the data is being read*/
    private final String csvFilePath;

    /** Constructor */
    public readFile(String file){
        this.csvFilePath = file;
    }

    /** Creating a list of people with data for each person
     * @return List with data read from the file
     * */
    public List<Mensch> madeList() {
        List<Mensch> spisok = new ArrayList<>();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ';')) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Mensch man = new Mensch();
                man.setID(Integer.parseInt(nextLine[0]));
                man.setName(nextLine[1]);
                man.setGender(nextLine[2]);
                man.setBirtDate(nextLine[3]);
                man.setDivision(new Abteilung(nextLine[4]));
                man.setSalary(Integer.parseInt(nextLine[5]));
                spisok.add(man);
            }
        } catch (IOException f) {
            f.printStackTrace();
        }
        return spisok;
    }

}