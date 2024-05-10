package co.spring.core;

import co.spring.core.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        spring1();
        spring2();
        springLifeCycle();
        springBeanInheritance();
    }

    private static void spring1() {
        //first step: initialize spring container or IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");

        int countOfBeans = context.getBeanDefinitionCount();
        System.out.println("----> " + countOfBeans);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name:beanNames){
            System.out.println(name);
        }
    }

    private static void spring2() {
        //first step: initialize spring container or IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-beans2.xml");
        System.out.println("------------------------------------------------------/n");
        // this process is used for getting the bean context from xml file
        User usr1= (User) context.getBean("user1");
        System.out.println(usr1);
        System.out.println("------------------------------------------------------");

        User usr2= (User) context.getBean("user2");
        System.out.println(usr2);
        System.out.println("------------------------------------------------------");


    }

    private static void springLifeCycle(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user-beans3.xml");
        System.out.println("------------------------------------------------------/n");

        ((ConfigurableApplicationContext)context).close();
    }

    private static void springBeanInheritance() {
        //first step: initialize spring container or IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-beans4.xml");
        System.out.println("------------------------------------------------------/n");
        // this process is used for getting the bean context from xml file
        User usr1= (User) context.getBean("user1");
        System.out.println(usr1);
        System.out.println("------------------------------------------------------");

        User usr2= (User) context.getBean("user2");
        System.out.println(usr2);
        System.out.println("------------------------------------------------------");


    }
}
