package co.spring.core;

import co.spring.core.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerCar {
    public static void main(String[] args) {
//        setterDependencyInjection();
//        constructorDependencyInjection();
          autowiringInjection();
    }


    private static void setterDependencyInjection() {
        ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans.xml");
        Customer customer=(Customer)context.getBean("shravan");
        System.out.println(customer.getCustomerName()+" owns a "+customer.getCar().getModel()+" which is worth of "+customer.getCar().getCost());
    }

    private static void constructorDependencyInjection() {
        ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans1.xml");
        Customer customer=(Customer)context.getBean("shravan");
        System.out.println(customer.getCustomerName()+" owns a "+customer.getCar().getModel()+" which is worth of "+customer.getCar().getCost());
    }
    private static void autowiringInjection() {
        ApplicationContext context=new ClassPathXmlApplicationContext("customer-beans2.xml");
        Customer customer=(Customer)context.getBean("shravan");
        System.out.println(customer.getCustomerName()+" owns a "+customer.getCar().getModel()+" which is worth of "+customer.getCar().getCost());
    }
}
