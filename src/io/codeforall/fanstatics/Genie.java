package io.codeforall.fanstatics;

public class Genie {

    private int maximumWishes;
    private int grantedWishes;

    public Genie(int maximumWishes){
        this.maximumWishes = maximumWishes;
        this.grantedWishes = 0;
    }
    public int getMaximumWishes(){
        return maximumWishes;
    }

    public int getGrantedWishes(){
        return grantedWishes;
    }

    public  void grantsWishes(){
        // Can be called only "maximumWishes" times
        // Each time it is called, it needs to decrease 1 from the available wishes
        if(canGrantWish()){
            System.out.println("Your wish has been granted.");
            grantedWishes++;
            return;
        }
        System.out.println("You have no more wishes to be granted.");
    }

    public boolean canGrantWish(){
        return getGrantedWishes() < getMaximumWishes();
    }
}
