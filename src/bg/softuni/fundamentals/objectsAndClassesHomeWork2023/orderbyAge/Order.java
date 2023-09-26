package bg.softuni.fundamentals.objectsAndClassesHomeWork2023.orderbyAge;

public class Order {
    private String name;
    private String identification;
    private int age;
    public Order(String name, String identification, int age){
        this.name = name;
        this.identification = identification;
        this.age = age;
    }
    public Order(){

    }
    public String getName(){
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " with ID: " + this.identification + " is " + this.age + " years old.";
    }
}
