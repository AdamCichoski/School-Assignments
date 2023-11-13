package question04;
/**
 * This program will create an object from the Author and 
 * @author Adam Cichoski
 */
public class Question04 {
    public static void main(String[] args) {
        Author author = new Author("Odysseus", "September 31, 759 BCE", "supercoolguy@gmail.com");
        Book book = new Book("The Oddysey",author, 15.99, 750);
        bookStats(book);
        //Setting new information for the author
        book.setName("How To Be Like Me");
        author.setName("Narcissus");
        author.setDob("April 23, Year 0");
        author.setEmail("BetterThanU@gmail.com");
        System.out.println("New Book Info:");
        bookStats(book);
        
    }
    /**
     * This method prints out all of the information about a book (all methods)
     * @param book is a book object
     */
    public static void bookStats(Book book){
        System.out.println("Book Name:     "+ book.getName());
        System.out.println("Author Name:   " + book.getAuthor().getName());
        System.out.println("Author Email:  "+ book.getAuthor().getEmail());
        System.out.println("Stock          "+ book.getQtyInStock());
        System.out.println("Price          " +book.getPrice());
        try{
           book.setQtyInStock(-5); //set stock method has an IllegalArgumentException 
        }catch(Exception e){
            System.out.println(e.toString());
        }
        try{
            book.setPrice(-10);
        }catch(Exception e){
            System.out.println(e.toString()+"\n");
        }
    }
    
}
