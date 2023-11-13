package question03;

/**
 * This class holds the methods to create a simple circle with just a radius
 * @author Adam Cichoski 
 * Assignment06 Question03
 */
public class Circle {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    /**
     * Gets the radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Sets the radius
     * @param radius new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Prints out the radius of the circle in a string
     * @return Circle's values in a string
     */
    @Override
    public String toString() {
        return "Circle{radius=" + this.radius + "}";
    }
    /**
     * This method is meant to override the equals method in the Object class
     * for the purpose of utilizing the contains method in the ArrayList class
     * @param o is the inputted object (must be of type Circle)
     * @return Boolean contains or not Throws IllegalArgumentException if the is
     * not a circle;
     */
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Circle)){
            throw new IllegalArgumentException("Invalid Instance Type");
        }
        Circle c = (Circle) o;
        return this.getRadius() == c.getRadius();
    }
}
