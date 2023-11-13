package question01;

/**
 * This Cat class will take inputs for its name, color, date of birth, 
 * distances from home, and a boolean status to indicate whether or not the 
 * cat is sleeping
 * @author Adam Cichoski
 * Assignment 3 Question 1 Cat Class
 */
public class Cat {
    private String name;
    private Color color;
    private String dateOfBirth;
    private int distance;
    private boolean status;
    Cat(String name, Color color, String dateOfBirth, int distance, boolean status){
        if(distance < 0){
            throw new IllegalArgumentException ("Distance must be greater than zero");
        }
        this.name = name;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
        this. distance = distance;
        this.status = status;
    }
    /**
     * Get cat name
     * @return cat name
     */
    public String getName(Cat this){
        return this.name;
    }
    /**
     * Sets cat name
     * @param name is the inputted name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Gets the date of birth
     * @return date of birth
     */
    public String getDob(Cat this){
        return this.dateOfBirth;
    }
    /**
     * Sets the date of birth
     * @param dateOfBirth inputted DOB
     */
    public void setDob(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    /**
     * Gets the color of the cat
     * @return color of cat
     */
    public Color getColor(Cat this){
        return this.color;
    }
    /**
     * Sets the color of the cat
     * @param color inputted color for the cat
     */
    public void setColor(Color color){
        this.color = color;
    }
    /**
     * Gets the distance from home
     * @return distance
     */
    public int getDistance(Cat this){
        return this.distance;
    }
    /**
     * Sets the distance from home
     * @param distance the new distance
     * IllegalArgumentException if the cat is asleep (status is set to true)
     */
    public void setDistance(int distance){
        if(status == true){
            throw new IllegalArgumentException (this.name + " cannot move while asleep!");
        }
        this.distance = distance;
    } 
    /**
     * Gets the status (asleep or awake = true or false)
     * @return the status
     */
    public boolean getStatus(Cat this){
        return this.status;
    }
    /**
     * Sets the status of the cat
     * @param status boolean value if the cat is asleep or not
     */
    public void setStatus(boolean status){
        this.status = status;
    }
}
