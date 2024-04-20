package co.spring.core.beans;

import java.math.BigDecimal;

public class Car {
    private String model;
    private BigDecimal cost;

    public Car() {
        super();
    }

    public Car(String model, BigDecimal cost) {
        super();
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
