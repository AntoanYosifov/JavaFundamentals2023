package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String[] filePath = scanner.nextLine().split("\\\\|\\.");
        List<String> filePathInAList = new ArrayList<>(Arrays.asList(filePath));
        Collections.reverse(filePathInAList);
        String fileName = filePathInAList.get(1);
        String fileExtension = filePathInAList.get(0);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);



    }
}
