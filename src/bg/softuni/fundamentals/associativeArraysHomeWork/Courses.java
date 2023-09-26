package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while(!"end".equals(input)){
            String[] courseData = input.split(" : ");
            String courseName = courseData[0];
            String studentName = courseData[1];
            List<String> currentStudent = courses.get(courseName);
            if(currentStudent == null){
                currentStudent = new ArrayList<>();
                courses.put(courseName, currentStudent);
            }
            currentStudent.add(studentName);

            int x = 1;

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for(String s : entry.getValue()){
                System.out.printf("-- %s\n", s);
            }
        }

    }
}
