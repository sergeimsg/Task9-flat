package by.itacademy.task13.control.flat.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {

    public static final long serialVersionUID = 1;
    private List<Flat> flats;

    public City() {
        flats = new ArrayList<Flat>();

    }

    public City(List<Flat> flats) {
        this.flats = flats;
    }
    public void add(Flat flat) {

        flats.add(flat);
    }

    public void deled(Flat flat) {
        flats.remove(flat);
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(getFlats(), city.getFlats());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlats());
    }

    @Override
    public String toString() {
        return "City{" +
                "flats=" + flats +
                '}';
    }
}
