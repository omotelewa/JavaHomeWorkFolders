public class Radio{
    String manufacturer;
    String model;
    int numSpeaker;
    String station;
    int volume;
    boolean powered;

    public Radio(String manufacturer, String model, int numSpeaker, String station, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numSpeaker = numSpeaker;
        this.station = station;
        this.volume = volume;
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

    public int getNumSpeaker() {
        return numSpeaker;
    }

    public void setNumSpeaker(int numSpeaker) {
        this.numSpeaker = numSpeaker;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }
}



public class Radio{
    String manufacturer;
    String model;
    int numSpeaker;
    String station;
    int volume;
    boolean powered;