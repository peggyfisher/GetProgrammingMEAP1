public class TShirt {
    static int nextItemNumber = 100;       //#A
    int itemNumber;        
    String size, color, graphic;
    double price = 14.99;
    static int assignNextNumber() { return nextItemNumber++; }    //#B
    void print() {System.out.println("TShirt number: "+itemNumber);} 
    public static void main(String[] args) {
        TShirt tee1 = new TShirt();    
        tee1.color="pink";             
        tee1.graphic="Duke";           
        tee1.itemNumber = assignNextNumber();  //#C
        tee1.print();     
    }    
}