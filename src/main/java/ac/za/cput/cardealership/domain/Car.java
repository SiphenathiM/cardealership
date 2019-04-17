package ac.za.cput.cardealership.domain;

import javafx.util.Builder;

public class Car {

    private String carID;
    private String serialNumber;

    public Car(String carID, String serialNumber) {
        this.carID = carID;
        this.serialNumber = serialNumber;
    }

    public String getCarID() {
        return carID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Car(Builder builder) {

        this.carID = builder.carID;
        this.serialNumber = builder.serialNumber;

    }

    public static class Builder {

        private String carID;
        private String serialNumber;


        public Builder carID(String carID) {
            this.carID = carID;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Car build() {
            return new Car(this);

        }
    }
}