package org.example;

import java.io.Serializable;

public class Mobile implements Serializable {
    private static final long serialVersionUID= 1L;
    private String model;
    private int price;
    //Transient field will not be serialized
    private transient MobileAvailability availability;

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MobileAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(MobileAvailability availability) {
        this.availability = availability;
    }

    public Mobile(String model, int price, MobileAvailability availability) {
        this.model = model;
        this.price = price;
        this.availability = availability;
    }
}
