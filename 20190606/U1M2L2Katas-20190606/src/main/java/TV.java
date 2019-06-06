public class TV {

    String manufacturer;
    String model;
    int screenSize;
    String channel;
    int volume;
    boolean powered;

    public TV(String manufacturer, String model, int numSpeaker, String station, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = numSpeaker;
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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }
