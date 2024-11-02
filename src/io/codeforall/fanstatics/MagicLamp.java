package io.codeforall.fanstatics;

public class MagicLamp {

    private int maximumGenies; // Defines the maximum number of genies each lamp can release
    private int recharges; // Counts how many times the lamp has been recycled/recharged
    public int releasedGenies = 0; // Counts how many of the possible maximumGenies the lamp has released

    public MagicLamp(int maximumGenies) {
        this.maximumGenies = maximumGenies;
        this.recharges = 0;
        this.releasedGenies = 0;
    }

    public Genie rub(int maximumWishes) {
        releasedGenies++;
        if (releasedGenies > maximumGenies) {
            // release RECYCLABLE DEMON
            Genie recyclableDemon = new RecyclableDemon();
            System.out.println("\n You summoned a DEMON. \n");
            return recyclableDemon;
        }
        if (releasedGenies % 2 == 0) {
            // release FRIENDLY GENIE
            Genie friendlyGenie = new FriendlyGenie(maximumWishes);
            System.out.println("\n You released a FRIENDLY genie. \n");
            return friendlyGenie;
        }
        // release GRUMPY GENIE
        Genie grumpyGenie = new GrumpyGenie();
        System.out.println("\n You released a GRUMPY genie. \n");
        return grumpyGenie;
    }

    public void recyclesGenie(Genie recyclableDemons) {
        if (recyclableDemons instanceof RecyclableDemon
                && !((RecyclableDemon) recyclableDemons).hasBeenRecycled()){
            // Needs to increase a counter of recharges, increasing each time the method is called
            // When called, the method needs to reset the counter releasedGenies*/
            recharges++;
        releasedGenies = 0;
        System.out.println("\n The lamp has been recharged. \n");
        return;}
        System.out.println(("\n You cannot recycle a genie.\n "));
    }
    public boolean comparesLamps(MagicLamp lamp) {
        return this.recharges == lamp.recharges
                && this.maximumGenies == lamp.maximumGenies
                && this.releasedGenies == lamp.releasedGenies;
    }
}