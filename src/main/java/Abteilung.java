/** The class is intended for storing data about a division
 * */
public class Abteilung {
    /** Field: Division id*/
    private Integer id;
    /** Field: Division name*/
    private String titel;

    /** Designer */
    public Abteilung(String tl){
        this.titel = tl;
        this.id = tl.hashCode();
    }

    /** Adding id
     * @param number Division id
     * */
    public void setId (int number){
        this.id = number;
    }
    /** Extract id
     * @return Division ID
     * */
    public int getId (){
        return id;
    }

    /** Adding titel
     * @param tl Division name
     * */
    public void setTitel (String tl){
        this.titel = tl;
    }
    /** Extract titel
     * @return Division name
     * */
    public String getTitel (){
        return titel;
    }

    /** Converting division data to a string
     * @return A string with data about the department
     * */
    public String toString(){
        return "ID of division: " + id + ", Name of division: " + titel;
    }
}