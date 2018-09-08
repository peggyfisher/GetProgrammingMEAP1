package acmepublishing;   //#A
public class Book {       
    private int authorID;   //#B
    private String bookTitle;  //#B
    private char bookType = 'h'; //h-hardcopy, e-ebook  //#B
    private int numPages;  //#B
    public Book(int authorID, String bookTitle, char bookType, int numPages) {
        this.authorID = authorID;
        this.bookTitle = bookTitle;
        if(bookType == 'e' || bookType == 'h' || bookType == 'b')  //#C
            this.bookType = bookType;    //#C
        else
            this.bookType = 'h'; //if an invalid book type is entered, //#C
                                 //it is set to hard copy   //#C
        this.numPages = numPages;  
    }
    public int getAuthorID() {return authorID;}
    //Getter and Setter methods go here
    @Override
    public String toString() {   //#D
        String type;
        if(bookType == 'e')
            type = "Electronic copy only";
        else if(bookType == 'h')
            type = "Hard copy only";
        else 
            type = "Both hard copy and electronic";
        return "\n\nBook Info: \nAuthor ID: " + authorID + "\nBook Title: "+
                bookTitle + "\nBook Type: " + bookType + "\nNumber of Pages: "
                + numPages;
 }    //#D
}