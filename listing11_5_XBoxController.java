package videogames;

public class XBoxController implements ControllerInterface{
    public void onOff() { System.out.println("XBox turn on/off");}
    public void move() {  System.out.println("Move");}
    public void jump() { System.out.println("Jump"); }
    public void setNumberPlayers(int numPlayers) {this.numPlayers = numPlayers;}
    private int numPlayers = 0;    

 }