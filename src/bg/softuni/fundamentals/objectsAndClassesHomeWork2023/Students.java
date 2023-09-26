package bg.softuni.fundamentals.objectsAndClassesHomeWork2023;

import java.util.*;

public class Students {
    public static class Student {
        private String firstName;
        private String lastName;
        private double grade;
        public Student (String firstName, String lastName, double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public double getGrade(){
            return grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i =0; i < n; i++){
            String[] studentData = scanner.nextLine().split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
        for(Student student : students){
            System.out.printf("%s %s: %.02f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
