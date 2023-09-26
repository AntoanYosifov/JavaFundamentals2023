package bg.softuni.fundamentals.objectsAndClassesHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
public static class Person {
    private String name;
    private int age;
    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for(int i = 0; i < n;i++ ){
            String[] personalData = scanner.nextLine().split(" ");
            String name = personalData[0];
            int age = Integer.parseInt((personalData[1]));
            Person person = new Person(name, age);
            persons.add(person);
        }
        for(int i = 0; i < persons.size();i++){
            if(persons.get(i).getAge() > 30){
                System.out.println(persons.get(i).getName() + " - " + persons.get(i).getAge());
            }
        }




    }
}
