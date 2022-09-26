package by.itacademy.task13.control.flat.bean;

import java.util.Objects;

public class Flat {

    public static final long serialVersionUID = 1;
    private int flatNumber;
    private int flatArea;
    private int flatFloor;
    private int roomNumber;
    private String street;
    private String buildingType;
    private int usagePeriod;

    public Flat() {
    }

    public Flat(int flatNumber, int flatArea, int flatFloor, int roomNumber, String street, String buildingType, int usagePeriod) {
        this.flatNumber = flatNumber;
        this.flatArea = flatArea;
        this.flatFloor = flatFloor;
        this.roomNumber = roomNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.usagePeriod = usagePeriod;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(int flatArea) {
        this.flatArea = flatArea;
    }

    public int getFlatFloor() {
        return flatFloor;
    }

    public void setFlatFloor(int flatFloor) {
        this.flatFloor = flatFloor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getUsagePeriod() {
        return usagePeriod;
    }

    public void setUsagePeriod(int usagePeriod) {
        this.usagePeriod = usagePeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat)) return false;
        Flat flat = (Flat) o;
        return getFlatNumber() == flat.getFlatNumber() && getFlatArea() == flat.getFlatArea() && getFlatFloor() == flat.getFlatFloor() && getRoomNumber() == flat.getRoomNumber() && getUsagePeriod() == flat.getUsagePeriod() && Objects.equals(getStreet(), flat.getStreet()) && Objects.equals(getBuildingType(), flat.getBuildingType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlatNumber(), getFlatArea(), getFlatFloor(), getRoomNumber(), getStreet(), getBuildingType(), getUsagePeriod());
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatNumber=" + flatNumber +
                ", flatArea=" + flatArea +
                ", flatFloor=" + flatFloor +
                ", roomNumber=" + roomNumber +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", usagePeriod=" + usagePeriod +
                '}';
    }
}
