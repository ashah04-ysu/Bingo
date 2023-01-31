
package bingo;

import java.util.Random;


public class Bnumbers {
    private int bnumber;
    private int inumber;
    private int nnumber;
    private int gnumber;
    private int onumber;
    
    
    
    
    public int getBnumber(){
        this.bnumber = new Random().nextInt(15);
        return bnumber;
    }

    public int getInumber() {
        this.inumber = new Random().nextInt(30)+15;
        return inumber;
    }

    public int getNnumber() {
        this.nnumber = new Random().nextInt(45)+30;
        return nnumber;
    }

    public int getGnumber() {
        this.gnumber = new Random().nextInt(60)+45;
        return gnumber;
    }

    public int getOnumber() {
        this.onumber = new Random().nextInt(75)+60;
        return onumber;
    }
    
    
    
}
