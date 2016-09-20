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
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void printAuthor()
    {
        System.out.printf("%s", author);
    }
    
    public void printTitle()
    {
        System.out.printf("%s", title);
    }
    
    public void printDetails()
    {
        System.out.printf("Title: %s \nAuthor: %s \nPages: %d", title, author, pages);
        if(refNumber.length() > 0)
            System.out.printf("\nReference Number: %s", refNumber);
            else
            System.out.printf("\nReference Number: ZZZ");
    }
}
