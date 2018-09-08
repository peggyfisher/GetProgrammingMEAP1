public class TShirt {
    static int nextItemNumber = 100;    //#A
    int itemNumber;        
    String size, color, graphic;
    double price = 14.99;
    static int assignNextNumber() { return nextItemNumber++; }  //#B
    void print() {System.out.println("TShirt number: "+itemNumber);} //#C
    public static void main(String[] args) {
        TShirt tee1 = new TShirt();    //#D
        tee1.color="pink";             //#E
        tee1.graphic="Duke";           //#E
        tee1.itemNumber = assignNextNumber();  //#F
        print();     //#G
    }    
}