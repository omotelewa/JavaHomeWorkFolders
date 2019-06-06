public class CoffeeMaker {
    String manufacturer;
    String model;
    int caraSize;
    int cupsLeft;
    boolean powered;
}
    public CoffeeMaker(String manufacturer, String model, int caraSize, int cupsLeft, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.caraSize = caraSize;
        this.cupsLeft = cupsLeft;
        this.powered = powered;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCaraSize() {
        return caraSize;
    }

    public void setCaraSize(int caraSize) {
        this.caraSize = caraSize;
    }

    public int getCupsLeft() {
        return cupsLeft;
    }

    public void setCupsLeft(int cupsLeft) {
        this.cupsLeft = cupsLeft;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }


