
class Autobiography extends Book {

    public Autobiography(String title, String publisher, String authors[], int numPages) {
        super(title, publisher, authors, numPages);
    }

    public void printPage(int year) {
        System.out.println("Print page from autobiography, " + year);
    }
}
