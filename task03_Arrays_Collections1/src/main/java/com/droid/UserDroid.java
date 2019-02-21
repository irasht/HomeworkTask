package com.droid;

public class UserDroid extends Droid {
    private int year;

    public UserDroid(String name, String model, int year) {
        super(name, model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UserDroid that = (UserDroid) o;

        return year == that.year;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "UserDroid{" + super.toString() +
                "year=" + year +
                '}';
    }
}
