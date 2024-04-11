package Controller;

public class Level1 implements Level{

    @Override
    public int setSpeed() {
        return 2;
    }

    @Override
    public int setTime() {
        return 5*60*1000;
    }

    @Override
    public int nooffallingshapes() {
        return 30;
    }

    @Override
    public int controlspeed() {
        return 70;
    }

    @Override
    public int noofclowns() {
        return 1;
    }
    
}
