package com.droid;

import java.util.*;

class Ship<T extends Droid> {
    List<? extends Droid> droids;

    public Ship(List<? extends Droid> droids) {
        this.droids = droids;
    }

    public List<? extends Droid> getDroids() {
        return droids;
    }

    public void setDroids(List<? extends Droid> droids) {
        this.droids = droids;
    }

}
