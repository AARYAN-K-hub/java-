abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
}

class Remote extends TV {
    @Override
    void turnOn(){
        System.out.println("Tv is turned ON.");
    }
    @Override
    void turnOff(){
        System.out.println("Tv is turned OFF.");
    }
}

public class Abstraction{
    public static void main(String[] args){
        TV r = new Remote();
        r.turnOn();
        r.turnOff();
    }
}
