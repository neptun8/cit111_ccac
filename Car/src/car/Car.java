package car;

/**
 *
 * @author sherzod.kulnazarov
 */
public class Car {

    String Make;
    String Model;
    int Year;
    String engineSize;
    double tankSize;
    String fuelType;
    int speed = 0;
    boolean isOn;
    int gear;

    public String getMake() {
        return Make;
    }

    public String GetModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public boolean turnOn(boolean b) {
        if(b){
        isOn = true;
        }else{
            isOn=false;
        }
        return isOn;
    }
    public int getGear(){
        System.out.println("Car.getGear"+speed);
        if(speed > 0 && speed < 10){
            gear = 1;
        }
        if (speed > 11 && speed < 20) {
            gear = 2;
        }
        if (speed > 21 && speed<30) {
            gear = 3;
        }
        if (speed > 31 && speed<40 ) {
            gear = 4;
        }
        if (speed > 41 && speed < 50) {
            gear =5;
        }
        if (speed > 51){
            gear = 6;
        }
        System.out.println("Car.getGear gear "+gear);
        return gear;
    }
    public int Accelerate(int s) {
        if (isOn) {
            speed = speed + s;
        }
        return speed;
    }

    public int Deccelerate(int d) {
        if (isOn) {

            if (speed > d) {
                speed = speed - d;
            } else {
                speed = 0;
            }
        }
        return speed;
    }

    public void PrintMessage() {
        
        System.out.println("*******************");
        System.out.println("| "+Make +" "+ Model +" "+ Year + " " +engineSize);
        System.out.println("| Engine is running? "+isOn);
        System.out.println("| Current Speed: "+speed+" mph");
        System.out.println("| On: "+gear+" gear");
        
    }

}
