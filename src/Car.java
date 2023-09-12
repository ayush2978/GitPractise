public class Car {
    private int carPrice;
    private int engineSize;
    private String carBrand;

    public Car(int carPrice, int engineSize, String carBrand) {
        this.carPrice = carPrice;
        this.engineSize = engineSize;
        this.carBrand = carBrand;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carPrice=" + carPrice +
                ", engineSize=" + engineSize +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
