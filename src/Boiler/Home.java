package Boiler;

public class Home {
    private int size;
    private int isolation;
    private String houseType;

    public Home(int size, int isolation, String houseType) {
        this.size = size;
        this.isolation = isolation;
        this.houseType = houseType;
    }

    public int getSize() {
        return size;
    }

    public int getIsolation() {
        return isolation;
    }

    public String getHouseType() {
        return houseType;
    }
}
