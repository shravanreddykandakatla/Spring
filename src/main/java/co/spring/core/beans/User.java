package co.spring.core.beans;

public class User {
    private String firstName;
    private String lastName;

    public User(){
        super();
        System.out.println("no argument constructor");
    }
    public User(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("2 argument constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println(this.firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println(this.lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void myInit1(){
        System.out.println("user-defined initialization-1");
    }
    public void myInit2(){
        System.out.println("user-defined initialization-2");
    }
    public void myDestroy(){
        System.out.println("user-defined destructor");
    }
}
