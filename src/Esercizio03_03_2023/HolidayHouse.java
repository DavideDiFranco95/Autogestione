package Esercizio03_03_2023;

public class HolidayHouse {
    public int id;
    public String name;
    public String address;
    public int localNumber;
    public int bedsNumber;
    public int floors;

    public HolidayHouse(int id, String name, String address, int localNumber, int bedsNumber, int floors) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.localNumber = localNumber;
        this.bedsNumber = bedsNumber;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "HolidayHouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", localNumber=" + localNumber +
                ", bedsNumber=" + bedsNumber +
                ", floors=" + floors +
                '}';
    }
}
