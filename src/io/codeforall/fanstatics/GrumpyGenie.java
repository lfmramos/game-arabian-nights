package io.codeforall.fanstatics;

public class GrumpyGenie extends Genie{

    public GrumpyGenie(){
        super(1);
    }
    @Override
    public boolean canGrantWish(){
       return super.getGrantedWishes() == 0;
    }
}
