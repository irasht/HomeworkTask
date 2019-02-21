package com.droid;

import java.util.Comparator;

public class Droid {
    private String name;
    private String model;

    public Droid(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Droid droid = (Droid) o;

        if (name != null ? !name.equals(droid.name) : droid.name != null) return false;
        return model != null ? model.equals(droid.model) : droid.model == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    static class DroidComparator implements Comparator<Droid> {


        @Override
        public int compare(Droid o1, Droid o2) {
            return o2.getName().length() - o1.getName().length();
        }
    }
}
