/**
 * Created by blilley on 5/11/2015.
 */
public class Frame {
    private int pinsKnockDown=0;
    private int numberOfTries=0;
    private boolean spare=false;
    private boolean strike=false;
    private int bonus = 0;
    public Frame(){
        spare=false;
        strike=false;

    }

    public void addRoll(int i) {
        pinsKnockDown += i;
        if(numberOfTries==2&&pinsKnockDown==10)
        {
            spare=true;
        }

    }

    public boolean fetchSpare() {
        return spare;
    }

    public int getScore() {
        return pinsKnockDown;
    }
}
