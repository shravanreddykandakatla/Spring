package co.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

    private String customerName;
    @Autowired
    private Car car;

    public Customer(){
        super();
        System.out.println("No Argument Constructor");
    }

    public Customer(String customerName, Car car) {
        super();
        System.out.println("2 Argument Constructor");
        this.customerName = customerName;
        this.car = car;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
        System.out.println("setter");
    }

    public Car getCar() {
        return car;
    }

//    public void setCar(Car car) {
//        this.car = car;
//    }
}
