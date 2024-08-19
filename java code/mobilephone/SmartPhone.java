public class SmartPhone extends MobilePhone {
    private int cameraResolution;
    private int RAMSize;
    private int ROMSize;
    private String OSVersion;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double batteryCapacity, int cameraResolution, int RAMSize, int ROMSize, String OSVersion) {
        super(brand, model, batteryCapacity);
        this.cameraResolution = cameraResolution;
        this.RAMSize = RAMSize;
        this.ROMSize = ROMSize;
        this.OSVersion = OSVersion;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setROMSize(int ROMSize) {
        this.ROMSize = ROMSize;
    }

    public int getROMSize() {
        return ROMSize;
    }

    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    public String getOSVersion() {
        return OSVersion;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Camera Resolution: " + cameraResolution + "MP");
        System.out.println("RAM Size: " + RAMSize + "GB");
        System.out.println("ROM Size: " + ROMSize + "GB");
        System.out.println("OS Version: " + OSVersion);
    }
}
