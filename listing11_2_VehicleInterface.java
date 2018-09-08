public interface VehicleInterface {   //#A
    void move(int direction);  //#B
    void brake();                    //#B
    void accelerate(int speed);      //#B
    void slowDown(int speed);        //#B
}