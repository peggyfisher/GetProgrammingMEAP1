package videogames;  //#A

public class VideoGames {   
    public static void main(String[] args) {
        ControllerInterface pc = new PCController();   //#B
        pc.onOff();   //#C
        ControllerInterface xbox = new XBoxController();//#B
        xbox.onOff();//#C
        ControllerInterface ps = new PlayStationController();//#B
        ps.onOff();//#C
        ControllerInterface nintendo = new NintendoController();//#B
        nintendo.onOff();//#C
    }   
}