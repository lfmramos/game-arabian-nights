package io.codeforall.fanstatics;

public class Main {
    //Instantiates MagicLamp, setting the maximum number of genies to be released by the lamp

    public static void main(String[] args) {

        MagicLamp magicLamp1 = new MagicLamp(2);
        MagicLamp magicLamp2 = new MagicLamp(10);

        Genie genie = magicLamp1.rub(5);
        genie.grantsWishes();
        genie.grantsWishes();

        Genie genie2 = magicLamp1.rub(3);
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();
        genie2.grantsWishes();

        Genie genie3 = magicLamp1.rub(2);
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        genie3.grantsWishes();
        magicLamp1.recyclesGenie(genie3);

        Genie genie4 = magicLamp1.rub(5);
        genie4.grantsWishes();
        genie4.grantsWishes();

        Genie genie5 = magicLamp1.rub(3);
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();
        genie5.grantsWishes();

        Genie genie6 = magicLamp1.rub(5);
        genie6.grantsWishes();
        genie6.grantsWishes();
        genie6.grantsWishes();

        boolean compare = magicLamp1.comparesLamps(magicLamp2);
        System.out.println(compare ? "\n The lamps are equal." : "\n The lamps are different.");
    }
}
