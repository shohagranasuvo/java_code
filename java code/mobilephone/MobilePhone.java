public class MobilePhone {
    private String brand;
    private String model;
    private double batteryCapacity;

    public MobilePhone() {
    }

    public MobilePhone(String brand, String model, double batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
    }
}
