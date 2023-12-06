package question04;
/**
 * This class holds the basic methods for a cirlce, and has a radius variable
 * @author Adam Cichoski
 * Assignment07 Question04
 * @param <T> is some generic type
 */
public class Circle <T> implements Comparable<T>{
    private int radius;
    /**
     * This constructor takes in and sets the radius
     * @param radius is the new radius
     */
    public Circle(int radius){
        this.radius=radius;
    }
    /**
     * This method gets the radius
     * @return radius
     */
    public int getRadius(){
        return this.radius;
    }
    /**
     * This method overrides from Comparable 
     * @param o is the inputted object
     * @return the difference between the radii of two Circles
     * @throws ClassCastException if the inputted 
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Circle){
            Circle c = (Circle) o;
            return this.radius - c.getRadius();
        }
        throw new ClassCastException("Wrong class type");
    }
    
    /**
     * Returns the radius as a string
     * @return variables as string
     */
    @Override
    public String toString(){
        return this.radius+"";
    }
    
}
