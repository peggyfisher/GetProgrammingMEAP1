package acmepublishing;
import java.util.Scanner; //#A
import java.util.ArrayList;  //#A

public class ACMEPublishing {
 public static void main(String[] args) {  //#B
    Scanner in = new Scanner(System.in);
       boolean moreAuthors = true;
       boolean moreBooks = true;
       String response;
       ArrayList<Author> authors = new ArrayList<Author>(); //#C
       ArrayList<Book> books = new ArrayList<Book>();//#C
       while (moreAuthors) {
            System.out.println("Enter author first name, last name, "
                    + "address, email, and phone number");
            String authorData = in.nextLine();  //#D
            String[] authorInfo = authorData.split(",");//#E
            Author a = new Author(authorInfo[0], authorInfo[1], authorInfo[2],
                    authorInfo[3], authorInfo[4]); //#F
            authors.add(a);  //#F
            while (moreBooks) {
                System.out.println("Enter book information: Book Title, "
                        + "Book Type (h-hardcopy, e-ebook) "
                        + "and number of pages");
                String bookData = in.nextLine();
                String[] bookInfo = bookData.split(",");  //#E
                String bookType = bookInfo[1].replaceAll(" ", ""); //#G
                int numPages = Integer.parseInt(bookInfo[2].replaceAll(" ",//#H    
                     ""));
             Book b = new Book(a.getID(), bookInfo[0],  //#F
                     bookType.charAt(0), numPages);
             books.add(b); //#F
             System.out.println("Does this author have any more books? ");
                response = in.next();
             in.nextLine();
               if (response.charAt(0) != 'Y' && response.charAt(0) != 'y') {
                    moreBooks = false;
                }
            }
            System.out.println("Is there another author? ");
            response = in.next();
            in.nextLine();
            if (response.charAt(0) != 'Y' && response.charAt(0) != 'y') {
                moreAuthors = false;
            }
            else
                moreBooks = true; //reset for next author
        }
        StringBuilder printInfo = new StringBuilder();  //#I
        for(Author a:authors) {
            printInfo.append(a.toString());
            for(Book b:books) {
                if(b.getAuthorID()==a.getID())//#J
                    printInfo.append(b.toString());
            }
        }
        System.out.println(printInfo); 
    }
}
