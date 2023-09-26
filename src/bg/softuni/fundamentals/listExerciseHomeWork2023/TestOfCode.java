package bg.softuni.fundamentals.listExerciseHomeWork2023;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands=Integer.parseInt(scanner.nextLine());
        List<String>guestList=new ArrayList<>();

        for(int i=0;i < countCommands;i++) {
            String input = scanner.nextLine();
            String[] commandInput = input.split("\\s+");
            String guestName = commandInput[0];
            if (input.contains("not")) {
                if (guestList.contains(guestName)) {
                    guestList.remove(guestName);
                } else {
                    System.out.println("\n"+guestName + " is not in the list!");
                }
            } else {
                if (guestList.contains(guestName)) {
                    System.out.println(guestName + " is already in the list!");
                } else {
                    guestList.add(guestName);

                }
            }

            }
        for(int j= 0;j <  guestList.size();j++){
            System.out.println(guestList.get(j));
        }
    }
}
