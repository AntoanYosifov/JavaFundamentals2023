package bg.softuni.fundamentals.objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student {
         private String firstName;
         public Student(String firstName, String lastName, int age, String city){
             this.firstName = firstName;
             this.lastName = lastName;
             this.age = age;
             this.city = city;
         }
         private String lastName;
         private int age;
         private String city;
        public String getFirstName(){
            return firstName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getCity(){
            return city;
        }
        public void setCity(String city){
            this.city = city;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while(!"end".equals(input)){
            String[] studentData = input.split(" ");


            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Student student = new Student(firstName, lastName, age, city);
            int existingIndex = findStudentIndex(students, student.getFirstName(), student.getLastName());
            if(existingIndex != -1){
                students.get(existingIndex).setCity(student.city);
                students.get(existingIndex).setAge(student.age);
            }else{
                students.add(student);
            }



            input = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();

        for(Student student : students){
            if(student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old \n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }

    }
    public static int findStudentIndex(List<Student> students, String firstName, String lastName){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFirstName().equals(firstName) &&
            students.get(i).getLastName().equals(lastName)){
                return i;
            }
        }
        return -1;
    }
}
