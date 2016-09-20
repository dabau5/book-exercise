/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Alex Cumins)
 * @version (September 19, 2016)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printAuthor()
    {
        System.out.printf("Author: %s", author);
    }
    
    public void printTitle()
    {
        System.out.printf("Title: %s", title);
    }
}
