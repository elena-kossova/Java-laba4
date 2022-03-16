/** This class is designed to store data about people* */
public class Mensch {
    /** Field: Enumerator of possible variants of a person's gender*/
    private enum Geschlecht {Male, Female}
    /** Field: Employee ID*/
    private Integer ID;
    /** Field: Employee's name*/
    private String name;
    /** Field: Employee's gender*/
    private Geschlecht gender;
    /** Field: Employee's birthday*/
    private String BirtDate;
    /** Field: Employee's Division*/
    private Abteilung Division;
    /** Field: Employee's salary*/
    private Integer salary;

    /** Adding ID
     * @param number employee ID
     * */
    public void setID(int number) {
        this.ID = number;
    }
    /** Extract id
     * @return Employee ID
     * */
    public Integer getID() {
        return ID;
    }

    /** Adding Name
     * @param nm Employee name
     * */
    public void setName(String nm) {
        this.name = nm;
    }
    /** Extracting Name
     * @return Employee name
     * */
    public String getName() {
        return name;
    }

    /** Adding Gender
     * @param gen Employee gender
     * */
    public void setGender(String gen) {
        this.gender = Geschlecht.valueOf(gen);
    }
    /** Extracting Gender
     * @return Employee's gender
     * */
    public String getGender() {
        if (gender.ordinal() == 0) return "Male";
        else return "Female";
    }

    /** Adding BirtDate
     * @param bd Employee's birthday
     * */
    public void setBirtDate(String bd) {
        this.BirtDate = bd;
    }
    /** Extracting BirtDate
     * @return Employee's birthday
     * */
    public String getBirtDate() {
        return BirtDate;
    }

    /** Adding Division ID
     * @param number ID of the employee's department
     * */
    private void setDivisionId(int number) {
        this.Division.setId(number);
    }
    /** Adding Division titel
     * @param tl The name of the employee's half-division
     * */
    private void setDivisionTitel(String tl) {
        this.Division.setTitel(tl);
    }
    /** Adding Division
     * @param name Full information about the employee's department
     * */
    public void setDivision(Abteilung name) {
        this.Division = name;
    }
    /** Extracting Division
     * @return Full information about the employee's department
     * */
    public String getDivision() {
        return this.Division.getId() + " " + this.Division.getTitel();
    }

    /** Adding Salary
     * @param sal Employee salary
     * */
    public void setSalary(int sal) {
        this.salary = sal;
    }
    /** Extracting Salary
     * @return Employee's salary
     * */
    public Integer getSalary() {
        return salary;
    }

    /** Converting employee data to a string
     * @return Employee data
     * */
    public String toString() {
        return "Arbeiter {" + "ID: " + ID + "; Name: " + name + "; Gender: " + gender + "; Birth date: " + BirtDate + ", "
                + Division.toString() + "; Salary: " + salary + "}";
    }

}