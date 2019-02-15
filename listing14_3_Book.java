
public class Book {

    public String title, publisher;
    public String[] authors;
    public int numPages;

    public Book(String title, String publisher, String authors[], int numPages) {
        this.title = title;
        this.authors = authors;
        this.numPages = numPages;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Publisher: " + publisher;
    }

    public void printPage() {
        System.out.println("Super class of all books");
        for (String a : authors) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Book book = new Book("Get Programming with Java", "Manning",
                new String[]{"Peg Fisher"}, 544);
        Book cookbook = new Cookbook("Amish Recipes", "Manning",
                new String[]{"Frony Yoder"}, 145);
        if (cookbook instanceof Book) {
            System.out.println("Cookbook is a type of Book");
        }
        if (book instanceof Cookbook) {
            System.out.println("Book is a type of Cookbook");

        } else {
            System.out.println("Book is not a type of Cookbook");
        }
    }

    static class Cookbook extends Book {

        public Cookbook(String title, String publisher, String authors[], int numPages) {
            super(title, publisher, authors, numPages);
        }

        public void printPage() {
            System.out.println("Print page from cookbook: " + title);

        }

        public String printPage(int x) {
            return "";
        }
    }
}

    
