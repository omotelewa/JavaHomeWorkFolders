public class ComputerMouse {
    String manufacturer;
    String model;
    int xposition;
    int yposition;
    int lastClickedLocation;

    public ComputerMouse(String manufacturer, String model, int xposition, int yposition, int lastClickedLocation) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.xposition = xposition;
        this.yposition = yposition;
        this.lastClickedLocation = lastClickedLocation;
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

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    public int getYposition() {
        return yposition;
    }

    public void setYposition(int yposition) {
        this.yposition = yposition;
    }

    public int getLastClickedLocation() {
        return lastClickedLocation;
    }

    public void setLastClickedLocation(int lastClickedLocation) {
        this.lastClickedLocation = lastClickedLocation;
    }




