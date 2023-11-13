package question04;
/**
 * This class will hold the code to build a book object
 * @author Adam Cichoski
 */
public class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    Book(String name,Author author, double price, int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock = qtyInStock;
    }
    /**
     * Method gets the books name
     * @return book name
     */
    public String getName() {
        return name;
    }
    /**
     * Method gets Author object
     * @return Author object
     */
    public Author getAuthor() {
        return author;
    }
    /**
     * Method gets book price
     * @return book price
     */
    public double getPrice() {
        return price;
    }
    /**
     * Method gets number of books in stock
     * @return quantity of books in stock
     */
    public int getQtyInStock() {
        if(this.qtyInStock ==0){
            throw new IllegalArgumentException ("Out Of Stock!");
        }
        return qtyInStock;
    }
    /**
     * Method sets the name of the book
     * @param name a String for the new name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method sets the Author object for the book
     * @param author a new Author object
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
    /**
     * Method sets the price of the book
     * @param price the new double price of the book
     * IllegalArgumentException if the price is less than zero
     */
    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("Price of book cannot be negative");
        }
        this.price = price;
    }
    /**
     * Method sets the quantity of books in stock
     * @param qtyInStock new quantity in stock
     * IllegalArgumentException when the stock is negative
     */
    public void setQtyInStock(int qtyInStock) {
        if(qtyInStock<0){
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.qtyInStock = qtyInStock;
    }
    
}
