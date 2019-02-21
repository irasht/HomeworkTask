package com.droid;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Droid droid = new Droid("Indroid", "pnr-456");
        Droid userDroid = new UserDroid("Ldroid", "nyt-65", 2020);
        List<Droid> droids = new ArrayList<>(Arrays.asList(droid, userDroid));

        Ship droidShip = new Ship(droids);
        Ship userDroidShip = new Ship(Arrays.asList(userDroid));
        System.out.println(droidShip.getDroids());
        System.out.println();
        System.out.println(userDroidShip.getDroids());
    }
}
