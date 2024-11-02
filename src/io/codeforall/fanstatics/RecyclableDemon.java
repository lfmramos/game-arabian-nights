package io.codeforall.fanstatics;

public class RecyclableDemon extends Genie{

    private boolean recycled;
    public RecyclableDemon(){
       super(0);
       this.recycled = false;
    }
    @Override
    public boolean canGrantWish(){
        return !recycled;
    }

    public boolean hasBeenRecycled(){
        return this.recycled;
    }
}