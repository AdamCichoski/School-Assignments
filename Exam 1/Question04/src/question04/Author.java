package question04;

/**
 * This class will hold the code to build an Author object
 * @author Adam Cichoski
 */
public class Author {
    private String name;
    private String dob;
    private String email;
    Author(String name, String dob, String email){
        this.name=name;
        this.dob=dob;
        this.email=email;
    }
    /**
     * Method gets the Authors name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Method gets Authors date of birth
     * @return date of birth
     */
    public String getDob() {
        return dob;
    }
    /**
     * Method gets Authors email
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Method sets the authors name
     * @param name is an inputted string for the new name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method sets a new date of birth
     * @param dob is an inputted string for the new date of birth
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    /**
     * Method sets a new email for the author
     * @param email is an inputted string for the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
